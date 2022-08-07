package src

object InheritanceAndTraits extends App{

  class Animal {
    private def eat = println("hum")

     def eat2 = println("yumyum")
  }


  class Graph[A] {
  }
  object Animal {

    val animal = new Animal
    def eatt = animal.eat
  }

  class Cat extends Animal {
    eat2
  }

  val cat = new Cat
  cat.eat2

  class Person(name:String, age:Int)
class adult(name:String, age:Int)

}
