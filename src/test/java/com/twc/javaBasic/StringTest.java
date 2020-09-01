package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTest {
    //Hint: String https://beginnersbook.com/2013/12/java-strings/
    @SuppressWarnings({"StringEquality", "ConstantConditions"})
    @Test
    void should_be_immutable() {
        String originalString = "The original string";
        String modifiedString = originalString.replace("original", "new");

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // <--start
        final boolean areSame = false;
        // --end-->

        assertEquals("The new string", modifiedString);
        assertEquals(areSame, originalString == modifiedString);
    }

    @SuppressWarnings({"StringEquality", "ConstantConditions"})
    @Test
    void all_modification_method_will_create_new_string() {
        String originalString = "The string with tailing space.     ";
        String modifiedString = originalString.trim();

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // <--start
        final boolean areSame = false;
        // --end-->

        assertEquals("The string with tailing space.", modifiedString);
        assertEquals(areSame, originalString == modifiedString);
    }

    @SuppressWarnings("StringEquality")
    @Test
    void will_create_new_string_when_concat() {
        String originalString = "Part one. ";
        String copyOfOriginalString = originalString;
        originalString += "Part two.";

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // <--start
        final boolean areSame = false;
        // --end-->

        assertEquals("Part one. Part two.", originalString);
        assertEquals(areSame, originalString == copyOfOriginalString);
    }


    @SuppressWarnings({"unused"})
    @Test
    void should_break_string_into_words() {
        final String sentence = "This is Mike";

        // TODO: Extract words in the sentence.
        // <--Start
        String[] words = sentence.split(" ");
        // --End-->

        assertArrayEquals(new String[] {"This", "is", "Mike"}, words);
    }

}
