package view;

import java.util.Scanner;

public class InputView {
    private static final String FIRST_INPUT_MASSAGE = "죄표를 입력하세요.";

    public static void firstInputView() {
        System.out.println(FIRST_INPUT_MASSAGE);
    }

    public static String getInput() {
        firstInputView();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
}
