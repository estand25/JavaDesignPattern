package Singleton_4

public class SingleObject private constructor(){

    init {
        showMessage()
    }

    private object Holder { val INSTANCE = SingleObject() }

    companion object {
        val instance: SingleObject by lazy { Holder.INSTANCE }
    }

    private fun showMessage(){
        println("Hello World!")
    }
}