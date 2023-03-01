package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight , height , bmi;
        System.out.println("your weigth :");
        weight = scanner.nextDouble();
        System.out.println("your height :");
        height = scanner.nextDouble();
        bmi = weight/ Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpetation");
        if (bmi < 18){
            System.out.println(bmi+ " underweight");
        } else if (bmi < 25.0) {
            System.out.println(bmi + " nomal");
        } else if (bmi<30) {
            System.out.println(bmi+ " overweight");
        }else {
            System.out.println(bmi+" obse");
        }
    }
}