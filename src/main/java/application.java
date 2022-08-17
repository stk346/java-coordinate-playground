import controller.InputController;

public class application {
    public static void main(String[] args) {
        // 시작
        // 기본적으로 입력,출력은 분리하자
        String input = InputView.input();
        // Controller 도 테스트 해봐라!
        // 메소드 분리 -> 클래스 분리
        InputController inputController = new InputController(input);
        ResultView.showResult(inputController.getWidth());
        // 마지막
    }
}
