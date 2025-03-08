package calculator

import org.scalatest.funsuite.AnyFunSuite

class DivisionTest extends AnyFunSuite {
    test("Calculator.division simple division with two numbers") { 
        val firstNumber = 10 
        val secondNumber = 2

        val result = new Calculator().division(firstNumber, secondNumber)

        val expected = 5

        assert(result == expected, "OK")
    }
}