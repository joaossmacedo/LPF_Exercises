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

  def rm(xs: List[Int], value: Int): List[Int] = xs match {
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
}
