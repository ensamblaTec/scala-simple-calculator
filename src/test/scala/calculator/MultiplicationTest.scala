package calculator

import org.scalatest.funsuite.AnyFunSuite

class MultiplyTest extends AnyFunSuite {
    test("Calculator.multiplication simple multiplication with two numbers") {
        val firstNumber = 5
        val secondNumber = 3

        val result = new Calculator().multiply(firstNumber, secondNumber)

        val expected = 15

        assert(result == expected)
    }
}