class Adaptee
{
    fun Foo() {
        println("Adaptee::Foo")
    }
}

open class Target()
{
    open fun Request()
    {
        println("Target::Request")
    }
}

class Adapter: Target()
{
    private var adaptee:Adaptee = Adaptee()

    override fun Request()
    {
        adaptee.Foo()
    }
}
// test
object Program
{
    @JvmStatic fun main(args:Array<String>)
    {
        var target:Target = Adapter()
        target.Request()
    }
}