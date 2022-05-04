import Foundation

protocol IThreadState
{
    func Run(context:ThreadContext)
    func Stop(context:ThreadContext)
    func Wait(context:ThreadContext)
}

 class ThreadContext
 {
    private var state:IThreadState

    var State:IThreadState
    {
        get
        {
            return state
        }
        set(val)
        {
            state = val
        }
    }

    init() {
        print("Thread yaratildi ve henuz calismiyor")
        state = StoppedState()
    }

    func Start() {
        state.Run(context: self)
    }

    func Abort() {
        state.Stop(context: self)
    }

    func Sleep() {
        state.Wait(context: self)
    }

 }

 class RunningState: IThreadState
 {
    func Run(context:ThreadContext)
    {
        print("Thread zaten calisir durumda")
    }

    func Stop(context:ThreadContext)
    {
        context.State = StoppedState()
        print("Thread durduruldu")
    }

    func Wait(context:ThreadContext)
    {
        context.State = WaitingState()
        print("Thread gecici olarak cizelgeleme disina cikarildi")
    }
 }

class StoppedState: IThreadState
 {
    func Run(context:ThreadContext)
    {
        context.State = RunningState()
        print("Thread calismaya basladi")
    }

    func Stop(context:ThreadContext)
    {
        print("Thread zaten durdurulmus")
    }

    func Wait(context:ThreadContext)
    {
        print("Duran bir thread beklemeye alinamaz..")
    }
 }

 class WaitingState: IThreadState
 {
    func Run(context:ThreadContext)
    {
        context.State = RunningState()
        print("Thread beklemedeyken tekrardan cizelgelemeye sokuldui")
    }

    func Stop(context:ThreadContext)
    {
        context.State = StoppedState();
        print("Beklmedeki thread tumuyle durduruldu")
    }

    func Wait(context:ThreadContext)
    {
        print("Thread zaten beklemede")
    }
 }

 /////// test ///////
var thread = ThreadContext()
thread.Start()
thread.Start()
thread.Sleep()
thread.Start()
thread.Abort()
thread.Start()
thread.Abort()
thread.Abort()