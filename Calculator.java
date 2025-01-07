import java.util.*;

public class Calculator{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("--------Calculator--------");

        System.out.println("enter first number");
        int a = sc.nextInt();

        System.out.println("enter second number");
        int b = sc.nextInt();

        System.out.println("-----select operation---------");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Substraction ");
        System.out.println(" 3. Multiplication");
        System.out.println(" 4. Division");

        int opt = sc.nextInt();

        if(opt == 1){
            
            System.out.println("Answer = "+Addition.add(a,b));
        }
        if(opt == 2){
            
            System.out.println("Answer = "+Substraction.Substract(a,b));
        }if(opt == 3){

            System.out.println("Answer = "+Multiplication.multiply(ab));
        }if(opt == 4){

            System.out.println("Answer = "+division.divide(a,b));
        }else{
            System.out.println("Invalid output");
        }
        


    }
}