package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheSumOf67Test {

  private int[][] sumParams = {
      {1, 2, 2},
      {1, 2, 2, 6, 99, 99, 7},
      {1, 1, 6, 7, 2},
      {1, 6, 2, 2, 7, 1, 6, 99, 99, 7},
      {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7},
      {2, 7, 6, 2, 6, 7, 2, 7},
      {2, 7, 6, 2, 6, 2, 7},
      {1, 6, 7, 7},
      {6, 7, 1, 6, 7, 7},
      {6, 8, 1, 6, 7},
      {},
      {6, 7, 11},
      {11, 6, 7, 11},
      {2, 2, 6, 7, 7}
  };

  private int[] sumExpected = {5, 5, 4, 2, 2, 18, 9, 8, 8, 0, 0, 11, 22, 11};


  @Test
  void sumTest() {
    for (int i = 0; i < sumParams.length; i++) {
      int actual = CodingBatTheSumOf67.sum67(sumParams[i]);
      Assertions.assertEquals(actual, sumExpected[i]);
    }
  }

}