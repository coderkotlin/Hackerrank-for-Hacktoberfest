/**
 * https://www.hackerrank.com/challenges/solve-me-first/problem
 *
 * Run with:
 * kotlinc SolveMeFirst.kt -include-runtime -d SolveMeFirst.jar
 * java -jar SolveMeFirst.jar
 */

import java.util.*

fun solveMeFirst(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}
