package blog.aeee.d_pattern.behavioral.observer

import java.util.*
import kotlin.collections.ArrayList

object ClockTimer: Subject {

    val clockList: ArrayList<Observer> = ArrayList()

    override fun attach(observer: Observer) {
        clockList.add(observer)
    }

    override fun detach(observer: Observer) {
        clockList.remove(observer)
    }

    override fun notify(): Int {
        for(clock in clockList) clock.update()

        return 0
    }

    fun getHour(): Int = Calendar.getInstance().get(Calendar.HOUR)
    fun getMinute(): Int = Calendar.getInstance().get(Calendar.MINUTE)
    fun getSecond(): Int = Calendar.getInstance().get(Calendar.SECOND)

    fun tick(){
        notify()

    }


}