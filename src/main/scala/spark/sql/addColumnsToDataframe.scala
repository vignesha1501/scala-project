package spark.sql

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object addColumnsToDataframe extends App{
    val spark=SparkSession
    .builder()
    .master("local[1]")
    .appName("Add columns To Dataframe using WithColumn")
    .getOrCreate()
    val sc=spark.sparkContext
    import spark.implicits._
    val df=sc.parallelize(Seq((1,2),(3,4))).toDF("a","b")
    df.withColumn("c",lit("Null")).printSchema() // Lit is used to convert string to column
    df.withColumn("c",concat($"a",$"b")).show() 
    df.withColumn("c",concat_ws(" ",$"a",$"b")).show()
    df.withColumn("c",expr("a+1")).show()
}