package lectures.part2oop

object OOBasicsExcercises extends App {

  val author = new Writer("John", "mera", 1963)

  val authorNew = new Writer("John", "mera", 1963)


  val novel = new Novel("A great tiger", 2010, author)

  println(author.fullName())

  println(novel.authorAge())

  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(authorNew))

  println(novel.copy(2014).authorAge())

}

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName(): String = firstName + " " + surname
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge(): Int = yearOfRelease - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
}


class Counter(val counter: Int) {
  def count(): Int = counter

  def increment() = new Counter(counter + 1) // Returning a new Counter is case of immutibility

  def decrement() = new Counter(counter - 1)


  def increment(amt: Int) = new Counter(counter + amt)

  def decrement(amt: Int) = new Counter(counter - amt)
}