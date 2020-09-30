package lectures.part2oop

object InheritanceAndTraits extends App {

  class Animal {
    def eat: String = "nomnom"
  }

  class Dog extends Animal {
    override def eat: String = "Crunch crunch"
  }
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class adult(name: String, age: Int, idCard: String) extends Person(name, age)

  def unknown: Animal = new Dog

  println(unknown.eat)

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on class
  // 3 - Seal the class = extends the given class in THIS file but prevents the extends on other files




}
