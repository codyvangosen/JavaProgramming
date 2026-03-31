package PartOne.ReadingInput;

import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");

        String userString = scanner.nextLine();

        System.out.println(userString);
        System.out.println(userString);
        System.out.println(userString);

        scanner.close();

    }
}