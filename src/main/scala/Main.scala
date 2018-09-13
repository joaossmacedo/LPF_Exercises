object Main {
  def main(args: Array[String]): Unit = {
    val l1 = List(1,2,3,4)

    val i = 2
    println(i + " belongs to " + l1 + "? " + ListExercises.belongs(i, l1))
    println("Size: " + ListExercises.n_elements(l1))
    println("Biggest: " + ListExercises.biggest(l1))
    println("The " + i + " biggest numbers in " + l1 + ": " + ListExercises.n_biggest(i, l1))
  }
}