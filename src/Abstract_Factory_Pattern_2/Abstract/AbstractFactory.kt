package Abstract_Factory_Pattern_2.Abstract

import Abstract_Factory_Pattern_2.Interfaces.Color
import Abstract_Factory_Pattern_2.Interfaces.Shape

abstract class AbstractFactory {
    abstract fun getColor(color: String): Color?
    abstract fun getShape(shape: String): Shape?
}