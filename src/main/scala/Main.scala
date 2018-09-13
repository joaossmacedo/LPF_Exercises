object Main {
  def main(args: Array[String]): Unit = {
    val l1 = List(1,2,3,4)

    val j = 1
    val i = 2
    println(i + " belongs to " + l1 + "? " + ListExercises.belongs(i, l1))
    println("Size: " + ListExercises.n_elements(l1))
    println("Biggest: " + ListExercises.biggest(l1))
    println("The " + i + " biggest numbers in " + l1 + ": " + ListExercises.n_biggest(i, l1))

    val list = List(1,2,4,2,4,7,3,2,4)
    println(i + " appear in " + list + ": " + ListExercises.count_occurrences(i, list) + " times")
    println("Is there a single occurrence of " + j + " in " + list + "? " + ListExercises.single_occurrence(j, list))
    println("Bigger than " + i + " in " + list + ": " + ListExercises.bigger_than(i, list))
  }
}