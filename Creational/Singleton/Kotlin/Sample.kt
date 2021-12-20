class Sample protected constructor()
{
    private var m_Data: Int = 0

    fun GetData(): Int
    {
        return m_Data
    }

    fun SetData('val' : Int)
    {
        m_Data = 'val'
    }

    companion object
    {
        private var mp_Smp: Sample? = null

        fun CreateObject(): Sample
        {
            if (mp_Smp == null)
            {
                mp_Smp = Sample()
            }

            return mp_Smp as Sample
        }
    }
}

object Program
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        val obj1 = Sample.CreateObject()
        val obj2 = Sample.CreateObject()
        val obj3 = Sample.CreateObject()

        obj1.SetData(7877)
        System.out.printf("obj1-Data %d \n", obj1.GetData())
        System.out.printf("obj2-Data %d \n", obj2.GetData())
        System.out.printf("obj3-Data %d \n", obj3.GetData())

        println("---------------------------------")
        obj1.SetData(1999)

        System.out.printf("obj1-Data %d \n", obj1.GetData())
        System.out.printf("obj2-Data %d \n", obj2.GetData())
        System.out.printf("obj3-Data %d \n", obj3.GetData())

        // 7877 değeri obj1 ile set edildikten sonra diğer nesnelerde aynı veriyi referans aldıklarından dolayı
        // diğer nesnelerde geriye aynı değerleri döndürecektir

    }
}