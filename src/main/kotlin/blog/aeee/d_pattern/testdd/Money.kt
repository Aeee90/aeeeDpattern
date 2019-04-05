package blog.aeee.d_pattern.testdd

class Money (
        val amount: Int,
        val currency: Currency
): Expression {

    companion object {
        fun dollars(amount: Int): Money = Money(amount, Currency.DOLLAR)
        fun franc(amount: Int): Money = Money(amount, Currency.FRANC)
    }

    override fun equals(other: Any?): Boolean {
        val to = other as Money
        return amount == to.amount && currency == to.currency
    }

    override fun reduce(bank: Bank, to: Currency): Money = Money((amount / bank.rate(currency, to) ).toInt(), to)
    override operator fun plus(addend: Expression): Expression = Sum(this, addend)
    override operator fun times(multiplier: Int): Expression = Multiple(this, multiplier)
}