package calculator

import org.scalatest.funsuite.AnyFunSuite

class SubtractionTest extends AnyFunSuite {
    test("Calculator.substraction simple subtraction with two numbers") {
        val firstNumber = 5
        val secondNumber = 3

        val result = new Calculator().subtraction(firstNumber, secondNumber)

        val expected = 2

        assert(result == expected)
    }
}