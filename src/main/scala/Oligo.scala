/**
 * Created by david_williams on 9/29/15.
 */
case class Oligo (Sequence:String) {

  val NumberOfA = numberOf('A')
  val NumberOfT = numberOf('T')
  val NumberOfG = numberOf('G')
  val NumberOfC = numberOf('C')

  def isValid:Boolean = Sequence.matches ("[atgcATGC]+")

  def numberOf(characterToCount: Char): Int = Sequence.count(_ == characterToCount)

  def printOligoSummary () = {
    println(s"$Sequence: A($NumberOfA), T($NumberOfT), G($NumberOfG), C($NumberOfC)")
    // println(Sequence + ": A(" +  NumberOfA + "), T("+  NumberOfT + "), G("+  NumberOfG + "), C("+  NumberOfC + ")" )
  }

}
