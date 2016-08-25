
/**
  * Created by sunilpatil on 8/25/16.
  */
object HelloSparkKafkaStreaming {

  def main(argv:Array[String]): Unit ={
    val conf = new SparkConf().setMaster("local[*]").setAppName("KafkaReceiver")
    val ssc = new StreamingContext(conf, Seconds(5))

    val kafkaStream1 = KafkaUtils.createStream(ssc, "localhost:2181", "spark-streaming-consumer-group", Map("t1" -> 5))
    //val kafkaStream2 = KafkaUtils.createStream(ssc, "localhost:2181", "spark-streaming-consumer-group", Map("topic2" -> 5))

    //kafkaStream.fla
    kafkaStream1.print()
    ssc.start()
    ssc.awaitTermination()	  }

}
