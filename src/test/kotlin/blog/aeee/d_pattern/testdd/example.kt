package blog.aeee.d_pattern.testdd

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner



@RunWith(SpringRunner::class)
@SpringBootTest
class example {

    @Test
    fun testSumMoneyByBank(){
        val fiveD = Money.dollars(5)
        val tenF = Money.franc(10)

        val bank = Bank()
        bank.addRate(Currency.FRANC, Currency.DOLLAR, 2.0)

        val sum: Expression = fiveD + tenF + fiveD
        val result: Money = bank.reduce(sum, Currency.DOLLAR)

        assert(true){
            result == Money.dollars(15)
        }
    }

    @Test
    fun testMultipleMoneyByBank(){
        val fiveD = Money.dollars(5)
        val tenF = Money.franc(10)

        val bank = Bank()
        bank.addRate(Currency.FRANC, Currency.DOLLAR, 2.0)

        val sumWithoutOperator = fiveD.plus(tenF.times(10)).plus(fiveD)
        val sum =   fiveD + tenF * 10 + fiveD
        val result = bank.reduce(sum, Currency.DOLLAR)

        assert(true) {
            result == Money.dollars(60)
        }
    }
}