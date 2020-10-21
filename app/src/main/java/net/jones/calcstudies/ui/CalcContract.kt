package net.jones.calcstudies.ui

import net.jones.calcstudies.data.Operators

interface CalcContract {
    fun displayNumber(number: String)
    fun displayResult(result: String)
    fun clearDisplay()
    fun clearActualOperator()
    fun setActualOperator(actualOperator: Operators)
}
