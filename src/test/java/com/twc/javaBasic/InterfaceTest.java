package com.twc.javaBasic;

import com.twc.javaBasic.util.InterfaceExtendsInterfaceWithDefaultMethod;
import com.twc.javaBasic.util.InterfaceExtendsInterfaceWithDefaultMethodImpl;
import com.twc.javaBasic.util.InterfaceWithDefaultMethodImpl;
import com.twc.javaBasic.util.InterfaceWithOverrideDefaultImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterfaceTest {
    //Hint: interface related:https://beginnersbook.com/2013/05/java-interface/
    @Test
    void should_support_default_method() {
        InterfaceWithDefaultMethodImpl instance = new InterfaceWithDefaultMethodImpl();

        // TODO:
        //  Please write down your answer directly.
        //
        // <--start
        final String expected = "The truth of the universe is 42";
        // --end-->

        assertEquals(expected, instance.tellMeTheTruthOfTheUniverse());
    }

    @Test
    void should_choose_override_method() {
        InterfaceWithOverrideDefaultImpl instance = new InterfaceWithOverrideDefaultImpl();

        // TODO:
        //  Please write down your answer directly.
        //
        // <--start
        final String expected = "The truth of the universe is Anime";
        // --end-->

        assertEquals(expected, instance.tellMeTheTruthOfTheUniverse());
    }

    @Test
    void should_choose_override_method_continued() {
        InterfaceExtendsInterfaceWithDefaultMethod instance = new InterfaceExtendsInterfaceWithDefaultMethodImpl();

        // TODO:
        //  Please write down your answer directly.
        //
        // <--start
        final String expected = "The truth of the universe is Game";
        // --end-->

        assertEquals(expected, instance.tellMeTheTruthOfTheUniverse());
    }

    @Test
    void should_resolve_ambiguity_by_yourself() {
        NameImpl instance = new NameImpl();

        String name = instance.getName();

        assertEquals("Person", name);
    }
}
