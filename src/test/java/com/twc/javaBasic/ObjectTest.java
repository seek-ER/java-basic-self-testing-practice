package com.twc.javaBasic;

import com.twc.javaBasic.util.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ObjectTest {


    @SuppressWarnings("ConstantConditions")
    @Test
    void should_initialized_to_default_value() {
        FieldNotExplicitlyInitialized instance = new FieldNotExplicitlyInitialized();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 172 of "Core Java Vol 1", section 4.6.2.
        // <--start
        final String expectedName = null;
        final int expectedYearOfBirth = 0;
        final LocalDate expectedRegisteredDate = null;
        // --end-->

        assertEquals(expectedName, instance.getName());
        assertEquals(expectedYearOfBirth, instance.getYearOfBirth());
        assertEquals(expectedRegisteredDate, instance.getRegisteredDate());
    }



    @SuppressWarnings({"UnnecessaryLocalVariable", "unused"})
    @Test
    void should_pass_by_value_continued() {
        Object objectReference = new Object();
        final Object sameReference = objectReference;

        Object instanceCreatedByMethod = tryingToUpdateReference(objectReference);

        // TODO:
        //  Please write down your answer directly. You can only choose from
        //  `sameReference` and `instanceCreatedByMethod`.
        //
        // <--start
        final Object expected = sameReference;
        // --end-->

        assertEquals(expected, objectReference);
    }

    @Test
    void should_modify_internal_state() {
        SimpleObjectWithInternalState instance = new SimpleObjectWithInternalState("Initial Name");

        tryingToUpdateState(instance);

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 164 of "Core Java Vol 1", section 4.5.
        // <--start
        final String expected = "Updated Name";
        // --end-->

        assertEquals(expected, instance.getName());
    }

    private static void tryingToUpdateState(SimpleObjectWithInternalState instance) {
        instance.setName("Updated Name");
    }

    @SuppressWarnings("ParameterCanBeLocal")
    private static Object tryingToUpdateReference(Object object) {
        object = new Object();
        return object;
    }
}
