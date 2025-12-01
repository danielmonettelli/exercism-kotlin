object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()
        val isQuestion = trimmed.endsWith("?")
        val isYelling = input.uppercase() == input && input.any() { it.isLetter() }

        return when {
            trimmed.isBlank() -> "Fine. Be that way!"
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"
            isQuestion -> "Sure."
            isYelling -> "Whoa, chill out!"
            else -> "Whatever."
        }
    }
}
