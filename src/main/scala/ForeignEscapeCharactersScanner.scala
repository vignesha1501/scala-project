import org.apache.spark.sql.{SparkSession, DataFrame}
import org.apache.spark.sql.functions._

object ForeignEscapeCharactersScanner{
    def containsForeignCharacters(column: String): Boolean = {
    val foreignRegex = "[^\\x00-\\x7F]".r
    foreignRegex.findFirstIn(column).isDefined
  }

  def containsEscapeCharacters(column: String): Boolean = {
    column.contains("\t") || column.contains("\n")
  }

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("ForeignCharacterScanner")
      .master("local[2]") 
      .getOrCreate()

    val data = Seq(
      ("Spark", "Scala", "2017초록통계"),
      ("With", "Escape", "A\tB"),
      ("And", "Another", "C\nD")
    )

    val df = spark.createDataFrame(data).toDF("col1", "col2", "col3")

    var columnsWithForeignCharacters = List[String]()
    var columnsWithEscapeCharacters = List[String]()

    for (col <- df.columns) {
      val containsForeign = df.select(col).collect().map(row => containsForeignCharacters(row.getString(0))).head
      if (containsForeign) {
        columnsWithForeignCharacters = col :: columnsWithForeignCharacters
      }

      val containsEscape = df.select(col).collect().map(row => containsEscapeCharacters(row.getString(0))).head
      if (containsEscape) {
        columnsWithEscapeCharacters = col :: columnsWithEscapeCharacters
      }
    }

    println("Columns with foreign characters:")
    columnsWithForeignCharacters.foreach(println)

    println("\nColumns with escape characters:")
    columnsWithEscapeCharacters.foreach(println)

    spark.stop()
  }
}