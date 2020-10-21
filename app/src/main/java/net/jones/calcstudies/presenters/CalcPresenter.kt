package net.jones.calcstudies.presenters

import net.jones.calcstudies.data.Operators

interface CalcPresenter {
    fun pressNumber(pressedNumber: String)
    fun displayResult(result: String)
    fun clearDisplay()
    fun onClickClearButton()
    fun setActualOperator(actualOperator: Operators)
}
