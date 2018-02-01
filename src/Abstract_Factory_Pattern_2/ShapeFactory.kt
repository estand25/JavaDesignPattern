package Abstract_Factory_Pattern_2

import Abstract_Factory_Pattern_2.Abstract.AbstractFactory
import Abstract_Factory_Pattern_2.Interfaces.Color
import Abstract_Factory_Pattern_2.Interfaces.Shape

class ShapeFactory : AbstractFactory() {
    override fun getColor(color: String?): Color? {
        return null
    }

    override fun getShape(shape: String?): Shape? {
        if(shape.isNullOrEmpty())
            return null

        if(shape.equals("CIRCLE",true))
            return Circle()
        else if(shape.equals("RECTANGLE", true))
            return Rectangle()
        else if(shape.equals("SQUARE",true))
            return Square()

        return null
    }
}