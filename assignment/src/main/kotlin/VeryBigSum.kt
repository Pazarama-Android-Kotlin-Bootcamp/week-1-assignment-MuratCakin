fun main() {
    val sum = aVeryBigSum(arrayOf(1_000_000_000, 2_000_000_000))
    println(sum)
}

fun aVeryBigSum(arr: Array<Int>): Long {
    // We must use Long data type for numbers that are grater than 32 bit
    var sum = 0L

    arr.forEach { sum += it.toLong() }

    return sum
}