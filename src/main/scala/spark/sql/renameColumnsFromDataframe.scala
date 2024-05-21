package spark.sql

import org.apache.spark.sql.functions.{col,column,expr}
import org.apache.spark.sql.SparkSession
object renameColumnsFromDataframe extends App{
    val spark=SparkSession
    .builder()
    .master("local[1]")
    .appName("Rename Columns from dataframe")
    .getOrCreate()
    import spark.implicits._
    val data:Seq[(Int,Int)]=Seq((1,2),(2,3))
    val df=spark.sparkContext.parallelize(data).toDF("a","b")
    df.withColumnRenamed("a","a_new").show() // Columns can be renamed using withColumnRenamed function, also we can't pass column objects, we should only pass string names
}