package blog.aeee.d_pattern.behavioral.templateMethod

abstract class AbstractClazz {

    fun templateMethod(){
        primitiveOperation1()

        primitiveOperation2()
    }

    abstract fun primitiveOperation1()
    abstract fun primitiveOperation2()
}