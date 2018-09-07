object Pangrams {
  def isPangram(input: String): Boolean = {
	val setofalpha = ('a' to 'z').toSet
	val inputset = input.toLowerCase().toSet 			 //case insensitive
	setofalpha.subsetOf(inputset)
  }
}

