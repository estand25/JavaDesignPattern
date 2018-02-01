package Builder_Pattern_3

import Builder_Pattern_3.Interface.Packing

class Wrapper : Packing {
    override fun pack(): String? = "Wrapper"

}