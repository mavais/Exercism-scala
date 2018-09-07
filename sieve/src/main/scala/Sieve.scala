object Sieve extends App {
  def primes(limit: Int) = {
     val list = (2 to limit).toList
     val remain = for (x <- list; y <- (x+1 to limit) if(y%x == 0)) yield y
    list.diff(remain)
  } 
} 