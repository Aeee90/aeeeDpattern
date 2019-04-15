package blog.aeee.d_pattern.behavioral.visitor

class Element{
    fun accept(visitor: Visitor){
        visitor.visitElementA(this)
        visitor.visitElementB(this)
    }
}