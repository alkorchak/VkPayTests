import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun MaestroPercentageTest() {
        val sumLastMonth = 76000_00
        val payMethod = MAESTRO
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(29600 , result)
    }

    @Test
    fun MasterPercentageTest() {
        val sumLastMonth = 76000_00
        val payMethod = MASTER
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(29600 , result)
    }

    @Test
    fun MirPercentageTest() {
        val sumLastMonth = 76000_00
        val payMethod = MIR
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(34500 , result)
    }

    @Test
    fun VisaPercentageTest() {
        val sumLastMonth = 76000_00
        val payMethod = VISA
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(34500 , result)
    }

    @Test
    fun MaestroZeroTest() {
        val sumLastMonth = 75000_00
        val payMethod = MAESTRO
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0 , result)
    }

    @Test
    fun MasterZeroTest() {
        val sumLastMonth = 75000_00
        val payMethod = MASTER
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0 , result)
    }

    @Test
    fun MirMinimalTest() {
        val sumLastMonth = 76000_00
        val payMethod = MIR
        val transferValue = 4000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(3500 , result)
    }

    @Test
    fun VisaMinimalTest() {
        val sumLastMonth = 76000_00
        val payMethod = VISA
        val transferValue = 4000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(3500 , result)
    }

    @Test
    fun feeVkTest() {
        val sumLastMonth = 76000_00
        val payMethod = VK
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0 , result)
    }

    @Test
    fun DefaultTest() {
        val sumLastMonth = 76000_00
        val transferValue = 46000_00

        val result = fee(
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0 , result)
    }

    @Test
    fun EmptyStringPaymentMethodTest() {
        val sumLastMonth = 76000_00
        val payMethod = ""
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0 , result)
    }
}