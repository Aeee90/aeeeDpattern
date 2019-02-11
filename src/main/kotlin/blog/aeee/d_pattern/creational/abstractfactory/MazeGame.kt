package blog.aeee.d_pattern.creational.abstractfactory

import blog.aeee.d_pattern.maze.define.Direction
import blog.aeee.d_pattern.maze.map.Maze

class MazeGame{

    fun createMaze(factory: MazeFactory): Maze {
        val aMaze = factory.makeMaze()
        val room1 = factory.makeRoom(1)
        val room2 = factory.makeRoom(2)
        val aDoor = factory.makeDoor(room1, room2)

        room1.setSide(Direction.North, factory.makeWall())
        room1.setSide(Direction.East, aDoor)
        room1.setSide(Direction.South, factory.makeWall())
        room1.setSide(Direction.West, factory.makeWall())

        room2.setSide(Direction.North, factory.makeWall())
        room2.setSide(Direction.East, factory.makeWall())
        room2.setSide(Direction.South, factory.makeWall())
        room2.setSide(Direction.West, aDoor)

        return aMaze
    }
}