import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("scala-spark")
      .master("local[*]")
      .config("spark.driver.bindAddress","127.0.0.1")
      .getOrCreate()

    val df = spark.read
      .option("header", value=true)
      .csv("data/AAPL.csv")

    df.show()
  }
}