import Foundation

// soyut strategy
protocol Brush
{
    func Paint()
}

// somut strategy siniflari
class SolidBrush: Brush
{
    func Paint() {
        print("tek renkli boyama")
    }
}

class LinearGradientBrush: Brush
{
    func Paint() {
        print("cok renkli cizgisel gecisli boyama")
    }
}

class RadialGradientBrush: Brush
{
    func Paint() {
        print("cok renkli yuvarlak gecisli boyama")
    }
}


// Context

class Rectangle
{
    private var brush:Brush

    init(brush:Brush) {
        self.brush = brush
    }

    func Draw() {
        brush.Paint()
        print("Dikdortgen")
    }

}


////// test /////////
var b1 = SolidBrush()
var b2 = LinearGradientBrush()
var b3 = RadialGradientBrush()

var r = Rectangle(brush: b3)
r.Draw()
