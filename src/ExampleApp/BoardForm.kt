package Factory_Pattern_1.ExampleApp

class BoardForm : View("Snake Generator"){
    val model : BoardModel by inject()

    override val root = form {
        button("free"){
            tooltip("www")
        }
    }
}
