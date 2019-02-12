package blog.aeee.d_pattern.structural.flyweight

open class Glyph{
    open fun draw(window: Window, glyphContext: GlyphContext){}

    fun setFont(font: Font, glyphContext: GlyphContext){}
    fun getFont(glyphContext: GlyphContext) = Font()

    fun first(glyphContext: GlyphContext){}
    fun next(glyphContext: GlyphContext){}
    fun isDone(glyphContext: GlyphContext){}
    fun current(glyphContext: GlyphContext) = glyphContext

    fun insert(glyph: Glyph, glyphContext: GlyphContext){}
    fun remove(glyphContext: GlyphContext){}


    class Window{}
    class Font{}
}