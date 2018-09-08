object Main {
  def main(args: Array[String]): Unit = {
    val i = 7
    println("Factorial of " + i + ": " + Recursion.factorial(i))
    println("Fibonacci of " + i + ": " + Recursion.fibonacci(i))
    val k = 2
    val n = 762021192
    println("Number of occurrences of " + k + " in " + n + ": " + Recursion.count(k, n))
    val row = 5
    val col = 3
    println("Pascal triangle (" + row + "," + col + "): " + Recursion.pascalTriangle(row - 1, col - 1))
    val a = 12
    val b = 18
    println("GDC of "+ a + " and " + b + " is: " + Recursion.gcd(a,b))


    println("")

    def add(n:Int) = (x:Int) => x + n

    println("Bigger: " + HighOrderFunctions.bigger(add(2),add(1))(1))
    println("Average: " + HighOrderFunctions.average(add(2),add(1))(1))
    println("Sum: " + HighOrderFunctions.sum(add(1), 2, 4))
    println(HighOrderFunctions.AP(1994, 4, 4))


  }
}