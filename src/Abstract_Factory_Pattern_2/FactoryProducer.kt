package Abstract_Factory_Pattern_2

import Abstract_Factory_Pattern_2.Abstract.AbstractFactory

class FactoryProducer {
    companion object {
        @JvmStatic
        fun  getFactory(choice: String): AbstractFactory? {
            if (choice.equals("SHAPE",true))
                return ShapeFactory()
            else if(choice.equals("COLOR", true))
                return ColorFactory()

            return null
        }
    }
}