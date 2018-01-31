package Factory_Pattern_1

import Factory_Pattern_1.Interfaces.Shape

class Square : Shape {
    override fun draw() = println("Inside Square::draw() method.")
}