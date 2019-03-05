package blog.aeee.d_pattern.behavioral.chainOfResponsibility

class Button(parent: Widget, t: Topic = Topic.NO_HELP): Widget(parent, t) {

    override fun handleHelp() {
        if(hasHelp()) {
            //보여줄 도움말이 있다면 정의
        }else{
            super.handleHelp()
        }
    }
}