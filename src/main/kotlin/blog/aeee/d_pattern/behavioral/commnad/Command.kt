package blog.aeee.d_pattern.behavioral.commnad

interface Command {
    fun execute()
    fun unexecute()
}