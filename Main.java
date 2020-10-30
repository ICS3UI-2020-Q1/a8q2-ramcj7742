import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Jaden Ramcharan

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel firstNum;
  JLabel secondNum;
  JLabel resultNum;

  JTextField fieldOne;
  JTextField fieldTwo;
  JTextField fieldResult;

  JButton addition;
  JButton subtraction;
  JButton multiply;
  JButton divide;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    //initialize main jPanel
    mainPanel = new JPanel();
    //disable any layout helpers
    mainPanel.setLayout(null);

    //initialize the labels
    firstNum = new JLabel("First Number");
    secondNum = new JLabel("Second Number");
    resultNum = new JLabel("Result");

    //set location and size of labels
    firstNum.setBounds(20, 20, 150, 20);
    secondNum.setBounds(20, 50, 150, 20);
    resultNum.setBounds(20, 80, 150, 20);

    //initialize text fields
    fieldOne = new JTextField();
    fieldTwo = new JTextField();
    fieldResult = new JTextField();

    //disale result text field
    fieldResult.setEnabled(false);

    //set location and size for text fields
    fieldOne.setBounds(190, 20, 150, 20);
    fieldTwo.setBounds(190, 50, 150, 20);
    fieldResult.setBounds(190, 80, 150, 20);

    //initialize the buttons
    addition = new JButton("Add");
    subtraction = new JButton("Sub");
    multiply = new JButton("Mul");
    divide = new JButton("Div");

    //set size and location for buttons
    addition.setBounds(20, 120, 75, 20);
    subtraction.setBounds(100, 120, 75, 20);
    multiply.setBounds(180, 120, 75, 20);
    divide.setBounds(260, 120, 75, 20);

    //add action listener to the buttons
    addition.addActionListener(this);
    subtraction.addActionListener(this);
    multiply.addActionListener(this);
    divide.addActionListener(this);

    //add everything to main panel
    mainPanel.add(firstNum);
    mainPanel.add(secondNum);
    mainPanel.add(resultNum);

    mainPanel.add(fieldOne);
    mainPanel.add(fieldTwo);
    mainPanel.add(fieldResult);

    mainPanel.add(addition);
    mainPanel.add(subtraction);
    mainPanel.add(multiply);
    mainPanel.add(divide);

    //add main panel to frame
    frame.add(mainPanel);


  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("Add")){
      //get text from each text box
      String userNum = fieldOne.getText();
      String userNum2 = fieldTwo.getText();

      //convert strings to integers
      int num1 = Integer.parseInt(userNum);
      int num2 = Integer.parseInt(userNum2);

      //adds the two numbers
      int result = num1 + num2;

      //displays result
      fieldResult.setText("" + result);
    }else if(command.equals("Sub")){
      //get text from each text box
      String userNum = fieldOne.getText();
      String userNum2 = fieldTwo.getText();

      //convert strings to integers
      int num1 = Integer.parseInt(userNum);
      int num2 = Integer.parseInt(userNum2);

      //subtracts num 1 from num 2
      int result = num1 - num2;

      //displays result
      fieldResult.setText("" + result);
    }else if(command.equals("Mul")){
      //get text from each text box
      String userNum = fieldOne.getText();
      String userNum2 = fieldTwo.getText();

      //convert strings to integers
      int num1 = Integer.parseInt(userNum);
      int num2 = Integer.parseInt(userNum2);

      // multiplys the 2 numbers
      int result = num1 * num2;

      //displays result
      fieldResult.setText("" + result);
    }else if(command.equals("Div")){
      //get text from each text box
      String userNum = fieldOne.getText();
      String userNum2 = fieldTwo.getText();

      //convert strings to integers
      int num1 = Integer.parseInt(userNum);
      int num2 = Integer.parseInt(userNum2);

      // divides num 1 by num 2
      int result = num1 / num2;

      //displays result
      fieldResult.setText("" + result);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
