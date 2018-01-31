package Factory_Pattern_1

import Factory_Pattern_1.Interfaces.Shape

class Circle : Shape {
    override fun draw() = println("Inside Circle::draw() method.")
}