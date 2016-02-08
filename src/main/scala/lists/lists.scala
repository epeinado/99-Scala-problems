package lists

/**
 * Created by epeinado on 8/02/16.
 */
object lists {

  // P01 Find the last element of a list
  def last(list: List[Int]): Int = {
    list.last
  }

  // P02 Find the last but one element of a list
  def penultimate(list: List[Int]): Int = {
    0
  }

  // P03 Find the Kth element of a list
  // (By convention, the first element in the list is element 0)
  def nth(list: List[Int]): Int = {
    0
  }

  // P04 Find the number of elements of a list
  def length(list: List[Int]): Int = {
    0
  }

  // P05 Reverse a list
  def reverse(list: List[Int]): List[Int] = {
    List()
  }

  // P06 Find out whether a list is a palindrome
  def isPalindrome(list: List[Int]): Boolean = {
    true
  }

  // P07 Flatten a nested list structure
  def flatten(list: List[Int]): List[Int] = {
    List()
  }

  // P08 Eliminate consecutive duplicates of list elements
  // if a list contains repetead elements they should be replaced with a single
  // copy of the element. The order of the elements should not be changed.
  def compress(list: List[Int]): List[Int] = {

  }

  def main(args: Array[String]) {
    println(last(List(1, 1, 2, 3, 5, 8)) == 8)
    println(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
    println(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
    println(length(List(1, 1, 2, 3, 5, 8)) == 6)
    println(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
    println(isPalindrome(List(1, 2, 3, 2, 1)) == true)
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
    //    println()
    //    println()
    //    println()
  }
}
