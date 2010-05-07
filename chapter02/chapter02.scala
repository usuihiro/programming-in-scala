// vim: set ts=2 sw=2 et:
// 
// インタプリタを起動して
//
// scala> :load chapter02.scala

// def 関数名( 変数名1:型, 変数名2:型, ... ) : 戻り値 = {}
// 関数のパラメータについては型推論が効かないので型情報が必須
def max( x:Int, y:Int ) : Int = {
  if ( x > y ) x else y
}
 
// 戻り値型は省略可能
// 関数本体が一文のときは中括弧も省略可能
def max2( x:Int, y:Int ) : Int = if ( x > y ) x else y

// 結果はUnit型。voidに似ている。
// 結果がUnit型の関数は副作用のためのみに実行される。
// TODO :loadだとgreetを定義してくれない。インタプリタに貼れば動くけどなんで？
def greet() = println("Hello World")
