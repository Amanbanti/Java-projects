//factorial calculator
import java.util.Scanner;
class Fac{
    public int mul;
    public int ds;
    public Fac(int input){

        int i=1;
        mul=input;
       do{
        mul=mul*(input-i);
           
            i++;
        } while(i<input);
       System.out.println(mul);
    }
}
public class Fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number;");
        int input=sc.nextInt();
        Fac obj= new Fac(input);

        

    }
}
