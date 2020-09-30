package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE THE CLASS LEVEL FUNCTIONALITY
  // public static int N_EYES = 2
  // equivalent in scala is objects

  object Person {
    // Class/static level functionality
    val N_EYES  = 2
    // factory method
    def apply(mother: Person, father: Person): Person = new Person("bobby")
  }

  class Person(name: String) {
    // instance-level functionality
  }

  // both the Person are called CAMPANIONS

  println(Person.N_EYES)

  val mary = new Person("mary")
  val john = new Person("John")

  //val bobby = Person.from(mary, john)
  // if change the from to apply
  val bobby = Person(mary, john)// power of apply function
  // Person.apply(mary, john)

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
}
