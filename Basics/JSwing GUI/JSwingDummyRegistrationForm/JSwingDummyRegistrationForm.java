//import libraries
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;


public class index extends JFrame{

    //Name Input Section Objects
    private final JLabel nameText = new JLabel("Name         ", SwingConstants.CENTER);
    private final JTextField nameInput = new JTextField("", 15);

    //Birthday Input Section Objects
    private final JLabel dobText = new JLabel("Birthday    ");


    private final String dobYears[] = {"1921","1922","1923","1924","1925","1926","1927","1928","1929","1930",
            "1931","1932","1933","1934","1935", "1936","1937","1938","1939","1940","1941","1942","1943",
            "1944","1945", "1946","1947","1948","1949","1950", "1951","1952","1953","1954","1955", "1956",
            "1957","1958","1959","1960", "1961","1962","1963","1964","1965", "1966","1967","1968","1969","1970",
            "1971","1972","1973","1974","1975", "1976","1977","1978","1979","1980", "1981","1982","1983","1984",
            "1985", "1986","1987","1988","1989","1990", "1991","1992","1993","1994","1995","1996","1997",
            "1998","1999", "2000", "2001"};
    private final JComboBox dobYear = new JComboBox(dobYears);


    private final String dobMonths[] = {"January","February","March","April","May", "June", "July", "August",
            "September", "October", "November", "December"};
    private final JComboBox dobMonth = new JComboBox(dobMonths);
    private final String dobDates[] = {"1","2","3","4","5", "6", "7", "8", "9", "10", "11", "12", "13","14","15",
            "16","17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
            "28", "29", "30", "31"};
    private final JComboBox dobDate = new JComboBox(dobDates);

    //Gender Input Section Objects
    private final JLabel genderText = new JLabel("Gender    ");
    private final JRadioButton genderMale = new JRadioButton("Male");
    private final JRadioButton genderFemale = new JRadioButton("Female");
    private final JRadioButton genderOthers = new JRadioButton("Others");

    //Email Input Section Objects
    private final JLabel emailText = new JLabel("Email         ");
    private final JTextField userEmail = new JTextField("", 15);

    //Password Input Section Objects
    private final JLabel passwordText = new JLabel("Password");
    private final JPasswordField userPassword = new JPasswordField("", 15);
    private final JLabel retypeText = new JLabel("Retype");
    private final JPasswordField retypePassword = new JPasswordField("", 15);

    //Button Section Objects
    private final JButton clearButton = new JButton("Clear");
    private final JButton validateButton = new JButton("Validate");
    private final JButton registerButton = new JButton("Register");

    //Status Section Objects
    private final JLabel statusText = new JLabel("Status:");
    private final JLabel statusOut = new JLabel("Standby");

    //Method to get gender from JRadioButtons
    public String getGender() {
        String genderOut = null;
        if(genderMale.isSelected() == true){
            genderOut = "Male";
        }else if(genderFemale.isSelected() == true){
            genderOut = "Female";
        }else if(genderOthers.isSelected() == true){
            genderOut = "Others";
        } else {
            genderOut = null;
        }
        return genderOut;
    }




    //set the initial validation status
    private boolean validStatus = true;

    //Method to validate the inputs
    public int validateData() {
        if(nameInput.getText().isEmpty()){
            validStatus = false;
            statusOut.setText("Please Input Name!");
        } else if(getGender() == null){
            validStatus = false;
            statusOut.setText("Please Select Gender!");
        } else if(userEmail.getText().isEmpty()){
            validStatus = false;
            statusOut.setText("Please Input Email!");
        } else if(String.valueOf(userPassword.getPassword()).isEmpty()){
            validStatus = false;
            statusOut.setText("Please Enter Password");
        }else if(String.valueOf(retypePassword.getPassword()).isEmpty()){
            validStatus = false;
            statusOut.setText("Please Enter and Retype Password");
        }else if(String.valueOf(userPassword.getPassword()).equals(String.valueOf(retypePassword.getPassword())) == false){
            validStatus = false;
            statusOut.setText("Password Mismatch!");
        }else {
            validStatus = true;
            statusOut.setText("Inputs are Valid");
        }
        return 0;
    }

    //Method to clear the form
    public void actionClear(ActionEvent e){
        nameInput.setText("");
        userEmail.setText("");
        userPassword.setText("");
        retypePassword.setText("");
        statusOut.setText("Standby");
        dobDate.setSelectedIndex(0);
        dobMonth.setSelectedIndex(0);
        dobYear.setSelectedIndex(0);
        genderMale.setSelected(true);
        genderMale.setSelected(true);
        genderFemale.setSelected(false);
        genderOthers.setSelected(false);
    }

    //Action Event Method to Validate Data
    public void actionValidate(ActionEvent e){
        validateData();
    }

    //Action Event Method for Registration Button
    public void actionRegister(ActionEvent e){
        validateData();
        if(validStatus == true) {

            String messageOut = "<html><body width='150px'><h2>Registration Complete!</h2>"
                    + "<p>Name: " + nameInput.getText() + "<br>"
                    + "DoB: " + dobDate.getSelectedItem() + " " + dobMonth.getSelectedItem() + ", " + dobYear.getSelectedItem() + "<br>"
                    + "Gender: " + getGender() + "<br>"
                    + "Email: " + userEmail.getText() + "<br>"
                    + "<br><br>"
                    + "<small>Made by 011 201 467</small>";
            JOptionPane.showMessageDialog(null, String.format(messageOut, 200, 175));
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Data Entered");
        }
    }

    public index(){
        super("Registration App : 011 201 467");
        setSize(500,300);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Get Containers for contents
        Container mainContainer = this.getContentPane();

        //set layout for main container
        mainContainer.setLayout(new GridLayout(8,1));
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(0,1,1,1, Color.black));

        //Create Header
        JPanel Header = new JPanel();
        //Set Flow Layout for Header with CENTER alignment
        Header.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 1));
        Header.add(new JLabel("Registration", SwingConstants.CENTER)).setFont(new Font("Lemon Milk", Font.PLAIN, 20));
        //Header Section border
        Header.setBorder(new LineBorder(Color.BLACK, 1));
        mainContainer.add(Header);



        //Create Panel 1
        JPanel panel1 = new JPanel();
        //Set Flow Layout for Panel 1
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 2));

        //Name Input Area
        panel1.add(nameText);
        panel1.add(nameInput);
        mainContainer.add(panel1);


        //Create Panel 2
        JPanel panel2 = new JPanel();
        //Set Flow Layout for Panel 2
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 2));

        //Date of Birth Input Area
        panel2.add(dobText);
        panel2.add(dobDate);
        panel2.add(dobMonth);
        panel2.add(dobYear);
        mainContainer.add(panel2);



        //Create Panel 3
        JPanel panel3 = new JPanel();
        //Set Flow Layout for Panel 3
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 2));

        //Gender Selection Area Label
        panel3.add(genderText);

        //Create button group to restrict user from selecting more than one radio option
        var btnGroup = new ButtonGroup();
        btnGroup.add(genderMale);
        btnGroup.add(genderFemale);
        btnGroup.add(genderOthers);

        //Add the radio buttons to the Jpanel container with flow layout
        panel3.add(genderMale);
        panel3.add(genderFemale);
        panel3.add(genderOthers);

        //Add the Jpanel container to the main container with grid layout
        mainContainer.add(panel3);

        //Create Panel 4
        JPanel panel4 = new JPanel();
        //Set Flow Layout for Panel 4
        panel4.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 2));

        //Email Area
        panel4.add(emailText);
        panel4.add(userEmail);
        mainContainer.add(panel4);

        //Create Panel 5
        JPanel panel5 = new JPanel();
        //Set Flow Layout for Panel 5
        panel5.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 2));

        //Password Area
        panel5.add(passwordText);
        panel5.add(userPassword);
        panel5.add(retypeText);
        panel5.add(retypePassword);
        mainContainer.add(panel5);

        //Create Panel 6
        JPanel panel6 = new JPanel();
        //Set Flow Layout for Panel 6
        panel6.setLayout(new GridLayout(1,3, 30,20));
        //panel6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));

        //Buttons Area
        panel6.add(new JToolBar.Separator());
        panel6.add(clearButton).setFont(new Font("Lemon Milk", Font.BOLD, 9));
        panel6.add(validateButton).setFont(new Font("Lemon Milk", Font.BOLD, 9));
        panel6.add(registerButton).setFont(new Font("Lemon Milk", Font.BOLD, 9));
        validateButton.addActionListener(this::actionValidate);
        clearButton.addActionListener(this::actionClear);
        registerButton.addActionListener(this::actionRegister);
        panel6.add(new JToolBar.Separator());
        mainContainer.add(panel6);

        //Create Panel 7
        JPanel panel7 = new JPanel();
        //Set Flow Layout for Panel 7
        panel7.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 2));

        //Buttons Area
        panel7.add(statusText);
        panel7.add(statusOut);
        mainContainer.add(panel7);

        setVisible(true);
        setResizable(false);

    }

    public static void main(String[] args) {
        new index();
    }
}
