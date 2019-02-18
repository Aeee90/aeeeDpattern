package blog.aeee.d_pattern

import blog.aeee.d_pattern.structural.proxy.Proxy

private lateinit var proxy: Proxy

fun main(args: Array<String>) {
    println(::proxy.isInitialized)
}