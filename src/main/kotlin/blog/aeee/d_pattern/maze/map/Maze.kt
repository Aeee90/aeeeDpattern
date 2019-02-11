package blog.aeee.d_pattern.maze.map

class Maze {

    private val rooms: HashMap<Int, Room> = HashMap()

    fun addRoom(room: Room){ this.rooms.put(room.roomNo, room) }

    fun getRoom(roomNo: Int) =  this.rooms[roomNo]
}