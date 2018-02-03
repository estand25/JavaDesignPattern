package Singleton_Pattern_4

object Singleton {
    var message: String = "default Message"

    init {
        println("Initializing object: $this")
    }

    fun showSingleMessage(){
        println("Message: " + message)
    }

    fun setSingleMessage(message: String){
        this.message = message
    }
}