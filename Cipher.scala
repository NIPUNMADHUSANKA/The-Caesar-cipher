object Cipher {
  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val shift_number = 1
  def main(args: Array[String]): Unit = {
  {
    println(caesar(encryption,"HelloNipun"))
    println(caesar(decryption,"IFMMPOJQVO"))

  }

  }

  val caesar = (MD:(Char)=>Char,code:String)=>code.map(MD(_))

  val encryption = (c:Char)=>alphabet((alphabet.indexOf(c.toUpper)+shift_number)%alphabet.size)

  val decryption = (c:Char)=>alphabet((alphabet.indexOf(c.toUpper)-shift_number)%alphabet.size)

}
