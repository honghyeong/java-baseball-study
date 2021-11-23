package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        final Scanner scanner = new Scanner(System.in);

        System.out.println("게임 시작! 게임을 시작하려면 1, 종료하려면 2을 입력하세요.");
        int stop= scanner.nextInt();
        BaseBallGame baseBallGame = new BaseBallGame(stop);

        while(baseBallGame.restartOrEnd()){

        }

    }
}
