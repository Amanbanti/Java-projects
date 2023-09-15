/*
  Reversing a String
In Java, strings refer to sequences of characters that behave like an object within the Java environment.
 It’s a very common and widely used Java data structure, storing data in an array of characters. 
 Creating a simple application that reverses a string can help you understand strings and how they’re used in a Java environment.

For example, creating a program that reverses a string the user enters (e.g., “HELLO” to “OLLEH”).
 This project has many possible solutions, which is a key concept to understand as you start coding. 
 And, oftentimes the best solution can change depending on the attributes and objective of 
 the project you’re working on.

 */

import java.util.Scanner;
class machine{
    public String doit(String word){
        char arr[]=word.toCharArray();
        String comp="";
        for (int i=(word.length()-1);i>=0;i--){
             comp+=arr[i];
           
        }
        return comp;
        

    }
}
public class convertor{
    public static void main(String[] args){
        System.out.println("Enter a word:");
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        machine obj=new machine();
        System.out.println(obj.doit(word));


    }
}