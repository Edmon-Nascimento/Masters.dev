package methods;

import java.util.Scanner;

public class GreetUser {
    static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
    }

    public static String getUserName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        input.close();

        return name;
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
