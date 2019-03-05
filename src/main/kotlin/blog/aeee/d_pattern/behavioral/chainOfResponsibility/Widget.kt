package blog.aeee.d_pattern.behavioral.chainOfResponsibility

open class Widget(
        parent: Widget,
        t: Topic = Topic.NO_HELP
): HelpHandler(parent, t) {

    private val _parent: Widget?

    init {
        _parent = parent
    }
}