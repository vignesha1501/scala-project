package spark.sql

import org.apache.spark.sql.{SparkSession, Row}
import org.apache.spark.sql.types.{StructType, StructField, StringType}
import scala.collection.immutable.Seq
import org.apache.spark.sql.types.IntegerType
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
        // 1.2 Using Spark createDataFrame() from SparkSession
            val cols:Seq[String]=Seq("Number","Sum")
            val dfUsinfCreateDF=spark.createDataFrame(rdd).toDF(cols:_*)
            // _* is a syntax to pass a variable number of arguments
            dfUsinfCreateDF.show()
            dfUsinfCreateDF.printSchema()
        // 1.3 Using createDataFrame() with the Row type
            val schema= StructType(
                Seq(
                    StructField("Number",IntegerType,true),
                    StructField("Sum",IntegerType,true)
                )
            )
            val rowRdd=rdd.map(elem=>Row(elem._1,elem._2))
            val dfUsingCreateDfRow=spark.createDataFrame(rowRdd,schema)
            dfUsingCreateDfRow.show()
            dfUsingCreateDfRow.printSchema()
    // 2. Create Spark DataFrame from List and Seq Collection

}