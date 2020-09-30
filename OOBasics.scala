package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 12)
  person.greetings("nayan")
}

//Constructors
class Person(name: String, val age: Int) {
  val x = 2;

  def greetings(name: String): Unit = println(s"Hi ${this.name},this is $name")

  //Multiple constructors
  def this(name: String) = this(name, 0)

}
// Class parameters are not FIELDS i.e. person.age is not valid

// we need to add val as => val age: Int
