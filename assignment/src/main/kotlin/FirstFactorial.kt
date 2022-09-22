fun main() {
    println(FirstFactorial(7))
}

fun FirstFactorial(num: Int): Int {
    if (num == 1) {
        return 1
    } else {
        // We can also use this function inside while defining the function.
        // This structure is called a recursive function.
        return num * FirstFactorial(num - 1)
    }
}

