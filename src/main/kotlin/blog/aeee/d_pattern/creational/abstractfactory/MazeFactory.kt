package blog.aeee.d_pattern.creational.abstractfactory

import blog.aeee.d_pattern.maze.map.Door
import blog.aeee.d_pattern.maze.map.Maze
import blog.aeee.d_pattern.maze.map.Room
import blog.aeee.d_pattern.maze.map.Wall

open class MazeFactory {

    open fun makeMaze(): Maze = Maze()
    open fun makeWall(): Wall = Wall()
    open fun makeRoom(roomNo: Int): Room = Room(roomNo)
    open fun makeDoor(r1: Room, r2: Room) = Door(r1, r2)
}