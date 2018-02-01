package Builder_Pattern_3.Abstract

import Builder_Pattern_3.Bottle
import Builder_Pattern_3.Interface.Item
import Builder_Pattern_3.Interface.Packing

abstract class ColdDrink: Item {
    override fun packing(): Packing? = Bottle()

    abstract override fun price(): Float?
}