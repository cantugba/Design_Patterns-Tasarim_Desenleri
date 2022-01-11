abstract class Implementor
{
    abstract fun Operation()
}

class ConcreteImplementor1: Implementor()
{
    public override fun Operation()
    {
        println("ConcreteImplementor1::Operation")
    }
}

class ConcreteImplementor2: Implementor()
{
    public override fun Operation()
    {
        println("ConcreteImplementor2::Operation")
    }
}

open class Abstraction
{
    protected var implementor:Implementor? = null

    fun set_Implementor(value:Implementor)
    {
        implementor = value
    }


    open fun Operation() {
        implementor?.Operation()
    }
}

class RefinedAbstraction: Abstraction()
{

    public override fun Operation()
    {
        implementor?.Operation()
    }
}


// test
object Program
{
    @JvmStatic fun main(args:Array<String>)
    {
        val obj = RefinedAbstraction()
        obj.set_Implementor(ConcreteImplementor1())
        obj.Operation()

        val obj2 = RefinedAbstraction()
        obj2.set_Implementor(ConcreteImplementor2())
        obj2.Operation()

    }
}