package me.fabiansuarez.kotlin_fundamentals.poo


open class Post (private val author: User, private val content: String) : Notification {
    open fun showContent() {
        println("Texto: $content por ${author.nombre}")
    }

    override fun sendNotification(message: String, user: User) {
        print("Se esta notificando")
    }
}

class PostText(val author: User, val content: String) : Post(author, content) {
    override fun showContent() {
        println("Texto: $content por ${author.nombre}")
    }
}

class PostImage(val author: User, val content: String, val urlImage: String) : Post(author, content) {
    override fun showContent() {
        println("Imagen: $content - URL: $urlImage por ${author.nombre}")
    }
}

class PostVideo(val author: User, val content: String, val urlVideo: String) : Post(author, content) {
    override fun showContent() {
        println("Video: $content - URL: $urlVideo por ${author.nombre}")
    }
}