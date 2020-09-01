package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class CollectionsTest {
    //Hint: https://beginnersbook.com/2013/12/java-arraylist/
    @Test
    void should_go_through_an_iterator() {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("!");
        Iterator<String> iterator = collection.iterator();

        // Hint: You should implement createList() in this class.
        assertIterableEquals(Arrays.asList("Hello", "World", "!"), createList(iterator));
    }

    @SuppressWarnings({"unused", "UnnecessaryLocalVariable"})
    private static List<String> createList(Iterator<String> iterator) {
        List<String> list = new ArrayList<>();

        // TODO:
        //  This function will create a list from an iterator. You could ONLY use
        //  `Iterator.hasNext` and `Iterator.next` API to copy items to a `List`.
        //  No `for` is allowed.
        //
        // <--start
        while (iterator.hasNext()){
            String next = iterator.next();
            list.add(next);
        }
        // --end-->

        return list;
    }



    @Test
    void should_predict_linked_list_operation_result() {
        LinkedList<String> staff = new LinkedList<>();

        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");

        ListIterator<String> iterator = staff.listIterator();
        iterator.next();
        iterator.add("Juliet");
        iterator.previous();
        iterator.remove();

        // TODO:
        //  Please write your answer directly.
        //
        // <--start
        final List<String> expected = Arrays.asList("Amy","Bob","Carl");
        // --end-->

        assertIterableEquals(expected, staff);
    }

    @Test
    void should_reflects_back_to_original_list_for_sub_range() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 12; ++i) {
            integers.add(i);
        }

        List<Integer> subList = integers.subList(3, 10);
        subList.clear();

        // TODO:
        //  Please write down your answer directly.
        //
        // <--start
        final List<Integer> expected = Arrays.asList(0, 1, 2, 10, 11);
        // --end-->

        assertIterableEquals(expected, integers);
    }
}
