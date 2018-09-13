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

  // return the bigger element
  // can'' use l.max()
  def bigger(l: List[Int]): Int = {
    if(l.isEmpty) {
      // return the smallest int possible in Scala
      -2147483648
    }else{
      val v = l.head
      val next = bigger(l.tail)
      if(v > next){
        v
      }else{
        next
      }
    }

  }

}
