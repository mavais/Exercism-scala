import scala.annotation.tailrec

object PrimeFactors extends App {
   def factors(n: Long) = {
     var list = List[Long]()
     @tailrec
     def iter(n: Long, x:Long): List[Long] = {
       if (n%x == 0) list = list :+ x   
       if (n==1 | (n/x == 1 && n%x == 0)) list else iter(if (n%x ==0) n/x else n, if(n%x == 0) x else x+1)
     }
     iter(n,2)
   }
}