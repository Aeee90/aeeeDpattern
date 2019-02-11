package blog.aeee.d_pattern.creational.prototype

import blog.aeee.d_pattern.maze.map.Door
import blog.aeee.d_pattern.maze.map.Maze
import blog.aeee.d_pattern.maze.map.Room
import blog.aeee.d_pattern.maze.map.Wall

class MazePrototypeFactory(
        private val _prototypeMaze: Maze,
        private val _prototypeWall: Wall,
        private val _prototypeRoom: Room,
        private val _prototypeDoor: Door
): MazeFactory() {

    override fun makeDoor(r1: Room, r2: Room): Door {

    }
}