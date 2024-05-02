file://<HOME>/Desktop/IBM/courses/Scala%20EPFL/scala-project/src/main/scala/app.scala
### file%3A%2F%2F%2FUsers%2Fvigneshshetty%2FDesktop%2FIBM%2Fcourses%2FScala%2520EPFL%2Fscala-project%2Fsrc%2Fmain%2Fscala%2Fapp.scala:5: error: unclosed string literal
    .master("local[*]"")
                      ^

occurred in the presentation compiler.

action parameters:
uri: file://<HOME>/Desktop/IBM/courses/Scala%20EPFL/scala-project/src/main/scala/app.scala
text:
```scala
import org.apache.spark.sql.{SparkSession, DataFrame}
object app extends App{
    val spark= SparkSession.builder()
    .appName("Vignesh Spark App")
    .master("local[*]"")
    println("hello")
    val a="ddsd"
    print(a.toUpperCase())

}

```



#### Error stacktrace:

```
scala.meta.internal.tokenizers.Reporter.syntaxError(Reporter.scala:23)
	scala.meta.internal.tokenizers.Reporter.syntaxError$(Reporter.scala:23)
	scala.meta.internal.tokenizers.Reporter$$anon$1.syntaxError(Reporter.scala:33)
	scala.meta.internal.tokenizers.Reporter.syntaxError(Reporter.scala:25)
	scala.meta.internal.tokenizers.Reporter.syntaxError$(Reporter.scala:25)
	scala.meta.internal.tokenizers.Reporter$$anon$1.syntaxError(Reporter.scala:33)
	scala.meta.internal.tokenizers.LegacyScanner.getStringLit(LegacyScanner.scala:553)
	scala.meta.internal.tokenizers.LegacyScanner.fetchDoubleQuote$1(LegacyScanner.scala:372)
	scala.meta.internal.tokenizers.LegacyScanner.fetchToken(LegacyScanner.scala:376)
	scala.meta.internal.tokenizers.LegacyScanner.nextToken(LegacyScanner.scala:211)
	scala.meta.internal.tokenizers.LegacyScanner.foreach(LegacyScanner.scala:1011)
	scala.meta.internal.tokenizers.ScalametaTokenizer.uncachedTokenize(ScalametaTokenizer.scala:24)
	scala.meta.internal.tokenizers.ScalametaTokenizer.$anonfun$tokenize$1(ScalametaTokenizer.scala:17)
	scala.collection.concurrent.TrieMap.getOrElseUpdate(TrieMap.scala:895)
	scala.meta.internal.tokenizers.ScalametaTokenizer.tokenize(ScalametaTokenizer.scala:17)
	scala.meta.internal.tokenizers.ScalametaTokenizer$$anon$2.apply(ScalametaTokenizer.scala:332)
	scala.meta.tokenizers.Api$XtensionTokenizeDialectInput.tokenize(Api.scala:25)
	scala.meta.tokenizers.Api$XtensionTokenizeInputLike.tokenize(Api.scala:14)
	scala.meta.internal.parsers.ScannerTokens$.apply(ScannerTokens.scala:914)
	scala.meta.internal.parsers.ScalametaParser.<init>(ScalametaParser.scala:33)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:35)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:374)
```
#### Short summary: 

file%3A%2F%2F%2FUsers%2Fvigneshshetty%2FDesktop%2FIBM%2Fcourses%2FScala%2520EPFL%2Fscala-project%2Fsrc%2Fmain%2Fscala%2Fapp.scala:5: error: unclosed string literal
    .master("local[*]"")
                      ^