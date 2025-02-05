package Testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


// Calculator class
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

// Test class
public class CalculatorTest {
    // Test for addition
    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "Addition failed"); // Expected: 5
    }

    // Test for subtraction
    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2), "Subtraction failed"); // Expected: 1
    }
}

