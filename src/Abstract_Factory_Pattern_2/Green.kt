package Abstract_Factory_Pattern_2

import Abstract_Factory_Pattern_2.Interfaces.Color

class Green : Color {
    override fun fill() = println("Inside Green::fill() method.")
}