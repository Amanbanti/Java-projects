import java.util.Scanner;
class Calculate{
    Scanner sc= new Scanner(System.in);
    public void add(){
        System.out.println("Enter the frist number:");
         double num1=sc.nextDouble();
         System.out.println("Enter the second number:");
         double num2=sc.nextDouble();
         System.out.println(num1+num2);

    }

    public void sub(){
        System.out.println("Enter the frist number:");
         double num1=sc.nextDouble();
         System.out.println("Enter the second number:");
         double num2=sc.nextDouble();
         System.out.println(num1-num2);

    }



    public void mul(){
        System.out.println("Enter the frist number:");
         double num1=sc.nextDouble();
         System.out.println("Enter the second number:");
         double num2=sc.nextDouble();
         System.out.println(num1*num2);

    }

    
    public void div(){
        System.out.println("Enter the frist number:");
         double num1=sc.nextDouble();
         System.out.println("Enter the second number:");
         double num2=sc.nextDouble();
         System.out.println(num1/num2);

    }

     public void sin(){
        System.out.println("Enter the degree:");
         double deg=sc.nextDouble();
         double rad=Math.toRadians(deg);
         double sineValue=Math.sin(rad);
         System.out.println(sineValue);

    }


    public void cos(){
        System.out.println("Enter the degree:");
         double deg=sc.nextDouble();
         double rad=Math.toRadians(deg);
         double cosineValue=Math.cos(rad);
         System.out.println(cosineValue);

    }


public void tan(){
        System.out.println("Enter the degree:");
         double deg=sc.nextDouble();
         double rad=Math.toRadians(deg);
         double tanValue=Math.tan(rad);
         System.out.println(tanValue);

    }

    public void sinInverse(){
        System.out.println("Enter the Value:");
        double val=sc.nextDouble();
         double sinInvValue=Math.asin(val);
         System.out.println(sinInvValue);

    }

    public void cosInverse(){
        System.out.println("Enter the Value:");
        double val=sc.nextDouble();
         double cosInvValue=Math.acos(val);
         System.out.println(cosInvValue);

    }


    public void tanInverse(){
        System.out.println("Enter the Value:");
        double val=sc.nextDouble();
         double tanInvValue=Math.atan(val);
         System.out.println(tanInvValue);

    }

    public void log(){
        System.out.println("Enter the number");
         double num=sc.nextDouble();
         double logVal=Math.log10(num);
         System.out.println(logVal);

    }

    public void Nlog(){
        System.out.println("Enter the number");
         double num=sc.nextDouble();
         double logVal=Math.log(num);
         System.out.println(logVal);

    }

    public void pow(){
        System.out.println("Enter the number:");
         double num=sc.nextDouble();
        System.out.println("Enter the number that raised:");
         double raise=sc.nextDouble();
         double powVal=Math.pow(num, raise);
         System.out.println(powVal);

    }





}

public class Scalculator{
    public static void main(String[] args){
        
            while(true){
                 Scanner sc= new Scanner(System.in);
            Calculate obj= new Calculate();
            System.out.println(".......................Calculator.........................");
            System.out.println("Insert 1 :To Add a number.");
            System.out.println("Insert 2 :To Substract a number.");
            System.out.println("Insert 3 :To Multiplay a number.");
            System.out.println("Insert 4 :To Divide a number.");
            System.out.println("Insert 5 :To Find sine of a number.");
            System.out.println("Insert 6 :To Find cose of a number.");
            System.out.println("Insert 7 :To Find tan of a number.");
            System.out.println("Insert 8 :To Find Inverse sine of a number.");
            System.out.println("Insert 9 :To Find Inverse cose of a number.");
            System.out.println("Insert 10:To Find Inverse tan of a number.");
            System.out.println("Insert 11:To Find logarithm of a number.");
            System.out.println("Insert 12:To Find a natural logarthim of a number.");
            System.out.println("Insert 13:To Find a power of a number.");
            System.out.println("Insert 0 :If you want to exit!");
          


            int userInput=sc.nextInt();
            if(userInput==1){
               obj.add();
            }
            else if(userInput==2){
                obj.sub();
            }

             else if(userInput==3){
                obj.mul();
            }

             else if(userInput==4){
                obj.div();
            }

            else if(userInput==5){
                obj.sin();
            }
             else if(userInput==6){
                obj.cos();
            }
             else if(userInput==7){
                obj.tan();
            }
            else if (userInput==8){
                obj.sinInverse();
            }
            else if (userInput==9){
                obj.cosInverse();
            }
            else if (userInput==10){
                obj.tanInverse();
            }
             else if (userInput==11){
                obj.log();
            }
            else if (userInput==12){
                obj.Nlog();
            }
            else if (userInput==13){
                obj.pow();
            }
            else if(userInput==0){
                break;
            }



            }
           
            
    }
}
