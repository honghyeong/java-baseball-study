package baseball;

import java.util.ArrayList;
import java.util.stream.Stream;

public class GuessResult {

//    private int answer;
    private ArrayList<int[]> answerList = new ArrayList<int[]>();
    private ArrayList<int[]> inputList = new ArrayList<int[]>();
    private int ballCount=0;
    private int strikeCount=0;

    public GuessResult(int answer, int input) {
        int tempAnswer=answer;
        int tempInput=input;
        for(int i=0;i<3;i++){
            answerList.add(new int[]{tempAnswer%10,i}); // ex) 713 -> (key, value) = { 7:2, 1:1, 3:0 }
            inputList.add(new int[]{tempInput%10,i});
            tempAnswer/=10;
            tempInput/=10;
        }

        this.ballCount=0;
        this.strikeCount=0;
    }

    public int getBallResult(){
        int result=0;
        for(int i=0;i<3;i++){
            int value=answerList.get(i)[0];
            int index=answerList.get(i)[1];
            Stream<int[]> stream = inputList.stream();
            result+=(int)stream.filter(e->e[0]==value).filter(e->e[1]!=index).count();
            }
        return result;

    }
    public int getStrikeResult(){
        int result=0;
        for(int i=0;i<3;i++){
            if((answerList.get(i)[0]==inputList.get(i)[0]) && answerList.get(i)[1]==inputList.get(i)[1]){
                result+=1;
            }
        }

        return result;
    }

}
