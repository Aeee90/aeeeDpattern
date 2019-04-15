package blog.aeee.d_pattern.behavioral.state

class Context {

    lateinit var state: State

    fun request(){
        state.handle()
    }
}