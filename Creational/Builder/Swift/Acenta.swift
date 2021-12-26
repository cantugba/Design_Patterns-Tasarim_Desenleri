
class Acenta
{
    private var fabrika:Fabrika?

    init(){}

    func BmwTalebi(model:String, istekler:[String]) -> Bmw
    {
      fabrika = BMWFabrika()

      for istek in istekler
      {
        fabrika!.ParcaEkle(parca: istek)
      }

      return fabrika!.Uret(model: model) as! Bmw
    }

    func AudiTalebi(model:String, istekler:[String]) -> Audi
    {
      fabrika = AudiFabrika()

      for istek in istekler
      {
        fabrika!.ParcaEkle(parca: istek)
      }

      return fabrika!.Uret(model: model) as! Audi
    }
}

public enum Markalar:Int
{
    case BMW = 1
    case AUDI = 2
}


protocol Fabrika
{
  func ParcaEkle(parca:String)
  func Uret(model:String) -> Araba
}

class BMWFabrika: Fabrika
{
  private var bmw:Bmw = Bmw()
  func ParcaEkle(parca:String)
  {
    bmw.OpsiyonelParcalar.append(parca)
  }
  func Uret(model:String) -> Araba
  {
    bmw.Model = model
    return bmw
  }

}

class AudiFabrika: Fabrika
{
  private var audi:Audi = Audi()
  func ParcaEkle(parca:String)
  {
    audi.OpsiyonelParcalar.append(parca)
  }
  func Uret(model:String) -> Araba
  {
    audi.Model = model
    return audi
  }

}

class Araba
{
  fileprivate var zorunlu_parcalar:[String]
  fileprivate var opsiyonel_parcalar:[String]
  fileprivate var model:String

  var OpsiyonelParcalar:[String]
  {
    get
    {
      return opsiyonel_parcalar
    }
    set(value)
    {
      opsiyonel_parcalar = value
    }
  }

  init()
  {
    model = ""
    zorunlu_parcalar = ["Motor", "Radyatör", "Buji", "Tekerlek", "Egzost"]
    opsiyonel_parcalar = [String]()
  }
}


class Bmw: Araba
{
  var Model:String
  {
    get
    {
      return super.model;
    }

    set(value)
    {
      super.model = value;
    }
  }

  func String() -> String
  {
    var str:String = "BMW " + Model

    for i in 0...zorunlu_parcalar.count-1
    {
      str += zorunlu_parcalar[i] + "\n\r"
    }

    for i in 0...opsiyonel_parcalar.count-1
    {
      str += opsiyonel_parcalar[i] + "\n\r"
    }

    return str
  }
}

class Audi: Araba
{
  var Model:String
  {
    get
    {
      return super.model;
    }

    set(value)
    {
      super.model = value;
    }
  }

  func String() -> String
  {
    var str:String = "AUDI " + Model

    for i in 0...zorunlu_parcalar.count-1
    {
      str += zorunlu_parcalar[i] + "\n\r"
    }

    for i in 0...opsiyonel_parcalar.count-1
    {
      str += opsiyonel_parcalar[i] + "\n\r"
    }

    return str
  }
}

class Musteri
{
  class func ArabaIstegi(marka:Markalar, model:String, istek_parcalar:[String])
  {
    var acenta:Acenta = Acenta()

    switch(marka)
    {
      case Markalar.AUDI:
          var a:Audi = acenta.AudiTalebi(model: model, istekler: istek_parcalar)
          print(a.String())
      case Markalar.BMW:
        var b:Bmw = acenta.BmwTalebi(model: model, istekler: istek_parcalar)
        print(b.String())
    }
  }
}

// Test

var liste1 = ["ESP", "Klima", "Mat boya"]
Musteri.ArabaIstegi(marka: Markalar.BMW, model: "1.16", istek_parcalar: liste1)

var liste2 = ["Çelik jant", "Klima", "Sunroof"]
Musteri.ArabaIstegi(marka: Markalar.AUDI, model: "1.16", istek_parcalar: liste2)


