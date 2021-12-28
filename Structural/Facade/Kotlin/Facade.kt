class Facade private constructor()
{
    val subsystem1:Subsystem1
    private val s2:Subsystem2
    val subsystem3:Subsystem3

    init {
        subsystem1 = Subsystem1()
        s2 = Subsystem2()
        subsystem3 = Subsystem3()
    }

    fun Sample() {
        subsystem1.Foo()
        s2.Bar()
    }

    fun DoWork() {
        Subsystem4.Zet()
    }

    fun Func() {
        subsystem3.Tar()
    }

    // singleton
    companion object
    {
        private val f:Facade? = null

        val current:Facade
        get() {
            return createFacade()
        }

        private fun createFacade():Facade
        {
            var t = f

            if (t == null)
            {
                t = Facade()
            }

            return t
        }
    }
}

class Subsystem1
{
    fun Foo() {
        println("Subsystem1::Foo")
    }

    fun Bar() {
        println("Subsystem1::Bar")
    }
}

internal class Subsystem2
{
    fun Test() {
        println("Subsystem2::Test")
    }

    fun Bar() {
        println("Subsystem2::Bar")
    }
}

class Subsystem3
{
    fun Tar() {
        println("Subsystem3::Tar")
    }
}

internal object Subsystem4
{
    fun Zet() {
        println("Subsystem4::Zet")
    }
}

// test
object Program
{
    @JvmStatic fun main(args:Array<String>)
    {
        Facade.current.Func()
        Facade.current.DoWork()
        Facade.current.Sample()
        Facade.current.subsystem1.Foo()
        Facade.current.subsystem3.Tar()
    }
}