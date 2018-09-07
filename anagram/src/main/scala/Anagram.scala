object Anagram extends App {
  def anagrams(word: String, listofanagrams: List[String]) = {
		for (x <- listofanagrams if (!(x.toLowerCase() equals word.toLowerCase()) && 
									  (x.toLowerCase().toList.sorted equals word.toLowerCase().toList.sorted))) yield x
  }
}
