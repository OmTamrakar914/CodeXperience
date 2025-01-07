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
            Addition add = new Addition();
            System.out.println("Answer = "+add.add(a,b));
        }
        if(opt == 2){
            Substraction sub = new Substraction();
            System.out.println("Answer = "+sub.Substract(a,b));
        }if(opt == 3){
            Multiplication mult = new Multiplication();
            System.out.println("Answer = "+mult.multiply(a,b));
        }if(opt == 4){
            division obj =new division();
            System.out.println("Answer = "+obj.divide(a,b));
        }else{
            System.out.println("Invalid output");
        }
        


    }
}