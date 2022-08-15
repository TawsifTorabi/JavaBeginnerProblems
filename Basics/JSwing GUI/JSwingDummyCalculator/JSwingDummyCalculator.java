//Import Libraries
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class calculator extends JFrame {

    //Menu Objects
    private JMenu Menu1, SubMenu1, Menu2, Menu3;

    //Calculator Display Object
    private final JTextArea CalcOutput = new JTextArea(2,20);

    //Calculator Mode Selector Radio Button Objects
    private final JRadioButton Degrees = new JRadioButton("Degrees");
    private final JRadioButton Radians = new JRadioButton("Radians");
    private final JRadioButton Grads = new JRadioButton("Grads");


    public calculator(){
        super("Calculator : 011 201 467");
        setSize(640,250);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Get Containers for contents
        Container mainContainer = this.getContentPane();
        //Set Main Container Layout
        mainContainer.setLayout(new GridLayout(7,1));
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(0,1,1,1, Color.black));


        //Create Menu Bar Container
        JMenuBar menuBarContainer1 = new JMenuBar();
        setJMenuBar(menuBarContainer1);

        //Create and add menu contents
        Menu1 = new JMenu("View");
        Menu1.add(new JMenuItem("Save"));
        Menu1.add(new JMenuItem("Save As..."));
        SubMenu1 = new JMenu("Mode");
            SubMenu1.add(new JMenuItem("Normal Calculator"));
            SubMenu1.add(new JMenuItem("Scientific Calculator"));
        Menu1.add(SubMenu1);
        Menu1.add(new JMenuItem("Exit"));

        Menu2 = new JMenu("Edit");
        Menu3 = new JMenu("View");

        menuBarContainer1.add(Menu1);
        menuBarContainer1.add(Menu2);
        menuBarContainer1.add(Menu3);



        //Create Panel 1
        JPanel panel1 = new JPanel();
        //Set Flow Layout for Panel 1
        panel1.setLayout(new GridLayout(1, 5));

        //Calculator Display Area
        CalcOutput.setEditable(false);
        CalcOutput.setText("0");
        CalcOutput.setFont(new Font("Lemon Milk", Font.PLAIN, 22));
        panel1.add(CalcOutput);
        mainContainer.add(panel1);




        //Create Panel 2
        JPanel panel2 = new JPanel();
        //Set Flow Layout for Panel 2
        panel2.setLayout(new GridLayout(1, 10));

        //Create button group to restrict user from selecting more than one radio option
        var btnGroup = new ButtonGroup();
        btnGroup.add(Degrees);
        btnGroup.add(Radians);
        btnGroup.add(Grads);

        //Add the radio buttons to the Jpanel container with flow layout
        panel2.add(new JPanel());
        panel2.add(Degrees).setFont(new Font("Lemon Milk", Font.BOLD, 9));
        panel2.add(Radians).setFont(new Font("Lemon Milk", Font.BOLD, 9));
        panel2.add(Grads).setFont(new Font("Lemon Milk", Font.BOLD, 9));
        panel2.add(new JPanel());
        panel2.add(new JButton("MC"));
        panel2.add(new JButton("MR"));
        panel2.add(new JButton("MS"));
        panel2.add(new JButton("M+"));
        panel2.add(new JButton("M-"));
        mainContainer.add(panel2);




        //Create Panel 3
        JPanel panel3 = new JPanel();
        //Set Flow Layout for Panel 3
        panel3.setLayout(new GridLayout(1, 10));

        panel3.add(new JButton(" "));
        panel3.add(new JButton("lnv"));
        panel3.add(new JButton("ln"));
        panel3.add(new JButton("("));
        panel3.add(new JButton(")"));
        panel3.add(new JButton("←"));
        panel3.add(new JButton("CE"));
        panel3.add(new JButton("C"));
        panel3.add(new JButton("±"));
        panel3.add(new JButton("√"));
        mainContainer.add(panel3);



        //Create Panel 4
        JPanel panel4 = new JPanel();
        //Set Flow Layout for Panel 4
        panel4.setLayout(new GridLayout(1, 10));

        panel4.add(new JButton("lnt"));
        panel4.add(new JButton("sinh"));
        panel4.add(new JButton("sin"));
        panel4.add(new JButton("x^2"));
        panel4.add(new JButton("n!"));
        panel4.add(new JButton("7"));
        panel4.add(new JButton("8"));
        panel4.add(new JButton("9"));
        panel4.add(new JButton("/"));
        panel4.add(new JButton("%"));
        mainContainer.add(panel4);




        //Create Panel 5
        JPanel panel5 = new JPanel();
        //Set Flow Layout for Panel 5
        panel5.setLayout(new GridLayout(1, 10));

        panel5.add(new JButton("dms"));
        panel5.add(new JButton("cosh"));
        panel5.add(new JButton("cos"));
        panel5.add(new JButton("x^y"));
        panel5.add(new JButton("y√x"));
        panel5.add(new JButton("4"));
        panel5.add(new JButton("5"));
        panel5.add(new JButton("6"));
        panel5.add(new JButton("*"));
        panel5.add(new JButton("1/x"));
        mainContainer.add(panel5);


        //Create Panel 6
        JPanel panel6 = new JPanel();
        //Set Flow Layout for Panel 6
        panel6.setLayout(new GridLayout(1, 10));

        panel6.add(new JButton("π"));
        panel6.add(new JButton("tanh"));
        panel6.add(new JButton("tan"));
        panel6.add(new JButton("x^3"));
        panel6.add(new JButton("3√x"));
        panel6.add(new JButton("1"));
        panel6.add(new JButton("2"));
        panel6.add(new JButton("3"));
        panel6.add(new JButton("-"));
        panel6.add(new JButton("+"));
        mainContainer.add(panel6);


        //Create Panel 7
        JPanel panel7 = new JPanel();
        //Set Flow Layout for Panel 7
        panel7.setLayout(new GridLayout(0, 10));

        panel7.add(new JButton("F-E"));
        panel7.add(new JButton("Exp"));
        panel7.add(new JButton("Mod"));
        panel7.add(new JButton("log"));
        panel7.add(new JButton("10^x"));
        panel7.add(new JButton("0"));
        panel7.add(new JButton("."));

        JPanel pEast = new JPanel(new GridLayout(0, 1));
        panel7.add(pEast, BorderLayout.EAST);
        pEast.add(new JButton("="));

        mainContainer.add(panel7);



        setVisible(true);
        setResizable(false);

    }

    public static void main(String[] args) {
        new calculator();
    }
}
