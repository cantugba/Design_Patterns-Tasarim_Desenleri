class Sample
{
    private static var m_smp:Sample?
    private var m_Data:Int = 0

    private init ()
    {
        print("Sample nesnesi yaratıldı")
    }

    class func CreateObject() -> Sample
    {
        if (m_smp == nil)
        {
            m_smp = Sample
        }

        return m_smp!
    }

    func GetData() -> Int
    {
        return m_Data
    }

    func SetData(val:Int)
    {
        m_Data = val
    }

}

//////// TEST ////////

var obj1 = Sample.CreateObject()
var obj2 = Sample.CreateObject()
var obj3 = Sample.CreateObject()

obj1.SetData(val: 7877)

print("obj1-Data \(obj1.GetData())")
print("obj2-Data \(obj2.GetData())")
print("obj3-Data \(obj3.GetData())")

obj1.SetData(val: 1999)

print("obj1-Data \(obj1.GetData())")
print("obj2-Data \(obj2.GetData())")
print("obj3-Data \(obj3.GetData())")


