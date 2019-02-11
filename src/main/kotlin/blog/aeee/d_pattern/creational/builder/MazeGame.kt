package blog.aeee.d_pattern.creational.builder

import blog.aeee.d_pattern.maze.define.Direction
import blog.aeee.d_pattern.maze.map.Maze

class MazeGame{

    fun createMaze(builder: MazeBuilder): Maze {
        builder.buildMaze()

        builder.buildRoom(1)
        builder.buildRoom(2)
        builder.buildDoor(1, 2)


        return builder.getMaze()
    }
}