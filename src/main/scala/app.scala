import org.apache.spark.sql.{SparkSession, DataFrame}
import org.apache.spark.sql.types._
object app extends App{
    val spark= SparkSession.builder()
    .appName("Vignesh Spark App")
    .master("local[*]")
    .getOrCreate()

    val df = spark.range(10).toDF("no")
    df.show()
    println("hello")    
    val a="dddsdssd"
    print(a.toUpperCase())




    spark.stop()
}
