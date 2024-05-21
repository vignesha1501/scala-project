package spark.sql

import org.apache.spark.sql.functions.{col,expr,column}
import org.apache.spark.sql.SparkSession

object differentWaysToSelectColumns extends App{
    val spark=SparkSession
    .builder()
    .master("local[1]")
    .appName("Different Ways to Select Columns from Dataframe")
    .getOrCreate()
    println("Spark Application Started")

    import spark.implicits._
    val data= Seq(("1","2"),("2","3"))
    val df=spark.sparkContext.parallelize(data).toDF("a","b")
    df.select("a","b").show() // 1. by passing string arguments 
    df.select($"a",'b).show() // 2. by passing column object
    df.select(col("a"),column("b")).show() // 2. by passing column object
    df.select(df.col("a"),expr("concat(b,a) c")).show() // 2. by passing column object
    df.selectExpr("a a_new","concat(a,b)") // 3. by running sql queries on dataframe 
    df.show()
}