object AtbashCipher:
   private val mapping: Map[Char, Char] =
      ('a' to 'z').map(c => (c, ('z' - (c - 'a')).toChar)).toMap ++ ('0' to '9').map(c => (c, c)).toMap

   def encode(s: String): String =
      s.toLowerCase.toCharArray.filter(_.isLetterOrDigit).map(mapping).mkString.grouped(5).mkString(" ")
   def decode(s: String): String = s.toLowerCase.toCharArray.filter(_.isLetterOrDigit).map(mapping).mkString
