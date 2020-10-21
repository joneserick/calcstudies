package net.jones.calcstudies.presenters

import net.jones.calcstudies.data.Operators
import net.jones.calcstudies.ui.CalcContract

class CalcPresenterImpl(private val view: CalcContract) : CalcPresenter {

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
}