import java.awt.Color

fun main(args: Array<String>) {
    val Point = Point(1.0, 2.8)
    Point.println()
    val ColoredPoint = ColoredPoint(2.0, 2.0,"Белый")
    ColoredPoint.println()
    val Line = Line (2.3,6.4,1.2,4.0)
    Line.println()
    val ColoredLine = ColoredLine(2.3,6.4,1.2,4.0, "черный")
    ColoredLine.println()
}
