package blog.aeee.d_pattern.testdd

class Sum(
        private val augend: Expression,
        private val addend: Expression
): Expression {

    override fun reduce(bank: Bank, to: Currency): Money{
        return Money(augend.reduce(bank, to).amount + addend.reduce(bank, to).amount, to)
    }

    override operator fun plus(addend: Expression): Expression = Sum(this, addend)
    override operator fun times(multiplier: Int): Expression = Multiple(this, multiplier)
}