abstract class Component(name: String)
{
    var name:String
    var parent:Component? = null
        protected set

    var children: ArrayList<Component>? = null
        protected set


    init {
        this.name = name
    }


    protected fun createChildrenList() {
        children = ArrayList<Component>()
    }

    @Throws(Exception::class)
    fun add(component: Component) {
        if (this is UIComponent)
        {
            throw Exception("Bu işlem desteklenmiyor")
        }
        else
        {
            children?.add(component)
        }
    }

    @Throws(Exception::class)
    fun remove(component: Component) {
        if (this is UIComponent)
        {
            throw Exception("Bu işlem desteklenmiyor")
        }
        else
        {
            children?.remove(component)
        }
    }

    @Throws(Exception::class)
    fun getChild(index: Int): Component? {
        if (this is UIComponent)
        {
            throw Exception("Bu işlem desteklenmiyor")

        }
        else
        {
            return children?.get(index)
        }
    }

    abstract fun Render()

}

// Leaf
class UIComponent(name: String): Component(name)
{

    public override fun Render() {
        println(name + "isimli leaf eleman render edildi.")
    }
}

//Composite
class Panel(name: String): Component(name)
{
    init {
        createChildrenList()
    }

    public override fun Render() {
        println(name + "isimli leaf eleman render edildi.")

        if (children?.size !== 0)
        {
            for (c in children.orEmpty())
            {
                c.Render()
            }
        }
    }
}




// test
object Program
{
    @JvmStatic fun main(args:Array<String>)
    {
        try {
            val root = Panel("root")

            val leaf1 = UIComponent("leaf 1.1")

            root.add(leaf1)

            val pnl2 = Panel("pnl 1.2")

            root.add(pnl2)
            root.add(UIComponent("leaf 2.1"))

            root.add(Panel("leaf 2.2"))

            pnl2.getChild(1)?.add(UIComponent("leaf 2.2.1"))
            pnl2.getChild(1)?.add(UIComponent("leaf 2.2.2"))

            root.Render()
        } catch (e: Exception) {
            println(e.message)
        }

    }
}