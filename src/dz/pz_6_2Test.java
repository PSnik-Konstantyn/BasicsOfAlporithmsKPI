package dz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pz_6_2Test {

    @Test
    public void sumDigits() {
        assertEquals(0, pz_6_2.sumDigits("HiabC"));
        assertEquals(6, pz_6_2.sumDigits("aa1bc2d3"));
        assertEquals(8, pz_6_2.sumDigits("aa11b33"));
        assertEquals(1, pz_6_2.sumDigits("Choko1"));
        assertEquals(14, pz_6_2.sumDigits("&68hjs"));

    }
}