object Leap {
  def leapYear(year: Int): Boolean = isDivisibleBy(year, 400)  | 
                                     (isDivisibleBy(year, 4) && !isDivisibleBy(year, 100))
  
  def isDivisibleBy(year: Int, factor: Int) = year % factor == 0
}
