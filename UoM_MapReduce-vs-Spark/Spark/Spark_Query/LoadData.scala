val df = spark.read.format("csv").option("inferSchema", "true").option("header","true").load("s3://wishluck/Data/Spark/DelayedFlights-updated.csv")
df.createOrReplaceTempView("delayedFlights");
