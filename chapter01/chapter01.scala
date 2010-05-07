// vim: set ts=2 sw=2 et:
object Chapter01 {
  def factorial(x:BigInt): BigInt = 
    if ( x == 0 ) 1 else x * factorial(x - 1)

}

// ２引数をとるコンストラクタ
class MyClass(index: Int, name: String)

// 関数リテラル
object Test {
  def test {
    val name = "Hogehoge"
    // 2.8ではdeprecatedみたい。
    // val nameHasUpperCase = name.exists(_.isUpperCase)
    val nameHasUpperCase = name.exists(_.isUpper) // _.isUpeerが関数リテラル
    println( nameHasUpperCase )
  }
}
