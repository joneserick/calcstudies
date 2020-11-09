package net.jones.calcstudies.test.presenters

import net.jones.calcstudies.data.Operators
import net.jones.calcstudies.presenters.CalcPresenter
import net.jones.calcstudies.presenters.CalcPresenterImpl
import net.jones.calcstudies.ui.CalcContract
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class CalcPresenterTest {

    @Mock
    private lateinit var view: CalcContract
    private lateinit var presenter: CalcPresenter

    @Before
    fun setup() {
        view = mock(CalcContract::class.java)
        MockitoAnnotations.openMocks(this)
        presenter = CalcPresenterImpl(view)
    }

    @Test
    fun shouldDisplayNumberOnTheDisplay() {
        val pressedNumber = "5.0"
        presenter.pressNumber(pressedNumber)
        verify(view).displayNumber(pressedNumber)
    }

    @Test
    fun shouldDisplayResult() {
        val result = "120.0"
        presenter.displayResult(result)
        verify(view).displayResult(result)
    }

    @Test
    fun shouldClearTheActualOperator() {
        presenter.onClickClearButton()
        verify(view).clearActualOperator()
    }

    @Test
    fun shouldSetSumAsOperator() {
        val actualOperator = Operators.SUM
        presenter.setActualOperator(actualOperator)
        verify(view).setActualOperator(actualOperator)
    }

    @Test
    fun shouldSumValues() {
        val storedValue = 12.0
        val informedValue = 15.0
        val operator = Operators.SUM
        var result = 0.0
        result = presenter.runOperation(storedValue, informedValue, operator)
        Assert.assertEquals(27.0, result, 0.0)
    }

}