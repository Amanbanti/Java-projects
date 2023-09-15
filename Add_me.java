import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;


class Operator{
    public void doMaths(JLabel labelFinal,JTextField input1, JTextField input2,JTextField input3,JButton button){

         
            String num1= input1.getText();
            String op= input2.getText();
            String num2= input3.getText();
           

            double result;
            double number1 = Double.valueOf(num1);
            double number2 = Double.valueOf(num2);
            switch (op) {
                  
            case "+":
                    
                 result=number1 + number2;
                labelFinal.setText("The Result is: "+result);
              
               
                break;
            case "-":
                    
                 result=number1 - number2;
                
                labelFinal.setText("The Result is: "+result);
                
                break;
             case "*":
                    
                 result=number1 * number2;
                
                labelFinal.setText("The Result is: "+result);
               
                break;
             case "/":
                    
                 result=number1 / number2;
               
                labelFinal.setText("The Result is: "+result);
             
                break;
        
            default:
                    labelFinal.setText("Invalid Input!");
                  
                break;
        }


       
        
    }
}



public class Add_me{
    public static void main(String[] args){
        JFrame frame=new JFrame();
        JButton button=new JButton();
        Operator opp=new Operator();
         JLabel labelFinal=new JLabel();


        JTextField input1 = new JTextField();
        JLabel label1=new JLabel();
        //Inserting the frist number from the user
        label1.setBounds(10,10, 150, 30);
        label1.setText("Enter the frist number:");
        input1.setBounds(15,40,100,30);
       

        JTextField input2 = new JTextField();
        JLabel label2=new JLabel();
        //Inserting the Operator from user
        label2.setText("Enter the Operator:");
        label2.setBounds(10,80, 150, 30);
        input2.setBounds(15,110,100,30);



        JTextField input3 = new JTextField();
        JLabel label3=new JLabel();
         //Inserting the second number from user
        label3.setBounds(10,150, 180, 30);
        label3.setText("Enter the second number:");
        input3.setBounds(15,180,100,30);
       


        button.setBounds(15,240,100,30);
        button.setText("Submit");
        button.setFocusable(false);
        button.addActionListener(e -> {
            opp.doMaths( labelFinal,input1,input2,input3,button);
        });

         labelFinal.setBounds(10,290, 280, 30);
         labelFinal.setForeground(Color.BLACK);



        frame.setVisible(true);
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);


        frame.add(label1);
        frame.add(input1);
        frame.add(label2);
        frame.add(input2);
        frame.add(label3);
        frame.add(input3);
        frame.add(button);
        frame.add(labelFinal);
        


    }

 

}
