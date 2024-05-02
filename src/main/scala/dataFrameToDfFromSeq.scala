import org.apache.spark.sql.{SparkSession, Row}
import scala.collection.immutable.Seq
object dataFrameToDfFromSeq extends App{
    val spark=SparkSession
    .builder()
    .config("spark.master","local")
    .appName("Spark Sql Dataframe from ToDf function")
    .getOrCreate()  

    val sc=spark.sparkContext
    import spark.implicits._
    val cols:Seq[String] = Seq("Column1", "Column 2")
    println(cols)
    val values= Seq((1,"A2"),(2,"B2"))
    val rdd=sc.parallelize(values)
    val df=rdd.toDF("Col1","Col2")
    df.show()
    
    
}
