package Builder_Pattern_3

import Builder_Pattern_3.Abstract.Burger

class ChickenBurger: Burger() {
    override fun price(): Float? = 50.5f
    override fun name(): String? = "Chicken Burger"
}