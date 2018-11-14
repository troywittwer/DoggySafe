import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Asus1
 */
public class doggoFrame extends JFrame implements ActionListener{
    //JFrame myDoggo = new JFrame();
    
    private JButton button1, button2, button3, button4, button5, button6,
                    button7, button8, button9, button0, buttonEnter;
    
    private int combos = 0;
    static String myCombo = "";
    
    private JLabel currentIteration;
    
    private JButton killYourself, fuckOff;
    
    doggoFrame(){
        super("Doggo tester");
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        currentIteration = new JLabel("Blank");
        add(currentIteration);
        currentIteration.setBounds(1200, 515, 100, 55);
        
        button1 = new JButton("1");
        add(button1);
        button1.setBounds(1505, 515, 100, 55);
        button1.addActionListener(this);
        
        button2 = new JButton("2");
        add(button2);
        button2.setBounds(1621, 515, 100, 55);
        button2.addActionListener(this);
        
        button3 = new JButton("3");
        add(button3);
        button3.setBounds(1737, 515, 100, 55);
        button3.addActionListener(this);
        
        button4 = new JButton("4");
        add(button4);
        button4.setBounds(1505, 581, 100, 55);
        button4.addActionListener(this);
        
        button5 = new JButton("5");
        add(button5);
        button5.setBounds(1621, 581, 100, 55);
        button5.addActionListener(this);
        
        button6 = new JButton("6");
        add(button6);
        button6.setBounds(1737, 581, 100, 55);
        button6.addActionListener(this);
        
        button7 = new JButton("7");
        add(button7);
        button7.setBounds(1505, 648, 100, 55);
        button7.addActionListener(this);
        
        button8 = new JButton("8");
        add(button8);
        button8.setBounds(1621, 648, 100, 55);
        button8.addActionListener(this);
        
        button9 = new JButton("9");
        add(button9);
        button9.setBounds(1737, 648, 100, 55);
        button9.addActionListener(this);
        
        button0 = new JButton("0");
        add(button0);
        button0.setBounds(1505, 713, 100, 55);
        button0.addActionListener(this);
        
        buttonEnter = new JButton("Enter");
        add(buttonEnter);
        buttonEnter.setBounds(1697, 794, 162, 50);
        buttonEnter.addActionListener(this);
        
        killYourself = new JButton("Close window");
        add(killYourself);
        killYourself.setBounds(30, 30, 100, 55);
        killYourself.addActionListener(this);
        
        fuckOff = new JButton("go away");
        add(fuckOff);
        fuckOff.setBounds(50, 50, 50, 50);
        fuckOff.setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button0){
            myCombo += "0";
        }
        else if (e.getSource() == button1){
            myCombo += "1";
        }
        else if (e.getSource() == button2){
            myCombo += "2";
        }
        else if (e.getSource() == button3){
            myCombo += "3";
        }
        else if (e.getSource() == button4){
            myCombo += "4";
        }
        else if (e.getSource() == button5){
            myCombo += "5";
        }
        else if (e.getSource() == button6){
            myCombo += "6";
        }
        else if (e.getSource() == button7){
            myCombo += "7";
        }
        else if (e.getSource() == button8){
            myCombo += "8";
        }
        else if (e.getSource() == button9){
            myCombo += "9";
        }
        
        else if (e.getSource() == buttonEnter){
            System.out.println(myCombo);
            currentIteration.setText(myCombo);
            myCombo = "";
        }
        else if (e.getSource() == killYourself){
            System.exit(0);
        }
        
    }
    
    public JButton getEnterButton(){
        return buttonEnter;
    }
    
    public int getCombos(){
        return combos;
    }
}
