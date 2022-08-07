package practice

abstract class MyList {

  def head: Int

  def tail:MyList

  def isEmpty: Boolean

  def add(input: Int) : MyList

}

object Empty extends MyList {

  def head:Int = throw new NoSuchElementException
  def tail:MyList = throw new NoSuchElementException
  def isEmpty:Boolean = true

  override def add(input: Int): MyList = new Cons(input,Empty)
}

class Cons(had:Int, t:MyList) extends MyList {

  def head:Int = had
  def tail:MyList = t
  def isEmpty:Boolean = true

  override def add(input: Int): MyList = new Cons(input, this)
}

object run extends App {
  val linkList = new Cons(0, new Cons(1, new Cons(5, new Cons(6,Empty))))

  println(linkList.tail.tail.head)
}
