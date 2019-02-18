package blog.aeee.d_pattern.creational.methodfactory

import blog.aeee.d_pattern.maze.define.Direction
import blog.aeee.d_pattern.maze.map.Door
import blog.aeee.d_pattern.maze.map.Maze
import blog.aeee.d_pattern.maze.map.Room
import blog.aeee.d_pattern.maze.map.Wall

class MazeGame{

    //factory methods
    fun makeMaze(): Maze{ return Maze() }
    fun makeRoom(roomNo: Int): Room{ return Room(roomNo)}
    fun makeWall(): Wall{ return Wall() }
    fun makeDoor(r1: Room, r2: Room): Door{ return Door(r1, r2) }

    fun createMaze(): Maze{
        val maze = makeMaze()

        val room1 = makeRoom(1)
        val room2 = makeRoom(2)
        val door1_2 = makeDoor(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.North, makeWall())
        room1.setSide(Direction.East, door1_2)
        room1.setSide(Direction.South, makeWall())
        room1.setSide(Direction.West, makeWall())

        room2.setSide(Direction.North, makeWall())
        room2.setSide(Direction.East, makeWall())
        room2.setSide(Direction.South, makeWall())
        room2.setSide(Direction.West, door1_2)

        return maze;
    }
}