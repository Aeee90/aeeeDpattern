package blog.aeee.d_pattern.structural.facade

import java.io.InputStream

class Scanner(
        private val _inputStream: InputStream
){

    fun scna(): Token = Token()

    class Token{

    }

}