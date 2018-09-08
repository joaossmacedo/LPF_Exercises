object Recursion {
  def factorial(n: Int): Int = {
    if (n == 1) {
      n
    } else {
      n * factorial(n - 1)
    }
  }

  def fibonacci(n: Int): Int = { // the sequence starts with 1 and 1
    if (n == 0 || n == 1) {
      n
    } else {
      fibonacci(n - 1) + fibonacci(n - 2)
    }
  }

  def count(k: Int, n: Int): Int = { // count the number of occurrences of k in n
    if (n < 9) {
      0
    } else {
      val digit = n % 10
      if (digit == k) {
        1 + count(k, n / 10)
      } else {
        count(k, n / 10)
      }
    }
  }

  def pascalTriangle(row: Int, col: Int): Int = { // finds a number in the pascal triangle
    var r = 0
    if (row == 0 || col == 0 || row == col) {
      r = 1
    } else {
      r = pascalTriangle(row - 1, col - 1) + pascalTriangle(row - 1, col)
    }
    r
  }

  def gcd(m: Int, n: Int): Int = { // finds the greatest common divisor between m and n
    if (m % n == 0) {
      n
    } else {
      gcd(n, m % n)
    }
  }

}
