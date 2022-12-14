package dz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pz_7_2Test {
    @Test
    public void notReplace() {

        assertEquals("test is not", pz_7_2.notReplace("test is"));
        assertEquals("test is not is not", pz_7_2.notReplace("test is is"));
        assertEquals("is not test", pz_7_2.notReplace("is test"));
        assertEquals("is not okay is not lets is not", pz_7_2.notReplace("is okay is lets is"));
        assertEquals("is not is not is not", pz_7_2.notReplace("is is is"));


    }
}