//*********************************************************
// StringPlay.java         Author: Dylan
//
// Used to experiment with string literals, concatenation,
// and escape sequences.
//
//*********************************************************

public class StringPlay {
    //----------------------------------------------------
    // Prints strings using various syntactic techniques.
    //----------------------------------------------------
    public static void main(String[] args) {
        System.out.println("Four score and seven years ago, our fathers " +
            "brought forth on this continent a new nation.");

        System.out.println(4 * 20 + 7);

        System.out.println(87 + " years ago");

        System.out.println(4 * 20 + 7 + " years ago");

        System.out.println("four score and seven is NOT " + 4 * 20 + 7);

        System.out.println("four score and seven is " + (4 * 20 + 7));

        int time = 4 * 20 + 7;
        System.out.println(time + " years ago");
        System.out.println("four score and seven years is " + time +
        " years ago");

        System.out.println("He said \"four score and seven years\"");

        System.out.println("four\nscore\nand\nseven\nyears");
    }
}
