package dz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pz_7_3Test {

    @Test
    public void countClumps() {
        int [] arr1 = {1, 2, 2, 3, 4, 4, 7, 9, 9, 9, 9};
        int [] arr2 = {1, 1, 1, 1};
        int [] arr3 = {1, 2, 3 , 4, 5};
        int [] arr4 = {1, 2, 2, 3, 4, 4, 7, 9, 9, 9, 10};
        int [] arr5 = {1, 2, 2, 3, 4, 4, 7};
        assertEquals(3, pz_7_3.countClumps(arr1));
        assertEquals(1, pz_7_3.countClumps(arr2));
        assertEquals(0, pz_7_3.countClumps(arr3));
        assertEquals(3, pz_7_3.countClumps(arr4));
        assertEquals(2, pz_7_3.countClumps(arr5));

    }

}