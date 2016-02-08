package com.epeinado.problems.lists

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Esther on 8/2/16.
 */
@RunWith(classOf[JUnitRunner])
class ListsTest extends FlatSpec with Matchers {
  lazy val lists = new Lists


  "P01 last " should "be checked" in {
    assert(lists.last(List(1, 1, 2, 3, 5, 8)) == 8)
  }

  "P02 penultimate" should "be checked" in {
    assert(lists.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }

  "P03 nth" should "be checked" in {
    assert(lists.nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }

  "P04 length" should "be checked" in {
    assert(lists.length(List(1, 1, 2, 3, 5, 8)) == 6)
  }

  "P05 reverse" should "be checked" in {
    assert(lists.reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }

  "P06  isPalindrome" should "be checked" in {
    assert(lists.isPalindrome(List(1, 2, 3, 2, 1)))
  }

  "P07 flatten" should "be checked" in {
    assert(lists.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

  "P08 compress" should "be checked" in {
    assert(lists.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

  "P09 " should "be checked" in {
    assert(true)
  }

  "P10 " should "be checked" in {
    assert(true)
  }

  "P11 " should "be checked" in {
    assert(true)
  }

  "P12 " should "be checked" in {
    assert(true)
  }
}