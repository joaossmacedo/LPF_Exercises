object HighOrderFunctions {
  // finds the bigger result between 2 functions
  def bigger(f : Int => Int, g : Int => Int): Int => Int = (x: Int) => {
    val a: Int = f(x)
    val b: Int = g(x)

    if(a > b) a
    else b
  }

  // finds the average result between 2 functions
  def average(f : Int => Int, g : Int => Int): Int => Double = (x: Int) => (f(x) + g(x)) / 2.0

  // calculates the sum of the result of the function with the parameter varying from init to end
  // example: sum(f, 2, 5) = f(2) + f(3) + f(4) + f(5)
  def sum(f: Int => Int, init: Int, end: Int): Int ={
    if(init == end){
      f(init)
    }else{
      f(init) + sum(f, init + 1, end)
    }
  }


  // there is an easier way to solve the next problem w/o recursion to see it check the comment below
  //    def AP(start: Int, additional: Int, n: Int): Int = {
  //      start + (n - 1) * additional
  //    }

  // find the n number of the arithmetic progression
  def AP(start: Int, additional: Int, n: Int): Int = {
    def recursiveAP(additional: Int, n: Int): Int ={
      if(n == 1){
        0
      }else{
        additional + recursiveAP(additional, n - 1)
      }
    }
    recursiveAP(additional, n) + start
  }

}
