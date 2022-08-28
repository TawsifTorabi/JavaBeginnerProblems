//import libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class MakeFrame extends JFrame{

    private int modeSelect;
    String BandCount = null;

    //Color Input Section Object
    private final String ColorBands[] = {"Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"};
    private final String MultiplierBand[] = {"Black", "Brown", "Red", "Orange", "Yellow", "Golden", "Silver"};
    private final String ToleranceBand[] = {"Brown", "Red", "Golden", "Silver"};
    private final String Band1Colors[] = ColorBands;
    private final String Band2Colors[] = ColorBands;
    private final String Band3Colors[] = ColorBands;
    private final String Band4Colors[] = ColorBands;
    private final String Band5Colors[] = MultiplierBand;
    private final String Band6Colors[] = ToleranceBand;

    private final JComboBox Band1Options = new JComboBox(Band1Colors);
    private final JComboBox Band2Options = new JComboBox(Band2Colors);
    private final JComboBox Band3Options = new JComboBox(Band3Colors);
    private final JComboBox Band4Options = new JComboBox(Band4Colors);
    private final JComboBox Band5Options = new JComboBox(Band5Colors);
    private final JComboBox Band6Options = new JComboBox(Band6Colors);


    //Band Count Input Section Objects
    private final JLabel BandCountText = new JLabel("Modes: ");
    private final JRadioButton BlankRadio = new JRadioButton();
    private final JRadioButton BandsSelect4 = new JRadioButton("4 Bands");
    private final JRadioButton BandsSelect5 = new JRadioButton("5 Bands");
    private final JRadioButton BandsSelect6 = new JRadioButton("6 Bands");

    //Button Section Objects
    private final JButton ClearButton = new JButton("Clear");
    private final JButton CalculateButton = new JButton("Calculate");
    private final JButton CreditButton = new JButton("Credit");

    //Status Section Objects
    private final JLabel statusOut = new JLabel("I'm Ready, Select a Mode!");


    //Method to get Selected Band Count from JRadioButtons
    public String getBandCounts() {
        if(BandsSelect4.isSelected() == true){
            BandCount = "4";
        }else if(BandsSelect5.isSelected() == true){
            BandCount = "5";
        }else if(BandsSelect6.isSelected() == true){
            BandCount = "6";
        } else {
            BandCount = null;
        }
        return BandCount;
    }


    //Method to Select Mode
    public void SelectModeInit(ActionEvent e) {
        if(getBandCounts() == null){
            statusOut.setText("Please Select Mode!");
            modeSelect = 0;
        }else{
            String bandCountsNum = getBandCounts();
            statusOut.setText(bandCountsNum + " Bands Resistor Selected");
            modeSelect = Integer.parseInt(bandCountsNum);
            showCalculator(modeSelect);
        }
    }

    public void showCalculator(int num){

    }

    //Method to clear the form
    public void actionClear(ActionEvent e){
        statusOut.setText("I'm Ready, Select a Mode!");
        BlankRadio.setSelected(true);
        BandsSelect4.setSelected(false);
        BandsSelect5.setSelected(false);
        BandsSelect6.setSelected(false);
    }


    //Action Event Method for Registration Button
    public void showCredit(ActionEvent e){
        String messageOut = "<html><body width='150px'><h2>Resistor Calculator</h2>"
                + "<p>Created by Gazi Tawsif Turabi <br>"
                + "<small>Student ID: 011 201 467</small><br>"
                + "<small>https://tawsiftorabi.github.io</small></html>";
        JOptionPane.showMessageDialog(null, String.format(messageOut, 200, 275));
    }

    //Constructor
    public MakeFrame(){
        super("Resistor Calculator");
        setSize(500,300);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Get Main Containers for contents
        Container mainContainer = this.getContentPane();
        //set layout for main container
        mainContainer.setLayout(new GridLayout(8,1));
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(0,1,1,1, Color.black));


        //Create Row Header Text
        JPanel Header = new JPanel();
        //Set Flow Layout for Header with CENTER alignment
        Header.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 1));
        JLabel HeaderText = new JLabel("Resistor Calculator", SwingConstants.CENTER);
        HeaderText.setFont(new Font("Arial", Font.PLAIN, 25));
        Header.add(HeaderText);
        mainContainer.add(Header);


        //Create Row Panel 1
        JPanel panel1 = new JPanel();
        //Set Flow Layout for Row Panel 1
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));
        //Band Count Mode Selector Area
        panel1.add(BandCountText);
        //Create button group to restrict user from selecting more than one radio option
        var btnGroup = new ButtonGroup();
        btnGroup.add(BlankRadio);
        btnGroup.add(BandsSelect4);
        btnGroup.add(BandsSelect5);
        btnGroup.add(BandsSelect6);

        //Add the radio buttons to the Jpanel container with flow layout
        BandsSelect4.addActionListener(this::SelectModeInit);
        BandsSelect5.addActionListener(this::SelectModeInit);
        BandsSelect6.addActionListener(this::SelectModeInit);
        BlankRadio.setVisible(false);
        panel1.add(BlankRadio);
        panel1.add(BandsSelect4);
        panel1.add(BandsSelect5);
        panel1.add(BandsSelect6);
        //Add the Jpanel container to the main container with grid layout
        mainContainer.add(panel1);


        //Create Calculator Panel
        JPanel SelectorPanel = new JPanel();
        //Set Flow Layout for Row Panel 1
        SelectorPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));

        //Band Count Mode Selector Area
        SelectorPanel.add(BandCountText);
        SelectorPanel.add(Band1Options);
        //Add the radio buttons to the Jpanel container with flow layout
        SelectorPanel.add(BandsSelect4);
        SelectorPanel.add(BandsSelect5);
        SelectorPanel.add(BandsSelect6);

        //Add the Jpanel container to the main container with grid layout
        mainContainer.add(SelectorPanel);



        //Create Calculator Panel
        JPanel FourBandsUI = new JPanel();
        //Set Flow Layout for Row Panel 1
        FourBandsUI.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));

        //Add the radio buttons to the Jpanel container with flow layout
        FourBandsUI.add(Band1Options);
        FourBandsUI.add(Band2Options);
        FourBandsUI.add(Band3Options);
        FourBandsUI.add(Band5Options);


        //Create Row Panel 2
        //Containing Status Text
        JPanel panel2 = new JPanel();
        //Set Flow Layout for Panel 3
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));

        //Text Area
        panel2.add(statusOut);
        mainContainer.add(panel2);

        //Create Row Panel 3
        //Containing Buttons
        JPanel panel3 = new JPanel();
        //Set Flow Layout for Panel 3
        panel3.setLayout(new GridLayout(1,3, 10,20));
        //panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));

        ClearButton.addActionListener(this::actionClear);
        //CalculateButton.addActionListener(this::Calculate);
        CreditButton.addActionListener(this::showCredit);

        //Buttons Area
        panel3.add(new JToolBar.Separator());
        panel3.add(ClearButton);
        //panel3.add(CalculateButton);
        panel3.add(CreditButton);

        panel3.add(new JToolBar.Separator());
        mainContainer.add(panel3);

        setVisible(true);
        setResizable(false);
    }
}
