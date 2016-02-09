package com.epeinado.problems.lists

/**
 * Created by epeinado on 9/02/16.
 */
class Lists {

  // P01 (*) Find the last element of a list.
  def last(list: List[Any]): Any = {
    // list.last
    list match {
      case Nil => Nil
      case elem :: Nil => elem
      case _ :: rest => last(rest)
    }
  }

  // P02 (*) Find the last but one element of a list.
  def penultimate(list: List[Any]): Any = {
    list match {
      case Nil => throw new Exception
      case a :: b :: Nil => a
      case _ :: rest => penultimate(rest)
    }
  }

  // P03 (*) Find the Kth element of a list.
  def nth(elem: Int, list: List[Any]): Any = {
    (elem, list) match {
      case (el, Nil) => throw new Exception
      case (0, el :: rest) => el
      case (e, l :: rest) => nth(e - 1, rest)
    }
  }

  // P04 (*) Find the number of elements of a list.
  def length(list: List[Any]): Int = {
    list match {
      case Nil => 0
      case a :: rest => length(rest) + 1
    }
  }

  // P05 (*) Reverse a list.
  def reverse(list: List[Any]): List[Any] = {
    list match {
      case Nil => Nil
      case a :: rest => reverse(rest) ::: a :: Nil
    }
  }

  // P06 (*) Find out whether a list is a palindrome.
  def isPalindrome(list: List[Any]): Boolean = {
    // TODO
    true
  }

  // P07 (**) Flatten a nested list structure.
  def flatten(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P08 (**) Eliminate consecutive duplicates of list elements.
  // If a list contains repeated elements they should be replaced with
  // a single copy of the element. The order of the elements should
  // not be changed.
  def compress(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P09 (**) Pack consecutive duplicates of list elements into sublists.
  // If a list contains repeated elements they should be placed in
  // separate sublists.
  def pack(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P10 (*) Run-length encoding of a list.
  // Use the result of problem P09 to implement the so-called
  // run-length encoding data compression method. Consecutive
  // duplicates of elements are encoded as tuples (N, E)
  // where N is the number of duplicates of the element E.
  def encode(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // // P11 (*) Modified run-length encoding.
  // Modify the result of problem P10 in such a way that if an
  // element has no duplicates it is simply copied into the result
  // list. Only elements with duplicates are transferred as (N, E) terms.
  def encodeModified(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P12 (**) Decode a run-length encoded list.
  // Given a run-length code list generated as specified in problem P10,
  // construct its uncompressed version.
  def decode(list: List[Any]): List[Any] = {
    // TODO
    List()
  }
  
  // P13 (**) Run-length encoding of a list (direct solution).
  //  Implement the so-called run-length encoding data compression
  // method directly. I.e. don't use other methods you've written
  // (like P09's pack); do all the work directly.
  def encodeDirect(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P14 (*) Duplicate the elements of a list.
  def duplicate(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P15 (**) Duplicate the elements of a list a given number of times.
  def duplicateN(dup: Int, list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P16 (**) Drop every Nth element from a list.
  def drop(elem: Int, list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P17 (*) Split a list into two parts.
  def split(part: Int, list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P18 (**) Extract a slice from a list.
  // Given two indices, I and K, the slice is the list containing
  // the elements from and including the Ith element up to but not
  // including the Kth element of the original list.
  // Start counting the elements with 0.
  def slice(I: Int, K: Int, list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P19 (**) Rotate a list N places to the left.
  def rotate(N: Int, list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P20 (*) Remove the Kth element from a list.
  //  Return the list and the removed element in a Tuple.
  // Elements are numbered from 0.
  def removeAt(Kth: Int, list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P21 (*) Insert an element at a given position into a list.
  def insertAt(elem: Any, pos: Int, list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P22 (*) Create a list containing all integers within a given range.
  def range(init: Int, end: Int): List[Any] = {
    // TODO
    List()
  }

  // P23 (**) Extract a given number of randomly selected elements from a list.
  //  Hint: Use the solution to problem P20
  def randomSelect(num: Int, list: List[Any]): List[Any] = {
    // TODO check solution...
    List()
  }

  // P24 (*) Lotto: Draw N different random numbers from the set 1..M.
  def lotto(N: Int, Max: Int): List[Any] = {
    // TODO
    List()
  }

  // P25 (*) Generate a random permutation of the elements of a list.
  //  Hint: Use the solution of problem P23.
  def randomPermute(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
  // In how many ways can a committee of 3 be chosen from a group of 12 people?
  // We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the
  // well-known binomial coefficient). For pure mathematicians, this result may be great.
  // But we want to really generate all the possibilities.
  def combinations(list: List[Any]): List[Any] = {
    // TODO
    List()
  }


  // P27 (**) Group the elements of a set into disjoint subsets.
  // a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?
  // Write a function that generates all the possibilities.
  def group3(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // b) Generalize the above predicate in a way that we can specify a list of group sizes
  // and the predicate will return a list of groups.

  // Note that we do not want permutations of the group members;
  // i.e. ((Aldo, Beat), ...) is the same solution as ((Beat, Aldo), ...).
  // However, we make a difference between ((Aldo, Beat), (Carla, David), ...)
  // and ((Carla, David), (Aldo, Beat), ...).

  // You may find more about this combinatorial problem in a good book on discrete
  // mathematics under the term "multinomial coefficients".


  // P28 (**) Sorting a list of lists according to length of sublists.
  // a) We suppose that a list contains elements that are lists themselves.
  // The objective is to sort the elements of the list according to their length.
  // E.g. short lists first, longer lists later, or vice versa.
  def lsort(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

  // b) Again, we suppose that a list contains elements that are lists themselves.
  // But this time the objective is to sort the elements according to their
  // length frequency; i.e. in the default, sorting is done ascendingly, lists
  // with rare lengths are placed, others with a more frequent length come later.
  // Note that in the above example, the first two lists in the result have length 4
  // and 1 and both lengths appear just once. The third and fourth lists have length 3
  // and there are two list of this length. Finally, the last three lists have length 2.
  // This is the most frequent length.
  def lsortFreq(list: List[Any]): List[Any] = {
    // TODO
    List()
  }

}
