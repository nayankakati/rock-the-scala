package lectures.part2oop

object AbstractDataTypes extends App {

  // Abstract class

  abstract class Animal {
    val AType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val AType: String = "canine"

    override def eat: Unit = println("NomNom and Crunch crunch")
  }

  // Traits
  trait Carnivore extends Animal {
    def eat(animal: Animal): Unit
  }

  trait bark

  class Crocodile extends Animal with Carnivore with bark {
    override val AType: String = "canine"

    override def eat: Unit = println("nomnom nom")
    override def eat(animal: Animal): Unit = println(s"I eat animal ${animal.AType}")
  }
  // Difference between Abstract and traits
  // They both contains
}
