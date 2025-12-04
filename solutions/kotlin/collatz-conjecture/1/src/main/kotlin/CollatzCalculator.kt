object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0) { "The start must be positive." }
        var steps = 0
        var n = start.toLong()

        while (n != 1L) {
            steps++
            if (n % 2 == 0L) {
                n = n / 2
            } else {
                n = n * 3 + 1
            }
        }
        return steps
    }
}
