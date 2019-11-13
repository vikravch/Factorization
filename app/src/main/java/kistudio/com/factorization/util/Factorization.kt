package kistudio.com.factorization.util

object Factorization {
  fun primeFactors(x: Int): Array<Int> {
    if (x < 2) return emptyArray()

    val primeFactors = mutableListOf<Int>()
    var remainder = x
    var i = 2
    while (i <= remainder / i) {
      while (remainder % i == 0) {
        primeFactors.add(i)
        remainder /= i
      }
      i++
    }

    if (remainder > 1)
      primeFactors.add(remainder)

    return (primeFactors as List<Int>).toTypedArray()
  }
}