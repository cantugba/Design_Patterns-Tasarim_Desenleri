//product
public class Para
{
    private var m_NominalDeger:Int

    init(Nominal_Deger:Int)
    {
        self.m_NominalDeger = Nominal_Deger
    }

    var Nominal_Degeri:String
    {
        get
        {
            return String(m_NominalDeger) + "TL"
        }
    }
}

//ConcreteProduct
public class TL: Para
{
    fileprivate override init(Nominal_Deger:Int)
    {
        super.init(Nominal_Deger:Nominal_Deger)
    }
}

//Creator
public protocol Darphane
{
    func ParaBas(Nominal_Deger:Int) -> Para
}

//ConcreteCreator
public class TCDarphane: Darphane
{
    public func ParaBas(Nominal_Deger:Int) -> Para
    {
        return TL(Nominal_Deger:Nominal_Deger)
    }
}


/////////TEST//////

var darphane:TCDarphane = TCDarphane()
var tl:TL = darphane.ParaBas(Nominal_Deger:200) as! TL
print(tl.Nominal_Degeri)