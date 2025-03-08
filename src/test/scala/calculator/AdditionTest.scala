package calculator

import org.scalatest.funsuite.AnyFunSuite

class AdditionTest extends AnyFunSuite {
    test("Calculator.addition simple addition with two numbers") {
        val firstNumber = 1
        val secondNumber = 2

        val result = new Calculator().addition(firstNumber, secondNumber)

        val expected = 3

        assert(result == expected)
    }
}