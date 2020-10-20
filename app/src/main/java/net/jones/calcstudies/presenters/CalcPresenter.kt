package net.jones.calcstudies.presenters

interface CalcPresenter {
    fun pressNumber(pressedNumber: String)
    fun displayResult(result: String)
    fun clearDisplay()
    fun clearDisplayLastDigit(valueOnDisplay: String): String
}
