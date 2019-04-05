package blog.aeee.d_pattern.testdd

interface Expression {
    fun reduce(bank: Bank, to: Currency): Money
    operator fun plus(addend: Expression): Expression
    operator fun times(multiplier: Int): Expression
}