package blog.aeee.d_pattern.behavioral.iterator

class List<T>{
    private lateinit var _list: Array<T>
    var length = 10

    operator fun get(idx: Int) = _list[idx]
}