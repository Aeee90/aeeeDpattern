package blog.aeee.d_pattern.structural.composite

open class Equipment {

    private val _name: String

    constructor(): this("ROOT"){}

    constructor(name: String){
        this._name = name
    }

    fun getPower(){}
    fun netPrice(){}
    fun discountPrice(){}

    fun add(child: Equipment){}
    fun remove(child: Equipment){}
}