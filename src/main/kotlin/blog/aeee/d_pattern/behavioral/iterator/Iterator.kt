package blog.aeee.d_pattern.behavioral.iterator

interface Iterator<T> {

    fun first()
    fun next()
    fun isDone(): Boolean
    fun currentItem(): T
}