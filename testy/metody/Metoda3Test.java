package metody;

import static org.junit.jupiter.api.Assertions.*;

class Metoda3Test {

    @org.junit.jupiter.api.Test
    void dodaj() {
        assertEquals(7,Metoda3.dodaj(3,4));
    }

    @org.junit.jupiter.api.Test
    void makeArray() {
        int[] ints = {1,2,3,4,5,6,7};

        assertArrayEquals(ints,Metoda3.makeArray());
    }
}