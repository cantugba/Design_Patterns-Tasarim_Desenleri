// product
abstract class Para protected constructor(private val m_NominalDeger: Int)
{
    fun GetNominalDegeri():String
    {
        return Integer.toString(m_NominalDeger) + "TL"
    }
}

// Concrete Product
class Lira constructor(Nominal_Deger: Int): Para(Nominal_Deger){}

//Creator
abstract class Darphane
{
    abstract fun ParaBas(Nominal_Deger: Int): Para
}

//Concrete Creator
class TCDarphane: Darphane()
{
    override fun ParaBas(Nominal_Deger: Int): Para {
        return Lira(Nominal_Deger)
    }
}

object Program
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        val darphane =TCDarphane()
        val tl = darphane.ParaBas(200) as Lira
        System.out.println(tl.GetNominalDegeri())
    }
}