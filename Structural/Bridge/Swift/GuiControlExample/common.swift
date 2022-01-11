import Foundation

// Implementor
protocol IControlImplementor
{
    func Display()
}

// Abstraction
protocol IControl 
{
    var Name:String
    {
        get
        set
    }

    var ControlImplementor:IControlImplementor
    {
        get
        set
    }

    init (name:String)

    func Render()
}

// Refined Abstraction 1
class Button: IControl
{
    private var name:String
    internal var m_IControlImplementor:IControlImplementor?

    var Name:String
    {
        get
        {
            return name
        }
        set(value)
        {
            name = value
        }
    }

    var ControlImplementor:IControlImplementor
    {
        get
        {
            return m_IControlImplementor
        }
        set(implementor)
        {
            if ((implementor is IosButton) || (implementor is AndroidButton))
            {
                self.m_IControlImplementor = implementor
            }
            else
            {
                print("Yanlış implementor set edildi.")
            }
        }
    }

    required init(name:String)
    {
        self.name = name
        m_IControlImplementor = nil
    }

    func Render()
    {
        self.m_IControlImplementor!.Display()
    }
}

// Refined Abstraction 2
class TextBox: IControl
{
    private var name:String
    internal var m_IControlImplementor:IControlImplementor?

    var Name:String
    {
        get
        {
            return name
        }
        set(value)
        {
            name = value
        }
    }

    var ControlImplementor:IControlImplementor
    {
        get
        {
            return m_IControlImplementor
        }
        set(implementor)
        {
            if ((implementor is IosTextBox) || (implementor is AndroidTextBox))
            {
                self.m_IControlImplementor = implementor
            }
            else
            {
                print("Yanlış implementor set edildi.")
            }
        }
    }

    required init(name:String)
    {
        self.name = name
        m_IControlImplementor = nil
    }

    func Render()
    {
        self.m_IControlImplementor!.Display()
    }
}


