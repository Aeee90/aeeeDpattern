package blog.aeee.d_pattern.behavioral.templateMethod

class ConcreteClazz: AbstractClazz() {

    override fun primitiveOperation1() {
        println("Hello, primitiveOperation1 of Concrete")
    }

    override fun primitiveOperation2() {
        println("Hello, primitiveOperation2 of Concrete")
    }
}