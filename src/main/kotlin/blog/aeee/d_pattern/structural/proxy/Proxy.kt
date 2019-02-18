package blog.aeee.d_pattern.structural.proxy

class Proxy: Subject{
    private lateinit var realSubject: RealSubject

    override fun request() {
        if(::realSubject.isInitialized) realSubject = RealSubject()
        realSubject.request()
    }

}