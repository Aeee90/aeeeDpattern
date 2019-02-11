package blog.aeee.d_pattern.structural.bridge

open class WindowImp protected constructor(){
    fun impTop() = 0
    fun impBottom() = 0
    fun impSetExtent() = 0
    fun impSetOrigin() = 0

    fun deviceRect() = 0
    fun deviceText() = 0
    fun deviceBitmap() = 0
}