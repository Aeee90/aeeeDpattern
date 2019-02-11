package blog.aeee.d_pattern.creational.prototype

import blog.aeee.d_pattern.maze.map.MapSite
import blog.aeee.d_pattern.maze.map.Room
import java.util.*

class PrototypeDoor(val pre: Room, val aft: Room): MapSite, Cloneable {


    private var isOpen: Boolean = false

    override fun enter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    fun otherSideFrom(room: Room): Room = aft

    override fun clone(): PrototypeDoor{
        return super.clone() as PrototypeDoor
        //원형의 객체의 속성을 복사하여 새로운 클래스 제공한다.
    }

    fun initialize(){
        //clone 메서드를 통해 속성을 변경하면 기존 원형이 뒤족박죽이 된다.
    }
}