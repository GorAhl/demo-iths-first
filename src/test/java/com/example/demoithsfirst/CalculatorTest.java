package com.example.demoithsfirst;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Testar kalkylator klassen")
public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void beforeTests() {
        //turnOnTheComputer()
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Adderar två siffror med rätt resultat")
    void addingTwoNumbersShouldReturnSum() {
        int a = 2;
        int b = 3;
        int result = calculator.add(a,b);
        int expectedResult = 5;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Adderar två siffror med fel resultat")
    void addingTwoNumbersShouldNotReturnFive() {
        int a = 3;
        int b = 3;
        int result = calculator.add(a,b);
        int expectedResult = 5;
        Assertions.assertNotEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Adderar två nollor")
    void addingZeroAndZero() {
        int zero = 0;
        int result = calculator.add(zero, zero);
        int expectedResoult = 0;
        Assertions.assertEquals(expectedResoult, result);
    }

    @Test
    @DisplayName("Adderar två negativa tal")
    void addingNegativNumbers() {
        int a = -1;
        int b = -2;
        int result = calculator.add(a, b);
        int expectedResult = -3;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Subtraherar två siffror med rätt resultat")
    void subtractOneNumberFromAnother() {
        int a = 5;
        int b = 3;
        int result = calculator.subtract(a, b);
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplicerar två siffror med rätt resultat")
    void multiplyTwoNumbers() {
        int a = 2;
        int b = 3;
        int expectedResult = 6;
        int result  = calculator.multiply(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Dividerar två siffror med rätt resultat")
    void divideTwoNumbers() {
        int a = 8;
        int b = 4;
        double result = calculator.divide(a, b);
        double expectedResult = 2;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Roten ur 25 med rätt resultat")
    void squareRootOfTwentyFive() {
        int a = 25;
        double expectedResult = 5;
        double result = calculator.squareRootOf(a);
        Assertions.assertEquals(expectedResult, result);
    }


    @AfterEach
    void afterTest() {
        //Logout, clear the database...or something
    }

    @AfterAll
    static void afterTests() {
        /*
        turnOffTheComputerAndPullThePlug()
        MySelf.goHome()
        */
    }
}
