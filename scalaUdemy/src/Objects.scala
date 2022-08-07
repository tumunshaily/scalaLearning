package src

object Objects extends App {

  //Companions

  object Person {  // type and only instance
    //factory methods in singleton objects
    def from(mother: String, father:String ) = new Person("Bobbie")

    // usally we call the factory method as Apply

    def apply(mother:String, father:String) = new Person("Bobbie2")
    val n_EYES = 2
  }

  class Person (name: String){

    def apply(name:String) = new Person(name)
    // instance level functionality
  }

  val bobbie = Person.from("marry", "Jhon")
 val bobbie2 = Person("Marry2", "jhon")

  val xD = new Person("tumun")

  println(Person.n_EYES)

  // scala Applications = Scala Object with

//  def main(args:Array[String]) = {
//    println("sda")
//  }

}

