import Foundation

public class Facade {
  private var s1: Subsystem1
  private var s2: Subsystem2
  private var s3: Subsystem3
  private static var f: Facade?

  private init() {
    s1 = Subsystem1()
    s2 = Subsystem2()
    s3 = Subsystem3()
  }

  class var Current: Facade {
    return createFacade()
  }

  // Singleton
  class func createFacade() -> Facade {
    if f == nil {
      f = Facade()
    }

    return f!
  }

  var Subsystem1: Subsystem1 {
    return s1
  }

  var Subsystem3: Subsystem3 {
    return s3
  }

  func Sample() {
    s1.Foo()
    s2.Bar()
  }

  func DoWork() {
    Subsystem4.Zet()
  }

  func Func() {
    s3.Tar()
  }
}

class Subsystem1 {
  func Foo() {
    print("Subsystem1::Foo")
  }

  func Bar() {
    print("Subsystem1::Bar")
  }
}

class Subsystem2 {
  func Test() {
    print("Subsystem2::Test")
  }

  func Bar() {
    print("Subsystem2::Bar")
  }
}

class Subsystem3 {
  func Tar() {
    print("Subsystem3::Tar")
  }
}

class Subsystem4 {
  class func Zet() {
    print("Subsystem4::Zet")
  }
}

// Test
var f: Facade = Facade.Current
Facade.Current.Func()
Facade.Current.Sample()
Facade.Current.Subsystem1.Foo()
Facade.Current.Subsystem3.Tar()
