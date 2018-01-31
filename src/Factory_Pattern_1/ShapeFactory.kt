package Factory_Pattern_1

import Factory_Pattern_1.Interfaces.Shape

class ShapeFactory {
    fun getShape(shapeType: String) : Shape? {
        if (shapeType.isNullOrEmpty())
            return null

        if (shapeType.equals("CIRCLE", true))
            return Circle()
        else if(shapeType.equals("RECTANGLE",true))
            return Rectangle()
        else if(shapeType.equals("SQUARE",true))
            return Square()

        return null
    }
}