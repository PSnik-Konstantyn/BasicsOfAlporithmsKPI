package dz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pz_6_4Test {

    @Test
    public void endOther() {
        assertTrue(pz_6_4.endOther("HiabC", "aBc"));
        assertTrue(pz_6_4.endOther("Htwiabc", "ABC"));
        assertTrue(pz_6_4.endOther("HiabCWTF", "wtf"));
        assertFalse(pz_6_4.endOther("wtgjs", "aBc"));
        assertFalse(pz_6_4.endOther("wtfhjk", "wtf"));
    }
}