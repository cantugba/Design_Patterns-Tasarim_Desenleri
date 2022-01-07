import Foundation

class WindowDecorator: Window
{
  var targetWindow:IWindow

  init(targetWindow:IWindow, title:String)
  {
    self.targetWindow = targetWindow
    super.init(title: title)
  }
}

class ScrollDecorator: WindowDecorator
{
  override init(targetWindow: IWindow, title: String) {
    super.init(targetWindow: targetWindow, title: title)
  }

  func Render()
  {
    self.targetWindow.Render()
  }

  func ScrollBy(amaount: Int)
  {
    print("\(targetWindow.Title) penceresi \(amaount) birim kaydırıldı")
    Render()
  }
}

class ThemeDecorator: WindowDecorator
{
  override init(targetWindow: IWindow, title: String) {
    super.init(targetWindow: targetWindow, title: title)
  }

  func Render()
  {
    self.targetWindow.Render()
  }

  func SetTheme(name: String)
  {
    print("\(targetWindow.Title) başlıklı pencereye \(name) teması uygulandı")
    Render()
  }
}

protocol IWindow
{
    var Title:String
    {
        get
        set
    }

    func Render()
}

class Window
{
    fileprivate var title:String

    var Title:String
    {
        get
        {
            return title
        }
        set (value)
        {
            title = value
        }
    }

    init(title:String) {
        self.title = title
    }

}

class LoginWindow: Window, IWindow
{
    override init(title:String) {
        super.init(title:title)
    }

    func Render ()
    {
        print(title + "login ekranı render edildi")
    }

}

class ReportWindow: Window, IWindow
{
    override init(title:String) {
        super.init(title:title)
    }

    func Render ()
    {
        print(title + "rapor ekranı render edildi")
    }

}


// TEST
var wnd1:IWindow = LoginWindow(title: "Sisteme Giriş")
var wnd2:IWindow = ReportWindow(title: "Stok Raporu Ekranı")
var wnd3:IWindow = ReportWindow(title: "Satış Raporu Ekranı")

var decorator1:ScrollDecorator = ScrollDecorator(targetWindow: wnd2, title: "Stok Raporu Ekranı")

var decorator2:ThemeDecorator = ThemeDecorator(targetWindow: wnd1, title: "Sisteme Giriş")

var decorator3:ThemeDecorator = ThemeDecorator(targetWindow: wnd3, title: "Satış Raporu Ekranı")

var decorator4:ThemeDecorator = ThemeDecorator(targetWindow: wnd2, title: "Stok Raporu Ekranı")

decorator1.ScrollBy(amaount: 5)
decorator2.SetTheme(name: "Gökyüzü")
decorator3.SetTheme(name: "Sonbahar")
decorator4.SetTheme(name: "Deniz")