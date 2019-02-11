package blog.aeee.d_pattern.creational.builder

import blog.aeee.d_pattern.maze.map.Maze
import blog.aeee.d_pattern.maze.map.Room

open class MazeBuilder protected constructor(){

    open fun buildMaze(){}
    open fun buildRoom(roomNo: Int){}
    open fun buildDoor(from: Int, to: Int){}

    open  fun getMaze(): Maze{
        return Maze()
    }
}