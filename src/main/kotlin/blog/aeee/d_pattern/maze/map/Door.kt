package blog.aeee.d_pattern.maze.map


class Door(val pre: Room, val aft: Room): MapSite {


    private var isOpen: Boolean = false

    override fun enter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    fun otherSideFrom(room: Room): Room = aft
}