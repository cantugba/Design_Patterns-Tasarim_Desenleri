interface IThreadState
{
    fun Run(context: ThreadContext)
    fun Stop(context: ThreadContext)
    fun Wait(context: ThreadContext)
}

class ThreadContext
{
    var state: IThreadState

    init {
        println("Thread yaratildi ve henuz calismiyor")
        state = StoppedState()
    }

    fun Start() {
        state.Run(this)
    }

    fun Abort() {
        state.Stop(this)
    }

    fun Sleep() {
        state.Wait(this)
    }

}

class RunningState: IThreadState
{
    override fun Run(context: ThreadContext)
    {
        println("Thread zaten calisir durumda")
    }

    override fun Stop(context: ThreadContext)
    {
        context.state = StoppedState()
        println("Thread durduruldu")
    }

    override fun Wait(context: ThreadContext)
    {
        context.state = WaitingState()
        println("Thread gecici olarak cizelgeleme disina cikarildi")
    }
}

class StoppedState: IThreadState
{
    override fun Run(context: ThreadContext)
    {
        context.state = RunningState()
        println("Thread calismaya basladi")
    }

    override fun Stop(context: ThreadContext)
    {
        println("Thread zaten durdurulmus")
    }

    override fun Wait(context: ThreadContext)
    {
        println("Duran bir thread beklemeye alinamaz..")
    }
}

class WaitingState: IThreadState
{
    override fun Run(context: ThreadContext)
    {
        context.state = RunningState()
        println("Thread beklemedeyken tekrardan cizelgelemeye sokuldui")
    }

    override fun Stop(context: ThreadContext)
    {
        context.state = StoppedState();
        println("Beklmedeki thread tumuyle durduruldu")
    }

    override fun Wait(context: ThreadContext)
    {
        println("Thread zaten beklemede")
    }
}


// test
object Program
{
    @JvmStatic fun main(args:Array<String>)
    {
        val thread = ThreadContext()
        thread.Start()
        thread.Start()
        thread.Sleep()
        thread.Start()
        thread.Abort()
        thread.Start()
        thread.Abort()
        thread.Abort()
    }
}