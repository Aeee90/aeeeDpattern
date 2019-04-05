package blog.aeee.d_pattern.testdd

class Multiple(
        private val augend: Expression,
        private val multiplier: Int
): Expression{

    override fun reduce(bank: Bank, to: Currency): Money = Money(augend.reduce(bank, to).amount * multiplier, to)
    override operator fun plus(addend: Expression): Expression = Sum(this, addend)
    override operator fun times(multiplier: Int): Expression = Multiple(this, multiplier)

}
