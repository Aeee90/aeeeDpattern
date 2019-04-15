package blog.aeee.d_pattern.behavioral.visitor

class Element{
    fun accept(visitor: Visitor){
        visitor.visitElementA()
        visitor.visitElementB(this)
    }
}