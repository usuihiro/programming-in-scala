// vim: set ts=2 sw=2 et fenc=utf-8:
// scala printargs.scala hoge foo bar
//
// whileループ。命令型な記述
println("while")
var i = 0
while ( i < args.length ) {
  if ( i != 0 )
    print(" ")
  print( args(i))
  i += 1
}
println()

// foreachとfor  関数型のスタイル
// 引数は関数リテラル
// ( 変数名1:型, 変数名2:型, .... ) => 関数本体
println("// foreach 1")
args.foreach( ( arg: String ) => println(arg) )
println("// foreach 2")
// 型推論によりargの型を省略
args.foreach( arg => println(arg) )
// 関数リテラルが１個の引数をとる１文から構成される場合は、引数も省略可能
println("// foreach 3")
args.foreach( println )

// for式
// forの中のargはval名
// <-をinと読めばfor arg in args
println("// for")
for ( arg <- args )
  println(arg)
