import calc.CalcFunctions;
import exceptions.UndefinedMathException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        CalcFunctions calc = new CalcFunctions();

        int num1 = 0;
        int num2 = 0;
        int result = 0;
        String function;

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Enter your first number:");
        num1 = scanObject.nextInt();
        System.out.println("Enter your second number:");
        num2 = scanObject.nextInt();
        System.out.println("What do you want to do?\nThere are following functions:\nadd\nsubtract\nmultiply\ndivide");
        function = scanObject.next();


        if(function.equals("add")){
            result = calc.add(num1,num2);
        } else if(function.equals("subtract")){
            result = calc.subtract(num1,num2);
        } else if(function.equals("multiply")){
            result = calc.multiply(num1,num2);
        } else if(function.equals("divide")){
            try {
                result = calc.divide(num1, num2);
            } catch (UndefinedMathException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The result is "+result);
    }
}
