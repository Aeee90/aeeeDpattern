package blog.aeee.d_pattern.structural.bridge

open class Window(
        private val _contents: View
){

    private lateinit var _imp: WindowImp

    fun getView() = _contents

    fun drawContents(){}
    fun open(){}
    fun close(){}
    fun iconify(){}
    fun deiconify(){}

    fun setOrigin(){}
    fun setExtent(){}
    fun raise(){}
    fun lower(){}

    fun drawLine(){}
    fun drawRect(){}
    fun drawPolygon(){}
    fun drawText(){}


    class View{}
}