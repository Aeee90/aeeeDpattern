package blog.aeee.d_pattern.testdd

class Pair(
        val from: Currency,
        val to: Currency
) {

    override fun equals(other: Any?): Boolean {
        val pair = other as Pair
        return from == pair.from && to == pair.to
    }

    override fun hashCode(): Int {
        return 0
    }
}