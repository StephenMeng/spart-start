import org.apache.spark.SparkContext

object helloworld {
  def main(args: Array[String]): Unit = {
    var sc=SparkContext.getOrCreate( );
    var file =sc.textFile("C:\\Users\\DELL\\Desktop\\spark.txt");
    var filterRDD=file.filter(_.contains("hello"));
    filterRDD.cache();
    filterRDD.count();

  }
}
