package Builder_Pattern_3

import Builder_Pattern_3.Abstract.ColdDrink

class Coke: ColdDrink() {
    override fun price(): Float? = 30.0f
    override fun name(): String? = "Coke"
}