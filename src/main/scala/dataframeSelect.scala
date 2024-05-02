import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Row
object dataframeSelect extends App {
  val spark = SparkSession
    .builder()
    .config("spark.master","local")
    .appName("Vignesh Spark Applicaion")
    .getOrCreate()
  val sc=spark.sparkContext
  println("***********spark")   
  import spark.implicits._
  //Create Spark Dataframe from an exisitng RDD
// Scala Seq is a trait to represent immutable sequences. This structure provides index based access and various utility methods to find elements, their occurences and subsequences. A Seq maintains the insertion order. 
  val data=Seq(("a",1),("b",2),("c",3))
  print(data)
  val rdd=sc.parallelize(data)
  print(rdd)
  val df=rdd.toDF("Language","User Count")
  df.printSchema()  
  df.show()

  val rddCreateDf=sc.parallelize(
    Seq(
        ("a",Array(1,2,3)),
        ("b",Array(4,5,6))
        )
  )  
  val dfCreateDf=spark.createDataFrame(rddCreateDf)
    dfCreateDf.show(10)
    
}
