package blog.aeee.d_pattern.maze

import blog.aeee.d_pattern.maze.define.Direction
import blog.aeee.d_pattern.maze.map.Door
import blog.aeee.d_pattern.maze.map.Maze
import blog.aeee.d_pattern.maze.map.Room
import blog.aeee.d_pattern.maze.map.Wall
import java.io.FileOutputStream
import java.util.stream.Stream

class MazeGame{

    fun CreateMaze(): Maze{
        val maze = Maze()

        val room1 = Room(1)
        val room2 = Room(2)
        val door1_2 = Door(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.North, Wall())
        room1.setSide(Direction.East, door1_2)
        room1.setSide(Direction.South, Wall())
        room1.setSide(Direction.West, Wall())

        room2.setSide(Direction.North, Wall())
        room2.setSide(Direction.East, Wall())
        room2.setSide(Direction.South, Wall())
        room2.setSide(Direction.West, door1_2)



        return  maze;
    }
}