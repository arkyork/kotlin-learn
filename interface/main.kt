@file:JvmName("Main")

interface Loggable {
    val tag: String
    fun log(message: String)
}


class FileDownloader(): Loggable {
    override val tag: String
        get() = "FileDownloader"
    override fun log(message: String) {
        println("[$tag] $message")
    }
}

fun main() {
    val downloader = FileDownloader()
    downloader.log("Download started")
}

