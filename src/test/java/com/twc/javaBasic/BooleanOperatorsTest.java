package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BooleanOperatorsTest {
  @SuppressWarnings({"PointlessBooleanExpression", "ConstantConditions"})
  @Test
  void should_perform_logical_boolean_operations() {
    boolean[] actualResults = {
      true && true,
      true && false,
      false && false,
      true || true,
      true || false,
      false || false,
      true & true,
      true & false,
      false & false,
      true | true,
      true | false,
      false | false,
      3 == 7,
      4 != 5
    };

    // TODO:
    //  please write your answers directly(modify the value of expectedResult to equal actualResults).
    //
    // <--start
    boolean[] expectedResult = {true,false,false,true,true,false,true,false,false,true,true,false,false,true};
    // --end-->

    assertArrayEquals(expectedResult, actualResults);
  }
}
