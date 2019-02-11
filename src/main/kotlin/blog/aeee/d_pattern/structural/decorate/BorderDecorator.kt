package blog.aeee.d_pattern.structural.decorate

class BorderDecorator(
        visualComponent: VisualComponent
): Decorator(visualComponent){

    override fun draw() {
        //구현
    }

    private fun drawBorder(thick: Int){
        //각 독립적인 기능을 private로 구현하여 사용한다.
        //그리고 각 기능은 독립적이여서 다른 component에 영향을 주지 않기 때문에 투명(transparent)하다.
    }
}