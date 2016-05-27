package com.fivecubits.ga;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDataClass {

  @Test
  public void testLombok() throws Exception {
    DataClass dataClass = new DataClass();
    dataClass.setNum(5);
    dataClass.setWord("test");
    assertEquals(dataClass.getNum(), 5);
    assertEquals(dataClass.getWord(), "test");
  }

}
