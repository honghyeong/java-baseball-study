package baseball;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.stream.Stream;

public class GuessInput {

    private int input;

    public GuessInput() {
        this.input = 0;
    }

    public void setInput(int input){
        if(this.input<100||this.input>=1000){
            int tempInput = input;
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<3;i++){
                list.add(tempInput%10);
                tempInput /= 10;
            }
            // 중복 숫자 있는지 검사
            Stream<Integer> stream = list.stream();
            if(stream.distinct().count()==3)
                throw new IllegalArgumentException();

            this.input = input;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }

    public int getInput(){
        return this.input;
    }


}
