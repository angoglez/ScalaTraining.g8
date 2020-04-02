package m1.e1

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ProteinTranslationTest extends AnyFunSuite with Matchers {

  // Here you can find some pending tests to prove the correct behaviour of your solution.
  // You must keep in mind you will have to take into account corner cases or
  // possible scenarios where your solution can fail.
  // For example...
  // What happens if the user introduces one incorrect string?
  // With letter sequences that don't match any codon or even a string
  // with less/more letters than needed.

  // TODO: Think about what will be the behaviour of your solution in that case and write a pending test to prove that.
  // Once implemented, delete "pending"

  pending test("Methionine RNA sequence") {
    ProteinTranslation.proteins("AUG") should be(Seq("Methionine"))
  }

  pending test("Phenylalanine RNA sequence 1") {
    ProteinTranslation.proteins("UUU") should be(Seq("Phenylalanine"))
  }

  pending test("Phenylalanine RNA sequence 2") {
    ProteinTranslation.proteins("UUC") should be(Seq("Phenylalanine"))
  }

  pending test("Leucine RNA sequence 1") {
    ProteinTranslation.proteins("UUA") should be(Seq("Leucine"))
  }

  pending test("Leucine RNA sequence 2") {
    ProteinTranslation.proteins("UUG") should be(Seq("Leucine"))
  }

  pending test("Serine RNA sequence 1") {
    ProteinTranslation.proteins("UCU") should be(Seq("Serine"))
  }

  pending test("Serine RNA sequence 2") {
    ProteinTranslation.proteins("UCC") should be(Seq("Serine"))
  }

  pending test("Serine RNA sequence 3") {
    ProteinTranslation.proteins("UCA") should be(Seq("Serine"))
  }

  pending test("Serine RNA sequence 4") {
    ProteinTranslation.proteins("UCG") should be(Seq("Serine"))
  }

  pending test("Tyrosine RNA sequence 1") {
    ProteinTranslation.proteins("UAU") should be(Seq("Tyrosine"))
  }

  pending test("Tyrosine RNA sequence 2") {
    ProteinTranslation.proteins("UAC") should be(Seq("Tyrosine"))
  }

  pending test("Cysteine RNA sequence 1") {
    ProteinTranslation.proteins("UGU") should be(Seq("Cysteine"))
  }

  pending test("Cysteine RNA sequence 2") {
    ProteinTranslation.proteins("UGC") should be(Seq("Cysteine"))
  }

  pending test("Tryptophan RNA sequence") {
    ProteinTranslation.proteins("UGG") should be(Seq("Tryptophan"))
  }

  pending test("STOP codon RNA sequence 1") {
    ProteinTranslation.proteins("UAA") should be(Seq())
  }

  pending test("STOP codon RNA sequence 2") {
    ProteinTranslation.proteins("UAG") should be(Seq())
  }

  pending test("STOP codon RNA sequence 3") {
    ProteinTranslation.proteins("UGA") should be(Seq())
  }

  pending test("Translate RNA strand into correct protein list") {
    ProteinTranslation.proteins("AUGUUUUGG") should be(
      Seq("Methionine", "Phenylalanine", "Tryptophan"))
  }

  pending test("Translation stops if STOP codon at beginning of sequence") {
    ProteinTranslation.proteins("UAGUGG") should be(Seq())
  }

  pending test("Translation stops if STOP codon at end of two-codon sequence") {
    ProteinTranslation.proteins("UGGUAG") should be(Seq("Tryptophan"))
  }

  pending test("Translation stops if STOP codon at end of three-codon sequence") {
    ProteinTranslation.proteins("AUGUUUUAA") should be(
      Seq("Methionine", "Phenylalanine"))
  }

  pending test("Translation stops if STOP codon in middle of three-codon sequence") {
    ProteinTranslation.proteins("UGGUAGUGG") should be(Seq("Tryptophan"))
  }

  pending test("Translation stops if STOP codon in middle of six-codon sequence") {
    ProteinTranslation.proteins("UGGUGUUAUUAAUGGUUU") should be(
      Seq("Tryptophan", "Cysteine", "Tyrosine"))
  }
}
