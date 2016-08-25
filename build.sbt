name := "SparkKafkaStream2"

version := "1.0"

scalaVersion := "2.11.8"
val sparkVersion = "2.0.0"


lazy val commonSettings = Seq(
  organization := "com.test",
  version := "1.0",
  scalaVersion := "2.11.8"

)

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-streaming_2.11" % sparkVersion,
  "org.apache.spark" % "spark-streaming-kafka-0-8_2.11" % sparkVersion
)