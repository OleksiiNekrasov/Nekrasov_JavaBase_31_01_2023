package com.hillel.Nekrasov.home.homework18;

import com.hillel.nekrasov.home_works.works18.ArrayUtil;
import com.hillel.nekrasov.home_works.works18.Average;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;






public class TestArrayUtil {


    @Test
    void TestMethod1() {
        int[][] array = new int[3][3];

        ArrayUtil.isQuadratic(array);

        Assertions.assertTrue(true);
    }


    @Test
    void TestMethod2() {
        int[] array = {22,33,44,55};
        int average = Average.SumAverage(array);

        assertThat((array),(average));
    }

    private void assertThat(int[]  sumAverage, int b) {
    }
}



