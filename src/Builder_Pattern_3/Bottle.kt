package Builder_Pattern_3

import Builder_Pattern_3.Interface.Packing

class Bottle: Packing {
    override fun pack(): String? = "Bottle"
}