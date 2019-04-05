package blog.aeee.d_pattern.behavioral.chainOfResponsibility

open class HelpHandler(s: HelpHandler, t: Topic){

    private val successor: HelpHandler?
    private val topic: Topic


    init {
        successor = s
        topic = t
        _successor(s)
    }

    private fun _successor(s: HelpHandler){
    }

    open fun handleHelp(){
        successor?.handleHelp()
    }

    protected fun hasHelp(): Boolean = topic != Topic.NO_HELP

}