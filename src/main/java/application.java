import controller.InputController;

import java.util.Scanner;

public class application {
    public static String repeat() {
        try {
            return getString();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return repeat();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return repeat();
        }
    }

    public static void main(String[] args) {
        System.out.println("좌표를 입력하세요.");
        System.out.println(repeat());
    }

    private static String getString() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        InputController inputController = new InputController(userInput);
        return inputController.returnWidth();
    }
}
