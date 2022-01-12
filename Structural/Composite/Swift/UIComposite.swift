import Foundation

protocol IComponent
{
  var Name:String
  {
    get
    set
  }

  var Parent:Component
  {
    get
  }

  var Children: [Component]
  {
    get
  }

  init(name:String)
  func createChildrenList()
  func add(component:Component)
  func getChild(index:Int) -> Component?
  func Render()

}

class Component : IComponent
{
  private var _name:String
  private var _parent:Component?
  fileprivate var _children:[Component]?

  var Name:String
  {
    get
    {
      return _name
    }
    set(value)
    {
      _name = value
    }
  }
  var Parent:Component
    {
      get
      {
        return _parent!
      }
    }

  var Children: [Component]
  {
    get
    {
      return _children!
    }
  }

  required init(name: String) {
    _name = name
    _children = nil
  }

  func createChildrenList() {
    _children = [Component]()
  }

  func add(component: Component) {
    if (self is UIComponent)
    {
      print("Bu işlem desteklenmiyor")
    }
    else
    {
      _children!.append(component)
    }
  }

  func getChild(index: Int) -> Component? {
    if (self is UIComponent)
    {
      print("Bu işlem desteklenmiyor")
      return nil
    }
    else
    {
      return _children![index]
    }
  }

  func Render() {}

}

// Leaf
class UIComponent: Component
{
  required init(name: String) {
    super.init(name:name)
  }

  override func Render() {
    print("\(Name) isimli leaf eleman render edildi.")
  }
}

//Composite
class Panel: Component
{
  required init(name: String) {
    super.init(name: name)
    createChildrenList()
  }

  override func Render() {
    print("\(Name) isimli composite eleman render edildi.")

    if (_children!.count != 0)
    {
      for c in _children!
      {
        c.Render()
      }
    }
  }
}

// TEST

var root:Panel = Panel(name: "root")

var leaf1:UIComponent = UIComponent(name: "leaf 1.1")

// bu işlem exceptiona neden olur
//leaf1.add(UIComponent("deneme"))

root.add(component: leaf1)

var pnl2:Panel = Panel(name: "pnl 1.2")

root.add(component: pnl2)
root.add(component: UIComponent(name: "leaf 2.1"))

root.add(component: Panel(name: "leaf 2.2"))

pnl2.getChild(index: 1)!.add(component: UIComponent(name: "leaf 2.2.1"))
pnl2.getChild(index: 1)!.add(component: UIComponent(name: "leaf 2.2.2"))

root.Render()