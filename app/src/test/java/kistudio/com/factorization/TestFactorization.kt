package kistudio.com.factorization

import kistudio.com.factorization.util.Factorization
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class TestFactorization {

  @Test
  fun testWithNegativeValue() {
    assertArrayEquals(emptyArray(), Factorization.primeFactors(-1))
  }

  @Test
  fun testWithMinimumValue() {
    assertArrayEquals(emptyArray(), Factorization.primeFactors(Int.MIN_VALUE))
  }

  @Test
  fun testThat0HasNoPrimeFactors() {
    assertArrayEquals(emptyArray(), Factorization.primeFactors(0))
  }

  @Test
  fun testThat1HasNoPrimeFactors() {
    assertArrayEquals(emptyArray(), Factorization.primeFactors(1))
  }

  @Test
  fun testThatAPrimeNumberHasExactlyOnePrimeFactor() {
    assertArrayEquals(arrayOf(2), Factorization.primeFactors(2))
  }

  @Test
  fun testThatASquareOfAPrimeHasExactlyOnePrimeFactorRepeatedTwice() {
    assertArrayEquals(arrayOf(3, 3), Factorization.primeFactors(9))
  }

  @Test
  fun testThatACubeOfAPrimeHasExactlyOnePrimeFactorRepeatedThreeTimes() {
    assertArrayEquals(arrayOf(2, 2, 2), Factorization.primeFactors(8))
  }

  @Test
  fun testThatAProductOfPrimesAndNonPrimesIsFactoredProperly() {
    assertArrayEquals(arrayOf(2, 2, 3), Factorization.primeFactors(12))
  }

  @Test
  fun testThatAProductOfSmallPrimesIsFactoredProperly() {
    assertArrayEquals(arrayOf(5, 17, 23, 461), Factorization.primeFactors(901255))
  }

  @Test
  fun testWithIntMaximumValueAndProductivity() {
    val timeBefore = System.currentTimeMillis()
    assertArrayEquals(arrayOf(Int.MAX_VALUE), Factorization.primeFactors(Int.MAX_VALUE))
    val timeAfter = System.currentTimeMillis()
    assertTrue(timeAfter - timeBefore < 50)
  }

}
