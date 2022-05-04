// soyut strategy
interface Brush
{
    fun Paint()
}

// Somut strategy siniflari
class SolidBrush: Brush
{
    override fun Paint() {
        print("Tek renkli boyama")
    }
}

class LinearGradientBrush: Brush
{
    override fun Paint() {
        print("cok renkli cizgisel gecisli boyama")
    }
}

class RadialGradientBrush: Brush
{
    override fun Paint() {
        println("cok renkli yuvarlak gecisli boyama")
    }
}

// Context
class Rectangle(brush: Brush){
    private var brush: Brush

    init {
        this.brush = brush
    }

    fun Draw() {
        brush.Paint()
        print("Dikdortgen")
    }
}

// test
object Program
{
    @JvmStatic fun main(args:Array<String>)
    {
        var b1 = SolidBrush()
        var b2 = LinearGradientBrush()
        var b3 = RadialGradientBrush()

        var r = Rectangle(b3)
        r.Draw()

    }
}