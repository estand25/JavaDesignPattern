package Abstract_Factory_Pattern_2

import Abstract_Factory_Pattern_2.Interfaces.Shape

class Rectangle : Shape {
    override fun draw() = println("Inside Rectangle::draw() method.")
}