package baseball;

public class GuessInput {

    private int input;

    GuessInput(int input) {
        this.input = input;
    }
    GuessInput(String input) {
        this.input = Integer.parseInt(input);
    }
    GuessInput(char input) {
        this.input = 0;
    }


    public int getInput(){
        if(this.input<100||this.input>=1000){
            return input;
        }
        else
        {
            throw new IllegalArgumentException();
        }

    }


}
