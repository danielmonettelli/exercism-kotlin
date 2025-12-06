import kotlin.math.sqrt

object Darts {

    fun score(x: Any, y: Any /* choose proper types! */): Int {
        val xDouble = (x as Number).toDouble()
        val yDouble = (y as Number).toDouble()
        val distance = sqrt((xDouble * xDouble) + (yDouble * yDouble))

        return when {
            distance > 10 -> 0
            distance > 5 -> 1
            distance > 1 -> 5
            else -> 10
        }
    }
}
