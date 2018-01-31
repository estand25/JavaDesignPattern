package Abstract_Factory_Pattern_2

import Abstract_Factory_Pattern_2.Interfaces.Shape

class Circle : Shape {
    override fun draw() = println("Inside Circle::draw() method.")
}
