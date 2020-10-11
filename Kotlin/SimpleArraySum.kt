/**
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 *
 * Run with:
 * kotlinc SimpleArraySum.kt -include-runtime -d SimpleArraySum.jar
 * java -jar SimpleArraySum.jar
 */

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

fun simpleArraySum(ar: Array<Int>) = ar.reduce { sum, element -> sum + element }

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
