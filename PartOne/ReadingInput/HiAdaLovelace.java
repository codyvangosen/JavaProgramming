package PartOne.ReadingInput;

import java.util.Scanner;

public class HiAdaLovelace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hi " + name + "!");

        scanner.close();
    }

}