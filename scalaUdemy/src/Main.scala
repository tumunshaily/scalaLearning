object Main extends App {
  class Person( name: String, age: Int) {

    def +(Greetings: String) = s"$Greetings $name"

    def unary_+ : Person = new Person(name,age + 1)

    def learns(what: String) = s"$name learns $what"

    def apply() = new Person("tumun", age)

    def apply(name: String) = new Person(name, age)

    def this(name:String) = this(name,0)

    def apply(times:Int) = new Person(name,times)
  }

  val per1 = new Person("tumun",23)

  val p2 = per1.apply("tumun")
  val p3 = per1.apply("tumun")


}
