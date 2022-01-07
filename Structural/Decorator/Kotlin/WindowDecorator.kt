abstract class WindowDecorator(targetWindow: Window,
                               title:String): Window()
{
    var targetWindow: Window
    init{
        this.targetWindow = targetWindow
        this.targetWindow.title = title
    }
}

class ScrollDecorator(window: Window,
                      title:String): WindowDecorator(window, title)
{
    public override fun Render() {
        this.targetWindow.Render()
    }

    fun ScrollBy(amount: Int) {
        println(String.format("%s başlıklı pencere %d birim kaydırıldı",
            targetWindow.title, amount))
        Render()
    }
}

class ThemeDecorator(window: Window,
                     title:String): WindowDecorator(window, title)
{
    public override fun Render() {
        this.targetWindow.Render()
    }

    fun SetTheme(name: String) {
        println(String.format("%s başlıklı pencereye %s teması uygulandı",
            targetWindow.title, name))
        Render()
    }
}

abstract class Window
{
    var title: String? = ""

    constructor(): super() {}

    constructor(title: String) {
        this.title = title
    }

    abstract fun Render()
}

class LoginWindow: Window
{
    constructor() {}

    constructor(title: String): super(title) {}

    public override fun Render() {
        println(title + "başlıklı login ekranı render edildi")
    }
}

class ReportWindow: Window
{
    constructor() {}

    constructor(title: String): super(title) {}

    public override fun Render() {
        println(title + "başlıklı rapor ekranı render edildi")
    }
}


// test
object Program
{
    @JvmStatic fun main(args:Array<String>)
    {
        val wnd1 = LoginWindow("Sisteme Giriş")
        val wnd2 = ReportWindow("Stok Raporu Ekranı")
        val wnd3 = ReportWindow("Satış Raporu Ekranı")

        val decorator1 = ScrollDecorator(wnd2, "Stok Raporu Ekranı")

        val decorator2 = ThemeDecorator(wnd1, "Sisteme Giriş")

        val decorator3 = ThemeDecorator(wnd3, "Satış Raporu Ekranı")

        val decorator4 = ThemeDecorator(wnd2, "Stok Raporu Ekranı")

        decorator1.ScrollBy(5)
        decorator2.SetTheme("Gökyüzü")
        decorator3.SetTheme("Sonbahar")
        decorator4.SetTheme("Deniz")
    }
}