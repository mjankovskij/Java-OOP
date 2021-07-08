package Exceptions.secondTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        System.out.println("Enter int:");

        while (true) {
            try {
                System.out.println("Result int " + input.enterNumber(sc));
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Klaida " + e);
            }
        }

    }
}
