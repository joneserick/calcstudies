package net.jones.calcstudies.presenters

import net.jones.calcstudies.ui.CalcContract

class CalcPresenterImpl(private val view: CalcContract) : CalcPresenter {

    override fun pressNumber(pressedNumber: String) {
        view.displayNumber(pressedNumber)
    }
}