object BeerSong extends App {
  def recite(n: Int, i:Int) = {
    var song = ""
    for(x <- n until (n-i) by -1){
    var left = x - 1
    if (x >= 1 && left > 0)
	  if (i > 1) song = song + s"$x bottles of beer on the wall, $x bottles of beer.\nTake one down and pass it around, $left bottles of beer on the wall.\n"
	  else song = song + s"$x bottles of beer on the wall, $x bottles of beer.\nTake one down and pass it around, $left bottles of beer on the wall.\n\n"
    else if (x >= 1 && left == 0)
      song = song + s"$x bottles of beer on the wall, $x bottles of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\n\n"
    else 
      song = song + "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
    }  
    song
  }
}