package Builder_Pattern_3

import Builder_Pattern_3.Abstract.Burger

class VegBurger: Burger() {
    override fun price(): Float? = 25.0f

    override fun name(): String? = "Veg Burger"
}