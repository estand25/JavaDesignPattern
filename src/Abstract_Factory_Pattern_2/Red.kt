package Abstract_Factory_Pattern_2

import Abstract_Factory_Pattern_2.Interfaces.Color

class Red : Color {
    override fun fill() = println("Inside Red::fill() method.")
}