fun main() {
    println(CodelandUsernameValidation("username"))

}

fun CodelandUsernameValidation(str: String): Boolean {

    // Username is between 4 and 25 characters
    var ruleLength = str.length in 4..25

    // Username must start with a letter
    var ruleFirstChar = (str[0] in 'a'..'z') || (str[0] in 'A'..'Z')

    // Username can only contain letters, numbers, and the underscore character
    var ruleCharType: Boolean = true
    str.forEach {
        ruleCharType = ruleCharType && (it in 'a'..'z' || it in 'A'..'Z' || it in '0'..'9' || it == '_')
    }

    // Username cannot end with an underscore character
    var ruleLastChar = !(str[(str.length) - 1] in "_")

    // Are all conditions met?
    var valid = ruleLength && ruleFirstChar && ruleCharType && ruleLastChar

    return valid
}

