package HomeWork1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите первое число. ");
        Double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите знак операции - \\\"+\\\", \\\"-\\\", \\\"*\\\", \\\"/\\\"");
        String operand = scanner.nextLine();

        System.out.println("Введите второе число. ");
        Double num2 = Double.parseDouble(scanner.nextLine());

        if (operand.equals("+")){
            System.out.println(num1 + num2);
        } else if (operand.equals("-")) {
            System.out.println(num1 - num2);
        }  else if (operand.equals("*")){
                System.out.println((num1 * num2));
        }   else if (operand.equals("/")){
              if (num2 == 0) {
                    throw new ArithmeticException("Делить на ноль нельзя!");
              }
              System.out.println(num1/num2);
        } else {
            System.out.println("Ошибка");
        }
        scanner.close();
    }
}
