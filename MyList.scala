package lectures.part2oop

// Own implementation of list of integers
abstract class MyList {
/*
  Singly linked list

  head = first element of th elist
  tail = remiander of the list
  isEmpty = is this list empty
  add = receive Integer and returna new list with this element added
  toString = string representation of the list
*/

  def head: Int
  def tail: MyList

  def isEmpty(list: MyList)

  def add(item: Int): MyList

  def toString(): String
}

class MyLinkedList extends MyList {

  def head: Int
  def tail: MyList

  def isEmpty(list: MyList)

  def add(item: Int): MyList = {

  }

  def toString(): String
}
