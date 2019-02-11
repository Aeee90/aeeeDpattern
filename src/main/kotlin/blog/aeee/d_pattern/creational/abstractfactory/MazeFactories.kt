package blog.aeee.d_pattern.creational.abstractfactory

import blog.aeee.d_pattern.maze.map.Door
import blog.aeee.d_pattern.maze.map.Room

class EnchantedMazeFactory: MazeFactory() {

    override fun makeRoom(roomNo: Int): Room {
        //return EnchantedRoom(roomNo, CastSpell())
        return super.makeRoom(roomNo)
    }

    override fun makeDoor(r1: Room, r2: Room): Door {
        //return DoorNeedingSpell(r1, r2)
        return super.makeDoor(r1, r2)
    }

}

class BombedMazeFactory: MazeFactory() {

    override fun makeRoom(roomNo: Int): Room {
        //return EnchantedRoom(roomNo, CastSpell())
        return super.makeRoom(roomNo)
    }

    override fun makeDoor(r1: Room, r2: Room): Door {
        //return DoorNeedingSpell(r1, r2)
        return super.makeDoor(r1, r2)
    }

}