case class Triangle(x: Double, y: Double, z: Double) {
    def isTriangle: Boolean = (x > 0 && y > 0 && z> 0) && (x+y >= z && x+z >= y && y+z >= x)
    def equilateral: Boolean = isTriangle && x == y && y == z
    def isosceles: Boolean = isTriangle && (x == y | y == z | x== z)
    def scalene: Boolean = isTriangle && x != y && y != z && x != z
}
