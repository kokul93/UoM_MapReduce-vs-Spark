var i = 0;
for( i <- 1 to i){
    println( " Query 1 Iteration : " + i );
    spark.time(spark.sql("SELECT Year, avg((CarrierDelay /ArrDelay)*100) from delayedFlights WHERE Year>=2003 AND Year<=2010 GROUP BY Year ORDER BY Year").show());    
}
i=0;
for( i <- 1 to 5){
    println( " Query 2 Iteration : " + i );
    spark.time(spark.sql("SELECT Year, avg((NASDelay /ArrDelay)*100) from delay_flights WHERE Year>=2003 AND Year<=2010 GROUP BY Year ORDER BY Year").show())   
}
i=0;
for( i <- 1 to 5){
    println( " Query 3 Iteration : " + i );
    spark.time(spark.sql("SELECT Year, avg((WeatherDelay /ArrDelay)*100) from delay_flights WHERE Year>=2003 AND Year<=2010 GROUP BY Year ORDER BY Year").show())   
}

i=0;
for( i <- 1 to 5){
    println( " Query 4 Iteration : " + i );
    spark.time(spark.sql("SELECT Year, avg((LateAircraftDelay /ArrDelay)*100) from delay_flights WHERE Year>=2003 AND Year<=2010 GROUP BY Year ORDER BY Year").show())   
}

i=0;
for( i <- 1 to 5){
    println( " Query 4 Iteration : " + i );
    spark.time(spark.sql("SELECT Year, avg((SecurityDelay /ArrDelay)*100) from delay_flights WHERE Year>=2003 AND Year<=2010 GROUP BY Year ORDER BY Year").show())
}