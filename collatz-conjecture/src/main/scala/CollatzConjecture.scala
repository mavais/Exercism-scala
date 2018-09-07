import scala.annotation.tailrec

object CollatzConjecture extends App {
  def steps(n: Int): Option[Int] = {
     @tailrec
     def iter(n: Int, x: Int): Option[Int] = {
		if (n<1) None else if (n == 1) Some(x) else iter(if (n%2==0) n/2 else 3*n+1, x+1) 
	 }
	iter(n,0)
  
  /* Used tailrec as it avoids var
  
    n compare 1 match {
      case 1 => { var count = 0
                  var x = n
                  do{
                     x = if (x%2 == 0) x/2 else 3*x+1
                     count = count + 1
                   } while (x != 1)
                 Some(count)
              }
      case 0 => Some(0)
      case _ => None
	}
	
	*/
  }
}  
	
	