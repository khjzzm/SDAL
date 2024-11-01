package io.sdal.string.manipulation;

import org.junit.jupiter.api.Test;

import static io.sdal.string.manipulation.MostCommonWord.mostCommonWord;
import static io.sdal.utility.TimeUtil.timeMethod;


class MostCommonWordTest {

    @Test
    void commonWord() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        String s = mostCommonWord(paragraph, banned);
        timeMethod(()-> System.out.println(s));
        assert s.equals("ball");
    }
}
