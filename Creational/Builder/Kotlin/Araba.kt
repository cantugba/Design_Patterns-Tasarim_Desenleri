import java.util.ArrayList
import java.lang.StringBuilder


abstract class Araba
{
    protected var zorunlu_parcalar: ArrayList<String>
    var opsiyonel_parcalar: ArrayList<String>? = null
    protected var model: String? = null

    init {
        val zs = arrayOf("Rotil", "Salıncak", "Egzantirik Mili", "Krank Mili", "Yağ Pompası",
                        "Radyatör", "Buji", "Tekerlek", "Egzost")

        zorunlu_parcalar = ArrayList()

        for (i in 0..zs.size - 1) {
            zorunlu_parcalar.add(zs[i])
        }

        opsiyonel_parcalar = ArrayList()
    }
}

// product
class Bmw: Araba()
{
    fun get(): String? {
        return super.model
    }

    fun set(model: String?) {
        super.model = model
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(String.format("BMW %s \n\r", model))

        for (i in 0..zorunlu_parcalar.size -1) {
            sb.append(zorunlu_parcalar[i] + "\n\r")
        }

        for (i in 0..super.opsiyonel_parcalar!!.size - 1) {
            sb.append(super.opsiyonel_parcalar!![i] + "\n\r")
        }

        return sb.toString()
    }
}

// product
class Audi: Araba()
{
    fun get(): String? {
        return super.model
    }

    fun set(model: String?) {
        super.model = model
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(String.format("AUDI %s \n\r", model))

        for (i in 0..zorunlu_parcalar.size -1) {
            sb.append(zorunlu_parcalar[i] + "\n\r")
        }

        for (i in 0..super.opsiyonel_parcalar!!.size - 1) {
            sb.append(super.opsiyonel_parcalar!![i] + "\n\r")
        }

        return sb.toString()
    }
}


abstract class Fabrika
{
    abstract fun ParcaEkle(parca: String)
    abstract fun Uret(model: String): Araba
}

//concrete builder
class AudiFabrika: Fabrika()
{
    private val audi = Audi()

    override fun ParcaEkle(parca: String) {
        audi.opsiyonel_parcalar!!.add(parca)
    }

    override fun Uret(model: String): Araba {
        audi.set(model)
        return audi
    }
}

//concrete builder
class BmwFabrika: Fabrika()
{
    private val bmw = Bmw()

    override fun ParcaEkle(parca: String) {
        bmw.opsiyonel_parcalar!!.add(parca)
    }

    override fun Uret(model: String): Araba {
        bmw.set(model)
        return bmw
    }
}

// Builder
class Acenta
{
    private var fabrika: Fabrika? = null

    fun BmwTalebi(model: String, vararg istekler: String): Bmw
    {
        fabrika = BmwFabrika()

        for (istek in istekler) {
            fabrika!!.ParcaEkle(istek)
        }

        return fabrika!!.Uret(model) as Bmw
    }

    fun AudiTalebi(model: String, vararg istekler: String): Audi
    {
        fabrika = AudiFabrika()

        for (istek in istekler) {
            fabrika!!.ParcaEkle(istek)
        }

        return fabrika!!.Uret(model) as Audi
    }
}

enum class Markalar(val id: Int) {
    BMW(1),
    AUDI(2)
}
object Musteri
{
    fun ArabaIstegi(marka: Markalar, model: String,
                    vararg istek_parcalar: String)
    {
        val acenta = Acenta()

        when(marka) {
            Markalar.AUDI -> {
                val a = acenta.AudiTalebi(model, *istek_parcalar)
                println(a.toString())
            }

            Markalar.BMW -> {
                val b = acenta.BmwTalebi(model, *istek_parcalar)
                println(b.toString())
            }
        }
    }
}

object Program
{
    @JvmStatic
    fun main(args: Array<String>) {
        Musteri.ArabaIstegi(Markalar.BMW, "1.16",
            "ESP", "Dijital klima", "Mat Boya")

        Musteri.ArabaIstegi(Markalar.BMW, "1.16", "çelik jant", "Dijital klima", "sunroof")
    }
}