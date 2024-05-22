package spark.sql
import org.apache.spark.sql.{SparkSession}
import org.apache.spark.sql.functions.{col,column,expr}
object changeDataTypeOfColumnsUsingCast extends App{
    val spark=SparkSession
    .builder()
    .master("local[1]")
    .appName("Change Column Data type using Cast")
    .getOrCreate()
    import spark.implicits._
    val df=spark.sparkContext.parallelize(Seq((1,2),(3,4))).toDF("a","b")
    // print(df.columns.toSeq.foreach(println)) // prints the list of column names in a dataframe
    df.printSchema()
    val df_new=df.select('a.cast("long")) // Changed column's data type from Int to Long, also argument can be only strings 
    val df_new_expr=df.selectExpr("cast(a as long)","concat(a,b) c") // Using SelectExpr Changed column's data type from Int to Long, also argument can be only strings 
    df_new.printSchema()
    df_new_expr.printSchema()
    df.show(10)
    // println(df.columns.size) // prints the total number of columns in dataframe

}