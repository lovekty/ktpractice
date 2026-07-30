package me.tony.practice.random;

import java.util.Random;
import java.util.stream.IntStream;

public class PRNGTest {

    static void main() {
        var rand = new Random(10);
        IntStream.range(0, 4).forEach(_ -> IO.println(rand.nextInt()));
    }
}

/*
-1157793070
1913984760
1107254586
1773446580
 */

/*
-1157793070
1913984760
1107254586
1773446580
 */