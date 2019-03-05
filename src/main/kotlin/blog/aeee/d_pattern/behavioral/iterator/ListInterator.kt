package blog.aeee.d_pattern.behavioral.iterator

class ListInterator<T>(
        private val _list: List<T>
): Iterator<T> {

    private var _current = 0

    override fun first() {
        _current = 0
    }

    override fun next() {
        _current += 1
    }

    override fun isDone(): Boolean = _list.length == _current

    override fun currentItem(): T = _list[_current]

}