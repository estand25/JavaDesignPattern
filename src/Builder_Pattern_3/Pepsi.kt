package Builder_Pattern_3

import Builder_Pattern_3.Abstract.ColdDrink

class Pepsi: ColdDrink() {
    override fun price(): Float? = 35.0f

    override fun name(): String? = "Pepsi"
}