package com.company;


import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        try {
            enterName();
        } catch (InvalidName exc) {
            System.out.println("Exception : "+ exc.getMessage());
            try {
                enterName();
                return;
            } catch (InvalidName invalidName) {
                invalidName.printStackTrace();
            }
        }
    }

    public static void enterName() throws InvalidName {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.charAt(0) < 65 || name.charAt(0) > 90 || name.length() < 3) {
            throw new InvalidName("Invalid entered name : " + name);
        }

        System.out.println(name);
    }

}


class InvalidName extends Exception {

    public InvalidName(String s) {
        super(s);
    }
}