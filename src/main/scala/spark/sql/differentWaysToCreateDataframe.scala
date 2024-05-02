package spark.sql

import org.apache.spark.sql.{SparkSession, Row}
import scala.collection.immutable.Seq
object differentWaysToCreateDataframe extends App{
    val spark = SparkSession
    .builder()
    .master("local[1]")
    .appName("differentWaysToCreateDataframe")
    .getOrCreate()
    val sc=spark.sparkContext
    import spark.implicits._
    
    // 1. Spark Create DataFrame from RDD
    val dataRdd:Seq[(Int,Int)]=Seq((1,1),(2,2),(3,3))
    val rdd=sc.parallelize(dataRdd)
        // 1.1 Using toDF()
            val dfUsingDF=rdd.toDF("Number","Sum")
            dfUsingDF.show()
            dfUsingDF.printSchema()
    
}