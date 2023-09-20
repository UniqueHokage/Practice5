 open class ColoredPoint():Point() {
    var color: String? = null
    constructor(_x:Double, _y:Double, _color: String): this(){
        color = _color
        x = _x
        y = _y

    }

    override fun println() {
        println("Точки x=$x, y=$y, цвет:$color")
    }
}