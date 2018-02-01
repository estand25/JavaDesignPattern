package Builder_Pattern_3.Abstract

import Builder_Pattern_3.Interface.Item
import Builder_Pattern_3.Interface.Packing
import Builder_Pattern_3.Wrapper

abstract class Burger: Item {
    override fun packing(): Packing? = Wrapper()

    abstract override fun price(): Float?
}