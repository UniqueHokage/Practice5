open class Point() {
    var x:Double? = null
    var y:Double? = null
    constructor(_x: Double, _y: Double) : this() {
        x = _x
        y = _y
    }
open fun println(){
    println("Точки x=$x, y=$y")
}
}
