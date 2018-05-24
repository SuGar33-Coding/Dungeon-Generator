package testing;

import dungeonGenerator.veryDice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class hacks {

    public static void main(String[] args) {

        //testing dice roller
        dungeonGenerator.veryDice d4 = new veryDice(4);
        System.out.println(d4.roll());
        System.out.println(Arrays.toString(d4.roll(12)));
        System.out.println(Arrays.toString(d4.roll(0)));
    }

}