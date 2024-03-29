object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length != rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        
        return leftStrand
            .foldIndexed(0) {
                index, count, char -> when {
                    char != rightStrand[index] -> count + 1
                    else -> count
                }
            }
    }
}
