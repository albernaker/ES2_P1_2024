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
    void triangle_EquilaterMalament() {
        Triangle.Tipus elTipus = Triangle.Tipus.Equilater;
        int[] costats = {};
        int[] valorEsperat = null;
        int[] valorObtingut = Triangle.trobaTriangle(elTipus, costats);

        assertArrayEquals(valorEsperat, valorObtingut);
    }
    @Test
    void triangle_EquilaterCorrecte() {
        Triangle.Tipus elTipus = Triangle.Tipus.Equilater;
        int[] costats = {3, 3, 3};
        int[] valorEsperat = {3, 3, 3};
        int[] valorObtingut = Triangle.trobaTriangle(elTipus, costats);

        assertArrayEquals(valorEsperat, valorObtingut);
    }
    @Test
    void triangle_CaminIsosceles() {
        Triangle.Tipus elTipus = Triangle.Tipus.Isosceles;
        int[] costats = {2, 4, 4};
        int[] valorEsperat = {2, 4, 4};
        int[] valorObtingut = Triangle.trobaTriangle(elTipus, costats);

        assertArrayEquals(valorEsperat, valorObtingut);
    }

    @Test
    void triangle_CaminEscale() {
        Triangle.Tipus elTipus = Triangle.Tipus.Escale;
        int[] costats = {2, 3, 4};
        int[] valorEsperat = {2, 3, 4};
        int[] valorObtingut = Triangle.trobaTriangle(elTipus, costats);

        assertArrayEquals(valorEsperat, valorObtingut);
    }
}