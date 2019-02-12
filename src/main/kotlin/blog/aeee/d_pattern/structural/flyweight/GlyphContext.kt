package blog.aeee.d_pattern.structural.flyweight

class GlyphContext {

    private var _index = 0

    fun next(step:Int = 1){}
    fun insert(quantity:Int = 1){}

    fun getFont(): Glyph.Font = Glyph.Font()
    fun setFont(font: Glyph.Font, span:Int = 1){}
}