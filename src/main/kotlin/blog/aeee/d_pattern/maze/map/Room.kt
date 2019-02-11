package blog.aeee.d_pattern.maze.map

import blog.aeee.d_pattern.maze.define.Direction

class Room(val roomNo: Int) : MapSite {

    private val sides: ArrayList<MapSite> = ArrayList()

    override fun enter(){}
    fun getSide(direction: Direction){}
    fun setSide(direction: Direction, mapSite: MapSite){}
}