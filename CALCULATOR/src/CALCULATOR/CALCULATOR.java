/*
Project of a calculator
The project is a basic calculator with differents operations that you can choose and
enter the values that want to use to find the result, also is an option to convert from
Celsius to Fahrenheit.

The project is very simple, use the Switch option and break to separate the operations between them
and avoid the conflict between the operations that might cause that the program crash.

Inside every case is the operation basicly done, without complicate every step and trying to very specific 
in the secuantial, also test it to check that everything is going to be fine with every possibility that
the user can enter.
 */
package CALCULATOR;

import java.util.Scanner;


public class CALCULATOR {
  
    public static void main(String[] args) {
        int opc;
        double a,b,c;
        System.out.println("Select an option\n");
        System.out.println("1. Sum"); 
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Degrees F");
        Scanner s= new Scanner(System.in);
        opc=s.nextInt();
        
            switch (opc){
            case 1:  
                System.out.println("Enter the first number");
                a=s.nextInt();
                
               System.out.println("Enter the second number");
               b=s.nextInt();
               
               c=a+b;
               
                System.out.println("The result of the sum is: "+c);
               
              break;
            
            case 2:  
                System.out.println("Enter the first number");
                a=s.nextInt();
                
               System.out.println("Enter the second number");
               b=s.nextInt();
               
               c=a-b;
               
                System.out.println("The result of the substration is: "+c);
                     break;
            case 3:  
                System.out.println("Enter the first number");
                a=s.nextInt();
                
               System.out.println("Enter the second number");
               b=s.nextInt();
               
               c=a*b;
               
                System.out.println("The result of the multiplication is: "+c);
                     break;
            case 4:  
                System.out.println("Enter the first number");
                a=s.nextInt();
                
               System.out.println("Enter the second number");
               b=s.nextInt();
               
               c=a/b;
               
                System.out.println("The result of the division is: "+c);
                     break;
            case 5:  
                //Para la potencia
                System.out.println("Enter the base number");
                a=s.nextInt();
                
               System.out.println("Enter the number that you want to power");
               b=s.nextInt();
               
               c=(int) Math.pow(a, b);
               
                System.out.println("The result of the power is: "+c);
                
                     break;
            case 6:  
                
                System.out.println("Enter the value in Celsiu Degree");
                a=s.nextInt();
                c=(a*9/5)+32;
                System.out.println(a+" Ceslius degree is equal to " + c + "Farenheit degree");
                
                     break;
            
            default: 
                System.out.println("ENTER A VALID OPTION");
                     break;
        }
    }

        
}
    

