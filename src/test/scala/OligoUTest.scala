import org.scalatest.{Matchers, FunSuite}

/**
 * Created by david_williams on 9/29/15.
 */

class OligoUTest extends FunSuite with Matchers {

  test("Oligos isValid function can detect when a sequence is a valid Oligo") {
    Oligo("GCTA").isValid shouldBe true
    Oligo("GCTQ").isValid shouldBe false
    Oligo("").isValid shouldBe false
    Oligo(",8=%%").isValid shouldBe false
  }

  test("Oligo can count the number of specific adenine correctly") {
    val testOligo = Oligo("AGAAAGAAAAGAAG")

    testOligo.NumberOfA shouldBe 10
    testOligo.NumberOfC shouldBe 0
    testOligo.NumberOfG shouldBe 4
    testOligo.NumberOfC shouldBe 0
  }

  test("Oligo's numberOf function can count the number of characters in the sequence") {
    Oligo("GGCCGGATTGCGTGGGQQQ").numberOf('T') shouldBe 3
  }
}