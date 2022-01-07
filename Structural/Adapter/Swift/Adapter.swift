class Adaptee
{
    func Foo() {
        print("Adaptee.Foo")
    }
}

class Target
{
   func Request()
   {
      print("Target.Request")
   }
}

class Adapter: Target
{
    private var adaptee:Adaptee = Adaptee()

    override func Request()
    {
        adaptee.Foo()
    }
}
// test
var target:Target = Adapter()
target.Request()
