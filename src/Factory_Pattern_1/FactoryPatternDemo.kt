package Factory_Pattern_1

fun main(args: Array<String>) {
    val shapeFactory = ShapeFactory()

    //Get a object of circle and call its draw method.
    val shape1 = shapeFactory.getShape("CIRCLE")!!

    //Call draw method of circle
    shape1.draw()

    //Get a object of Rectangle and call its draw method.
    val shape2 = shapeFactory.getShape("RECTANGLE")!!

    //Call draw method of Rectangle
    shape2.draw()

    //Get a object of Square and call its draw method.
    val shape3 = shapeFactory.getShape("SQUARE")!!

    //Call draw method of Square
    shape3.draw()
}