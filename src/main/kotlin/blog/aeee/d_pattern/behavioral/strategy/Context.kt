package blog.aeee.d_pattern.behavioral.strategy

class Context {
    var strategy: Strategy = ConcreateStarategyA()

    fun contextInterface() {
        strategy.algorithmlnterface()
    }
}