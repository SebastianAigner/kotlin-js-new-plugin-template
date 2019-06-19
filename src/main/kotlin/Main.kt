import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLParagraphElement
import kotlin.browser.document

fun main() {
    val par = document.getElementById("kotlin-p") as HTMLParagraphElement
    par.innerHTML = "Hello from Kt!!"
    val canvas = document.getElementById("kanvas") as HTMLCanvasElement
    val ctx = canvas.getContext("2d") as CanvasRenderingContext2D
    with(ctx) {
        repeat(300) {
            beginPath()
            fillStyle = listOf("red", "purple", "black", "orange", "green").random()
            arc((0..500).random().toDouble(), (0..150).random().toDouble(), 10.0, 0.0, 360.0)
            fill()
        }
    }
}