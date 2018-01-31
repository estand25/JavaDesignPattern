package Factory_Pattern_1

import Factory_Pattern_1.Interfaces.Shape

class Rectangle : Shape {
    override fun draw() = println("Inside Rectangle::draw() method.")
}