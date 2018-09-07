case class PalindromeProducts(init: Int, last: Int) {
    
	val list = (init to last).toList
    
    def palindrome(j:Int, k: Int) = (j*k).toString() == (j*k).toString().reverse
    
    val palindromeproducts = for(j <- list; k  <- list if (palindrome(j,k) && j<=k)) yield (j*k,(j,k))  // j<=k ; to eliminate duplicate factors like (2,3) and (3,2) for 6
    
    val groupedpallindrome = palindromeproducts.groupBy(_._1).mapValues(_.map(_._2).toSet).toList
    
    def largest: Option[(Int, Set[(Int, Int)])] = if (groupedpallindrome.isEmpty) None else Some(groupedpallindrome.maxBy(r=>r._1))
    
    def smallest: Option[(Int, Set[(Int, Int)])] = if (groupedpallindrome.isEmpty) None else Some(groupedpallindrome.minBy(r=>r._1))
    
}
