package blog.aeee.d_pattern.behavioral.observer

class DigitClock: Observer {

    init {
        ClockTimer.attach(this)
    }


    fun draw(){

    }

    override fun update() {
        draw()
    }

    fun close(){
        ClockTimer.detach(this)
    }
}