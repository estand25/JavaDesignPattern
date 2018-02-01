package Abstract_Factory_Pattern_2

import Abstract_Factory_Pattern_2.Abstract.AbstractFactory
import Abstract_Factory_Pattern_2.Interfaces.Color
import Abstract_Factory_Pattern_2.Interfaces.Shape

class ColorFactory : AbstractFactory() {
    override fun getColor(color: String?): Color? {
        if(color.isNullOrEmpty())
            return null

        if(color.equals("RED", true))
            return Red()
        else if(color.equals("GREEN", true))
            return Green()
        else if(color.equals("BLUE", true))
            return Blue()

        return null
    }

    override fun getShape(shape: String?): Shape? {
        return null
    }

}