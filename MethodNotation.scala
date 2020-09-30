package lectures.part2oop

object MethodNotation extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickName: String) = new Person(s"${this.name}(${nickName})", this.favoriteMovie)

    def unary_! : String = s"${name} what the heck ? !!"

    def unary_+ : Person = new Person(this.name, this.favoriteMovie, this.age + 1)

    def isAlive: Boolean = true

    def apply(num: Int): String = s"Mary watched inception ${num} times"

    def learns(learn: String): String = s"Mary learns ${learn}"

    def learns(): String = this learns "Scala"

  }

  def mary = new Person("mary", "inception")
  def tom = new Person("tom", "dragon")
  println(mary likes "inception")
  // infix notation  = operator notation  (Syntactic sugar)

  println(mary hangoutWith tom)

  println(mary + tom)

  // we can change hangoutWith with +
  // ALL OPERATORS IN SCALA IS a method

  //prefix notation is all about Unary operators
  val x = -1
  val y = 1.unary_-
  // unary prefix works only with - + ! ~
  println(!mary)
  println(mary.unary_!)

  //Postfix notation
  println(mary isAlive)

 // println(mary.apply())
 // println(mary()) // Equivalent to above mary.apply()

  println((mary + "The Rockstar !!!")(2))

  println((+mary).age)

  println(mary learns)

  println(mary(2))
}
