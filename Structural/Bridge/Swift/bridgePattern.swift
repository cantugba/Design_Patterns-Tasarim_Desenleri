protocol Implementor
{
    func Operation()
}

public class ConcreteImplementor1: Implementor 
{
    func Operation()
    {
        print("ConcreteImplementor1::Operation")
    }
}

public class ConcreteImplementor2: Implementor 
{
    func Operation()
    {
        print("ConcreteImplementor2::Operation")
    }
}

protocol Abstraction 
{
    var implementor:Implementor
    {
        get 
        set
    }

    init(implementor:Implementor)
    func Operation()
}

final class RefinedAbstraction: Abstraction
{
    internal var mImplementor: Implementor
    var implementor:Implementor
    {
        get
        {
            return mImplementor
        }
        set(val)
        {
            mImplementor = val
        }
    }

    init(implementor:Implementor)
    {
        self.mImplementor = implementor
    }

    func Operation()
    {
        implementor.Operation()
    }
}

// test
var obj:Abstraction = RefinedAbstraction(implementor: ConcreteImplementor1())
obj.Operation()

var obj2:Abstraction = RefinedAbstraction(implementor: ConcreteImplementor2())
obj2.Operation()
