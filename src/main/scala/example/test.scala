package example

import org.apache.spark.sql.{SparkSession, DataFrame}
import org.apache.spark.sql.types._
import org.apache.spark.sql.Row
import scala.io.Source

object DataFrameFromDDL {
  def main(args: Array[String]): Unit = {
    
    val spark = SparkSession.builder()
  .appName("DataFrame from DDL")
  .master("local[*]")
  .getOrCreate()
   val ddlStatement = readDDLFromFile("/Users/vigneshshetty/Desktop/IBM/courses/Scala EPFL/scala-project/src/main/scala/WAVE_BP.sql")
    println(s"DDL Statement: $ddlStatement")
    val schema = extractSchemaFromDDL(ddlStatement)
    println(schema)
    val dataFrame = spark.createDataFrame(spark.sparkContext.emptyRDD[Row], schema)
    dataFrame.show()
    spark.stop()
}
  def readDDLFromFile(filePath: String): String = {
    // Read the contents of the file
    val source = Source.fromFile(filePath)
    val ddlStatement = try source.mkString finally source.close()
    ddlStatement
  }
def extractSchemaFromDDL(ddl: String): StructType = {
    // Define a regular expression pattern to match each column definition
    val columnPattern = """"(.+?)"\s+[^,\s]+(?:\(\d+\))?(?=\s*(?:,|\)))""".r
    // Extract column names using the pattern, ignoring lines starting with CONSTRAINT
    val columnNames = ddl.split("\n").filterNot(_.startsWith("CONSTRAINT")).flatMap { line =>
      columnPattern.findAllMatchIn(line).map(_.group(1))
    }.toArray
    // Create StructField for each column with StringType
    val fields = columnNames.map(name => StructField(name, StringType, nullable = true))
    StructType(fields)
}


}













