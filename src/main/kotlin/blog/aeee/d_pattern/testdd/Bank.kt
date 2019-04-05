package blog.aeee.d_pattern.testdd

import kotlin.collections.HashMap

class Bank {

    private val rates: HashMap<Pair, Double> = HashMap()

    fun addRate(from: Currency, to: Currency, rate: Int){
        addRate(from, to, rate.toDouble())
    }

    fun addRate(from: Currency, to: Currency, rate: Double){
        rates[Pair(from, to)] = rate
    }

    fun reduce(source: Expression, to: Currency): Money{
        return source.reduce(this, to)
    }

    fun rate(from: Currency, to: Currency): Double = rates[(Pair(from, to))] ?: 1.0
}