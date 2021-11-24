package baseball;
import java.util.Scanner;
import utils.RandomUtils;

public class BaseBallGame {

    Scanner scanner = new Scanner(System.in);
    GuessInput guessInput=new GuessInput();
    GuessResult guessResult = new GuessResult(RandomUtils.nextInt(100, 1000)); // get random answer

    BaseBallGame() {
    }

    public int playGame(){
        int ballCount=0;
        int strikeCount=0;
        boolean flag=false;
        int input=scanner.nextInt();

        while(!flag) {
            try {
                guessInput.setInput(input);
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 100~999의 정수 숫자를 입력해주세요.");
                input = scanner.nextInt();
            }

            guessResult.setInput(input);
            guessResult.getBallResult();
            guessResult.getBallResult();

            flag = guessResult.getFinalResult();

        }
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return scanner.nextInt();
    }


}
