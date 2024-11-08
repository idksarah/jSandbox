import java.util.Scanner;

public class calc {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick an operation");

        String operator = sc.nextLine();
        double a,b;
        double ans;
        
        if(operator.equals("+")){
            System.out.println("enter your addens in the format a b");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("sum: " + (a + b));
        } else if(operator.equals("-")){
            System.out.println("enter your minuends and subtrahends in the format a b");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("dif: " + (a - b));
        } else if(operator.equals("*")){
            System.out.println("enter your products in the format a b");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("product: " + (a * b));
        } else if(operator.equals("/")){
            System.out.println("enter your divisors and dividends in the format a b");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("quotient: " + (a / b));
        } else if(operator.equals("^")){
            System.out.println("enter your base and exponent in the format a b");
            a = sc.nextDouble();
            ans = a;
            b = sc.nextDouble();
            for(double i = 1; i < b; i++){
                ans = ans * a;
            }
            System.out.println("power: " + ans);
        }
    }
}