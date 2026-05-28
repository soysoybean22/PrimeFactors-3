import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

    PrimeFactor primeFactor;

    @BeforeEach
    void setUp() throws Exception {
        primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimeFactorOf01() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimeFactorOf02() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }

    @Test
    void testPrimeFactorOf03() {
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    void testPrimeFactorOf04() {
        assertEquals(Arrays.asList(2, 2), primeFactor.of(4));
    }

    @Test
    void testPrimeFactorOf06() {
        assertEquals(Arrays.asList(2, 3), primeFactor.of(6));
    }

    @Test
    void testPrimeFactorOf09() {
        assertEquals(Arrays.asList(3, 3), primeFactor.of(9));
    }
}