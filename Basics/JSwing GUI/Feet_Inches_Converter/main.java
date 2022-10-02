//import libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;


public class main extends JFrame{

    //Accessible to All the methods
    private final JTextField footInput = new JTextField("", 15);
    private final JTextField inchInput = new JTextField("", 15);
    private final JButton convertButton1 = new JButton("Convert to Inch");
    private final JButton convertButton2 = new JButton("Convert to Foot");



    //Action Event Method for Foot to Inch Calculation
    public void actionCalculateToInch(ActionEvent e){
        double FootValue = Double.parseDouble(footInput.getText());
        double inchValue = FootValue*12;
        inchInput.setText(new DecimalFormat("#.##").format(inchValue)+"");
    }

    //Action Event Method for Inch To Foot Calculation
    public void actionCalculateToFoot(ActionEvent e){
        double InchValue = Double.parseDouble(inchInput.getText());
        double FootValue = InchValue/12;
        footInput.setText(new DecimalFormat("#.##").format(FootValue)+"");
    }

    public main(){
        super("Converter");
        setSize(200,300);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Get Containers for contents
        Container mainContainer = this.getContentPane();
        //set layout for main container
        mainContainer.setLayout(new GridLayout(3,1));


        //Create Panel 1
        JPanel panel1 = new JPanel();
        //Set Flow Layout for Panel 1
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));

        //Foot Input Area
        JLabel footText = new JLabel("Foot", SwingConstants.CENTER);
        panel1.add(footText);
        panel1.add(footInput);
        mainContainer.add(panel1);


        //Create Panel 2
        JPanel panel2 = new JPanel();
        //Set Flow Layout for Panel 2
        panel2.setLayout(new GridLayout(1,3, 5,5));

        //Buttons Area
        panel2.add(new JToolBar.Separator());
        panel2.add(convertButton1);
        panel2.add(convertButton2);
        convertButton2.addActionListener(this::actionCalculateToFoot);
        convertButton1.addActionListener(this::actionCalculateToInch);
        panel2.add(new JToolBar.Separator());
        mainContainer.add(panel2);


        //Create Panel 3
        JPanel panel3 = new JPanel();
        //Set Flow Layout for Panel 3
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));
        //Inch Input Section Objects
        JLabel inchText = new JLabel("Inch", SwingConstants.CENTER);
        panel3.add(inchText);
        panel3.add(inchInput);
        mainContainer.add(panel3);

        setVisible(true);
        setResizable(false);
        pack();

    }

    public static void main(String[] args) {
        new main();
    }
}
