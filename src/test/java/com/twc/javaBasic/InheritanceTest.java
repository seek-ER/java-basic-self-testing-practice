package com.twc.javaBasic;

import com.twc.javaBasic.util.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InheritanceTest {
    @Test
    void should_be_derived_from_object_class() {
        // TODO:
        //  Please write down the class type directly.
        //
        // <--start
        final Class<?> expectedSuperClass = new Object().getClass();
        // --end-->

        assertEquals(expectedSuperClass, SimpleEmptyClass.class.getSuperclass());
    }

    @Test
    void should_call_super_class_constructor() {
        DerivedFromSuperClassWithDefaultConstructor instance = new DerivedFromSuperClassWithDefaultConstructor();

        // TODO:
        //  You should write the answer directly.
        // Hint: check https://beginnersbook.com/2013/03/constructors-in-java/
        //
        // <--start
        final String[] expected = {"SuperClassWithDefaultConstructor.constructor()","DerivedFromSuperClassWithDefaultConstructor.constructor()"};
        // --end-->

        String[] logs = instance.getLogs();

        assertArrayEquals(expected, logs);
    }



    @Test
    void should_call_most_derived_methods() {
        BaseClassForOverriding instance = new DerivedFromBaseClassForOverriding();

        // TODO:
        //  You should write the answer directly.
        // Hint: https://beginnersbook.com/2014/01/method-overriding-in-java-with-example/
        // <--start
        final String expectedName = "DerivedFromBaseClassForOverriding";
        // --end-->

        assertEquals(expectedName, instance.getName());
    }

    @Test
    void should_call_super_class_methods() {
        DerivedFromBaseClassForOverridingCallingSuper instance = new DerivedFromBaseClassForOverridingCallingSuper();

        // TODO: You should write the answer directly.
        // <--start
        final String expectedName = "BaseClassForOverriding->DerivedFromBaseClassForOverridingCallingSuper";
        // --end-->

        assertEquals(expectedName, instance.getName());
    }

}
