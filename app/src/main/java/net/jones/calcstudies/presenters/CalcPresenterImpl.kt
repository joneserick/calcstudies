package net.jones.calcstudies.presenters

import net.jones.calcstudies.data.Operators
import net.jones.calcstudies.ui.CalcContract

class CalcPresenterImpl(private val view: CalcContract) : CalcPresenter {

    val DEFAULT_NUMBER = 0.0

    override fun pressNumber(pressedNumber: String) {
        view.displayNumber(pressedNumber)
    }

    override fun displayResult(result: String) {
        view.displayResult(result)
    }

    override fun clearDisplay() {
        view.clearDisplay()
    }

    override fun onClickClearButton() {
        view.clearActualOperator()
    }

    override fun setActualOperator(actualOperator: Operators) {
        view.setActualOperator(actualOperator)
    }

    override fun runOperation(
        storedValue: Double,
        informedValue: Double,
        operator: Operators
    ): Double {
        return when(operator) {
            Operators.SUM -> storedValue + informedValue
            Operators.MULTIPLY -> storedValue * informedValue
            Operators.DIVIDE ->  storedValue / informedValue
            Operators.SUBTRACT -> storedValue - informedValue
            else -> DEFAULT_NUMBER
        }
    }
}