file://<HOME>/Desktop/IBM/courses/Scala%20EPFL/scala-project/src/main/scala/app.scala
### file%3A%2F%2F%2FUsers%2Fvigneshshetty%2FDesktop%2FIBM%2Fcourses%2FScala%2520EPFL%2Fscala-project%2Fsrc%2Fmain%2Fscala%2Fapp.scala:1: error: illegal start of definition identifier
im
^

occurred in the presentation compiler.

action parameters:
uri: file://<HOME>/Desktop/IBM/courses/Scala%20EPFL/scala-project/src/main/scala/app.scala
text:
```scala
im
object app extends App{

    println("hello")
    val a="ddsd"
    print(a.toUpperCase())

}

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4464)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$13(ScalametaParser.scala:4696)
	scala.Option.getOrElse(Option.scala:189)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$1(ScalametaParser.scala:4696)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.batchSource(ScalametaParser.scala:4652)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4645)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4645)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4650)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:135)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:132)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:59)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:54)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:132)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:29)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:374)
```
#### Short summary: 

file%3A%2F%2F%2FUsers%2Fvigneshshetty%2FDesktop%2FIBM%2Fcourses%2FScala%2520EPFL%2Fscala-project%2Fsrc%2Fmain%2Fscala%2Fapp.scala:1: error: illegal start of definition identifier
im
^