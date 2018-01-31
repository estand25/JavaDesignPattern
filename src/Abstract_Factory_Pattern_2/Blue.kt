package Abstract_Factory_Pattern_2

import Abstract_Factory_Pattern_2.Interfaces.Color

class Blue : Color {
    override fun fill() = println("Inside Blue::fill() method.")
}