import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private int[] costats = new int[] {2,4,2,3,4};
    @BeforeAll
    static void setUpBeforeAll() {

    }
    @Test
    void test_Equilater(){
        int[] result = Triangle.trobaTriangle(Triangle.Tipus.Equilater,costats);
        int[] resperat = new int[]{2,2,2};
    }
    @Test
    void test(){
        assertTrue(true);
    }



}