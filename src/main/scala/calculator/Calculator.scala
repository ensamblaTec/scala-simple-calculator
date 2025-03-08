package calculator

class Calculator {
    private[calculator] def addition(firstNumber: Double, secondNumber: Double): Double = {
        firstNumber + secondNumber
    }

    private[calculator] def subtraction(firstNumber: Double, secondNumber: Double): Double = {
        firstNumber - secondNumber
    }

    private[calculator] def multiply(firstNumber: Double, secondNumber: Double): Double = {
        firstNumber * secondNumber
    }

    private[calculator] def division(firstNumber: Double, secondNumber: Double): Double = {
        if (secondNumber == 0) {
            0
        }

        firstNumber / secondNumber
    }
}