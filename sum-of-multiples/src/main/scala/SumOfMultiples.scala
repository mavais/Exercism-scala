object SumOfMultiples extends App {
  def sum(factors: Set[Int], limit: Int) = { 
    val ListOfMultiples = for (x <- factors; i <- 1 to (limit/x) if (x*i < limit)) yield (x*i)
    ListOfMultiples.foldLeft(0)(_+_)
  }
}

