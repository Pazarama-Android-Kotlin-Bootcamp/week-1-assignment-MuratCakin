fun main() {
    println(QuestionsMarks("acc?7??sss?3rr1??????5"))
}

fun QuestionsMarks(str: String): String {
    // Question Mark counter
    var QMCount = 0
    var lastDigit = -1
    var result = "false"

    for (char in str) {
        if (char.isDigit()) {
            val digit = Integer.valueOf(char.toString())
            val sum = digit + lastDigit
            lastDigit = digit

            // Check the sum
            if (sum != 10) {
                QMCount = 0
                continue
            }

            result = if (QMCount == 3) "true" else "false"
            QMCount = 0
        } else if (char == '?') QMCount++
    }
    return result;
}
