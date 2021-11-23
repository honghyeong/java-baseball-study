package baseball;
import java.util.Scanner;
import utils.RandomUtils;

public class BaseBallGame {

    Scanner scanner = new Scanner(System.in);


    public BaseBallGame() {
    }

//    GuessInput
//    while(init!=2){



    public boolean restartOrEnd(boolean result){

        if(result){
            System.out.println("3개의 숫자를 모두  맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int input = scanner.nextInt();
            if(input==1){
                return true;
            }else if(input==2){
                return false;
            }else {
                throw new IllegalArgumentException();
            }
        }

    }

}
