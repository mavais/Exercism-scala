object Isogram extends App {
  def isIsogram(word: String): Boolean = {
    val wordwithonlyalpha = word.replaceAll("""\P{Alpha}+""", "").toLowerCase()
    wordwithonlyalpha.length() == wordwithonlyalpha.toList.distinct.length
  }
}