package blog.aeee.d_pattern.behavioral.observer

interface Subject {

    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notify(): Int
}