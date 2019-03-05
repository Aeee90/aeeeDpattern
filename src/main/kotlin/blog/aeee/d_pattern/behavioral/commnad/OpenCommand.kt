package blog.aeee.d_pattern.behavioral.commnad

import com.apple.eawt.Application

class OpenCommand (
        private val application: Application
): Command {

    override fun execute() {

    }

    override fun unexecute() {

    }
}