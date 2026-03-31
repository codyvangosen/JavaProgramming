package PartOne.ReadingInput;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String message = scanner.nextLine();

        System.out.println("Hi " + message);

        scanner.close();

    }
}