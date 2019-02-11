package blog.aeee.d_pattern.structural.decorate

open class Decorator(
        private val _visualComponent: VisualComponent
): VisualComponent() {

    open override fun draw() {}
}