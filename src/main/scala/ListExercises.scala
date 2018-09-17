object ListExercises {

  // if v belongs to the list l, it returns true else returns false
  // can't use contain
  def belongs(v: Int, l: List[Int]): Boolean ={
    if(l.isEmpty){
      false
    }else if(v == l.head){
      true
    }else{
      belongs(v, l.tail)
    }
  }

  // return the size
  // can't use l.length()
  def n_elements(l: List[Int]): Int ={
    if(l.isEmpty){
      0
    }else{
      1 + n_elements(l.tail)
    }
  }

  // return the biggest element
  // can'' use l.max()
  def biggest(l: List[Int]): Int = {
    if(l.isEmpty) {
      // return the smallest int possible in Scala
      -2147483648
    }else{
      val v = l.head
      val next = biggest(l.tail)
      if(v > next){
        v
      }else{
        next
      }
    }

  }

  // auxiliary method that returns the list without the value
  private def rm(xs: List[Int], value: Int): List[Int] = xs match {
    case `value` :: tail =>  tail
    case x :: tail => x :: rm(tail, value)
    case _ => Nil
  }

  // gets the n biggest numbers in a list
  def n_biggest(n: Int, l: List[Int]): List[Int] = {
    if(n >= l.length){
      l
    }else if(n == 0){
      Nil
    }else{
      val r1: List[Int] = List(l.max)
      val r2: List[Int] = n_biggest(n - 1, rm(l, l.max))
      r2 ++ r1
    }
  }

  // count the number of occurrences of v in list
  def count_occurrences(v: Int, l: List[Int]): Int ={
    if(l.isEmpty){
      0
    }else if(l.head != v){
      0 + count_occurrences(v, l.tail)
    }else{
      1 + count_occurrences(v, l.tail)
    }
  }

  // returns true if there is a single occurrence of v in l
  // returns false if there is no occurrence of v in l
  // or if there is more than one occurrence of v in l
  def single_occurrence(v: Int, l: List[Int]): Boolean = {
    if(count_occurrences(v, l) == 1){
      true
    }else{
      false
    }
  }

  // return a list of l elements bigger than n
  def bigger_than(n: Int, l: List[Int]): List[Int] ={
    if(l.isEmpty){
      Nil
    }else if(l.head > n){
      val r1: List[Int] = List(l.head)
      val r2: List[Int] = bigger_than(n, l.tail)
      r1 ++ r2
    }else{
      bigger_than(n, l.tail)
    }
  }

  def remove_last(l: List[Int]): List[Int] = {
    if(l.tail.isEmpty){
      Nil
    }else{
      val r1: List[Int] = List(l.head)
      val r2: List[Int] = remove_last(l.tail)
      r1 ++ r2
    }
  }


  def invert(l: List[Int]): List[Int] = {
    if(l.isEmpty){
      Nil
    }else{
      val r1: List[Int] = List(l.head)
      val r2: List[Int] = invert(l.tail)
      r2 ++ r1
    }
  }

  // divide a list in the n position
  // returns a list that contains:
  // a list that contains all element before position n and
  // a list that contains all element after position n
  def divide(n: Int, l: List[Int]): List[List[Int]] = {
    List(l.take(n), l.takeRight(l.length - n))
  }

  // return the intersection between l1 and l2
  // l1 and l2 dont have repeated elements
  def intersection(l1: List[Int], l2: List[Int]): List[Int] ={
    if(l1.isEmpty){
      Nil
    }else{
      val r2: List[Int] = intersection(l1.tail, l2)
      if(l2.contains(l1.head)){
        val r1: List[Int] = List(l1.head)
        r1 ++ r2
      }else {
        r2
      }
    }
  }
}
