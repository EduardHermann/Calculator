package pack;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator extends javax.swing.JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField textField;

  private double firstNumber;
  private double secondNumber;
  private double result;

  private String operations;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Calculator frame = new Calculator();
          frame.setVisible(true);
          frame.setLocationRelativeTo(null);
          frame.setResizable(false);
          frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
          Locale.setDefault(Locale.US);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Calculator() {
    setTitle("Calculator Eduard Hermann");
    setDefaultCloseOperation(Calculator.EXIT_ON_CLOSE);
    setBounds(100, 100, 350, 460);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    // Textfield
    textField = new JTextField();
    textField.setEditable(false);
    textField.setHorizontalAlignment(SwingConstants.LEFT);
    textField.setFont(new Font("Tahoma", Font.BOLD, 22));
    textField.setBounds(10, 11, 314, 45);
    contentPane.add(textField);
    textField.setColumns(10);

    // Button 0
    JButton btn0 = new JButton("0");
    btn0.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn0.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn0.getText();
        textField.setText(input);
      }
    });
    btn0.setBounds(10, 351, 70, 60);
    contentPane.add(btn0);

    // Button 1
    JButton btn1 = new JButton("1");
    btn1.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn1.getText();
        textField.setText(input);
      }
    });
    btn1.setBounds(10, 280, 70, 60);
    contentPane.add(btn1);

    // Button 2
    JButton btn2 = new JButton("2");
    btn2.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn2.getText();
        textField.setText(input);
      }
    });
    btn2.setBounds(90, 280, 70, 60);
    contentPane.add(btn2);

    // Button 3
    JButton btn3 = new JButton("3");
    btn3.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn3.getText();
        textField.setText(input);
      }
    });
    btn3.setBounds(174, 280, 70, 60);
    contentPane.add(btn3);

    // Button 4
    JButton btn4 = new JButton("4");
    btn4.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn4.getText();
        textField.setText(input);
      }
    });
    btn4.setBounds(10, 209, 70, 60);
    contentPane.add(btn4);

    // Button 5
    JButton btn5 = new JButton("5");
    btn5.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn5.getText();
        textField.setText(input);
      }
    });
    btn5.setBounds(90, 209, 70, 60);
    contentPane.add(btn5);

    // Button 6
    JButton btn6 = new JButton("6");
    btn6.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn6.getText();
        textField.setText(input);
      }
    });
    btn6.setBounds(174, 209, 70, 60);
    contentPane.add(btn6);

    // Button 7
    JButton btn7 = new JButton("7");
    btn7.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn7.getText();
        textField.setText(input);
      }
    });
    btn7.setBounds(10, 138, 70, 60);
    contentPane.add(btn7);

    // Button 8
    JButton btn8 = new JButton("8");
    btn8.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn8.getText();
        textField.setText(input);
      }
    });
    btn8.setBounds(90, 138, 70, 60);
    contentPane.add(btn8);

    // Button 9
    JButton btn9 = new JButton("9");
    btn9.setFont(new Font("Tahoma", Font.BOLD, 22));
    btn9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btn9.getText();
        textField.setText(input);
      }
    });
    btn9.setBounds(174, 138, 70, 60);
    contentPane.add(btn9);

    // Button Dot
    JButton btnDot = new JButton(".");
    btnDot.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText() + btnDot.getText();
        textField.setText(input);
      }
    });
    btnDot.setFont(new Font("Tahoma", Font.BOLD, 30));
    btnDot.setBounds(90, 351, 70, 60);
    contentPane.add(btnDot);

    // Button Plus
    JButton btnPlus = new JButton("+");
    btnPlus.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnPlus.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstNumber = Double.parseDouble(textField.getText());
        textField.setText(null);
        operations = "+";
      }
    });
    btnPlus.setBounds(254, 280, 70, 60);
    contentPane.add(btnPlus);

    // Button Minus
    JButton btnMinus = new JButton("-");
    btnMinus.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnMinus.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstNumber = Double.parseDouble(textField.getText());
        textField.setText(null);
        operations = "-";
      }
    });
    btnMinus.setBounds(254, 209, 70, 60);
    contentPane.add(btnMinus);

    // Button Times
    JButton btnTimes = new JButton("*");
    btnTimes.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnTimes.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstNumber = Double.parseDouble(textField.getText());
        textField.setText(null);
        operations = "*";
      }
    });
    btnTimes.setBounds(254, 138, 70, 60);
    contentPane.add(btnTimes);

    // Button Divide
    JButton btnDivide = new JButton("/");
    btnDivide.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnDivide.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstNumber = Double.parseDouble(textField.getText());
        textField.setText(null);
        operations = "/";
      }
    });
    btnDivide.setBounds(254, 67, 70, 60);
    contentPane.add(btnDivide);

    // Button Modulo
    JButton btnModulo = new JButton("%");
    btnModulo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        firstNumber = Double.parseDouble(textField.getText());
        textField.setText(null);
        operations = "%";
      }
    });
    btnModulo.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnModulo.setBounds(174, 67, 70, 60);
    contentPane.add(btnModulo);

    // Button Negative
    JButton btnNegative = new JButton("+/-");
    btnNegative.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double temp = Double.parseDouble(textField.getText());
        temp = temp * -1;
        textField.setText(String.valueOf(temp));
      }
    });
    btnNegative.setFont(new Font("Tahoma", Font.BOLD, 19));
    btnNegative.setBounds(174, 351, 70, 60);
    contentPane.add(btnNegative);

    // Button C
    JButton btnC = new JButton("C");
    btnC.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(null);
      }
    });
    btnC.setBounds(10, 67, 70, 60);
    contentPane.add(btnC);

    // Button Arrow
    JButton btnArrow = new JButton("<=");
    btnArrow.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (textField.getText().length() > 0) {
          StringBuilder SB = new StringBuilder(textField.getText());
          SB.deleteCharAt(textField.getText().length() - 1);
          String temp = SB.toString();
          textField.setText(temp);
        }
      }
    });
    btnArrow.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnArrow.setBounds(90, 67, 70, 60);
    contentPane.add(btnArrow);

    // Button Equals
    JButton btnEquals = new JButton("=");
    btnEquals.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnEquals.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (operations.equals("+")) {
          secondNumber = Double.parseDouble(textField.getText());
          result = firstNumber + secondNumber;
          textField.setText(String.valueOf(result));
          documentingMessage("+");
        }
        if (operations.equals("-")) {
          secondNumber = Double.parseDouble(textField.getText());
          result = firstNumber - secondNumber;
          textField.setText(String.valueOf(result));
          documentingMessage("-");
        }
        if (operations.equals("*")) {
          secondNumber = Double.parseDouble(textField.getText());
          result = firstNumber * secondNumber;
          textField.setText(String.valueOf(result));
          documentingMessage("*");
        }
        if (operations.equals("/")) {
          secondNumber = Double.parseDouble(textField.getText());
          result = firstNumber / secondNumber;
          textField.setText(String.valueOf(result));
          documentingMessage("/");
        }
        if (operations.equals("%")) {
          secondNumber = Double.parseDouble(textField.getText());
          result = firstNumber % secondNumber;
          textField.setText(String.valueOf(result));
          documentingMessage("%");
        }
      }
    });
    btnEquals.setBounds(254, 351, 70, 60);
    contentPane.add(btnEquals);
  }

  /**
   * documenting the last calculations
   */
  public void documentingMessage(String operator) {
    System.out.println(
        firstNumber + " " + operator + " " + secondNumber + " = " + String.valueOf(result));
  }
}
