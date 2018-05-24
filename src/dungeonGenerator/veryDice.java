package dungeonGenerator;

import java.util.Random;

public class veryDice {

    private int numSides;
    private Random rand = new Random();

    /*
    Default number of sides is 6
     */
    public veryDice() {
        this.numSides = 6;
    }

    public veryDice(int sides) {
        this.numSides = sides;
    }

    public int getNumSides() {
        return numSides;
    }

    /*
    Roll once
     */
    public int roll() {
        return rand.nextInt(this.numSides) + 1;
    }

    /*
    Roll multiple times
     */
    public int[] roll(int amount) {
        if (amount <= 0) {
            int[] bad = {-1}; //cuz i dont know how to just return an array, ok? i forgot, ok?
            System.out.println("nu uh you can't do that, bad boi, now you get an array with a -1 in it");
            return bad; //TODO write in exception here
        } else {
            int[] ret = new int[amount];
            for (int i = 0; i < amount; i++) {
                ret[i] = rand.nextInt(this.numSides) + 1;
            }
            return ret;
        }
    }

}
