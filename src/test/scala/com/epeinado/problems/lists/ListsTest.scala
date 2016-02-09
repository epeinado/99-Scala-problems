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

  "P09 pack " should "be checked" in {
    assert(lists.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  "P10 encode " should "be checked" in {
    assert(lists.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  }

  "P11 encodeModified " should "be checked" in {
    assert(lists.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e)))
  }

  "P12 decode " should "be checked" in {
    assert(lists.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

  "P13 encodeDirect" should "be checked" in {
    assert(lists.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  "P14 duplicate" should "be checked" in {
    assert(lists.duplicate(List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

  "P15 duplicateN" should "be checked" in {
    assert(lists.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

  "P16 drop" should "be checked" in {
    assert(lists.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

  "P17 split" should "be checked" in {
    assert(lists.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }

  "P18 slice" should "be checked" in {
    assert(lists.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g))
  }

  "P19 rotate" should "be checked" in {
    assert(lists.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
    assert(lists.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }

  "P20 removeAt" should "be checked" in {
    assert(lists.removeAt(1, List('a, 'b, 'c, 'd)) == List('a, 'c, 'd),'b)
  }

  "P21 insertAt" should "be checked" in {
    assert(lists.insertAt('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd))
  }

  "P22 range" should "be checked" in {
    assert(lists.range(4, 9) == List(4, 5, 6, 7, 8, 9))
  }

  "P23 randomSelect" should "be checked" in {
    assert(lists.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) == List('e, 'd, 'a))
  }

  "P24 lotto" should "be checked" in {
    assert(lists.lotto(6, 49) == List(23, 1, 17, 33, 21, 37))
  }

  "P25 randomPermute" should "be checked" in {
    assert(lists.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)) == List('b, 'a, 'd, 'c, 'e, 'f))
  }

  "P26 combinations" should "be checked" in {
    // TODO: Check this assert
//    assert(lists.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)) == List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), .../)
  }

  "P27 group" should "be checked" in {
    // TODO: Check this assert
    //    assert(lists.group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")) ==  List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...)
  }

  "P28 lsort" should "be checked" in {
    assert(lists.lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))) == List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l)))
    assert(lists.lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))) == List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n)))
  }

}