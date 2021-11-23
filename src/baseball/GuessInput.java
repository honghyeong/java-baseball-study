package baseball;

public class GuessInput {

    private int input;

    public GuessInput() {
    }

    public int setInput(int input){
        if(this.input<100||this.input>=1000){
            this.input = input;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }

    public int getInput(){
        return input

    }


}
