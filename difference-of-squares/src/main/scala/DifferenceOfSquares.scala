object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = (1 to n).toList.map(x => x*x).sum

  def squareOfSum(n: Int): Int = { val sumofall = (1 to n).toList.sum; sumofall * sumofall}

  def differenceOfSquares(n: Int): Int = squareOfSum(n) - sumOfSquares(n)
}
