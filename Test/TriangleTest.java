import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @BeforeAll
    static void setUP() {
    }


    private int[] costats = new int[] {2,4,2,3,4};
    @BeforeAll
    static void setUpBeforeAll() {

    }
    @Test
    void triangle_Equilater() {
        Triangle.Tipus elTipus = Triangle.Tipus.Equilater;
        int[] costats = {};
        int[] valorEsperat = null;
        int[] valorObtingut = Triangle.trobaTriangle(elTipus, costats);

        assertArrayEquals(valorEsperat, valorObtingut);
    }
    @Test
    void test(){
        assertTrue(true);
    }



}