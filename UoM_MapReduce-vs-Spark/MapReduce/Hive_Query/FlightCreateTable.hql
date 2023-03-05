CREATE EXTERNAL TABLE delayedFlights (
    Id int,
    Year int,
    Month int,
    DayofMonth int,
    DayOfWeek int,
    DepTime int,
    CRSDepTime int,
    ArrTime int,
    CRSArrTime int,
    UniqueCarrier string,
    FlightNum int,
    TailNum string,
    ActualElapsedTime int,
    CRSElapsedTime int,
    AirTime int,
    ArrDelay int,
    DepDelay int,
    Origin string,
    Dest string,
    Distance int,
    TaxiIn int,
    TaxiOut int,
    Cancelled int,
    CancellationCode string,
    Diverted int,
    CarrierDelay int,
    WeatherDelay int,
    NASDelay int,
    SecurityDelay int,
    LateAircraftDelay int)
row format delimited fields terminated by ","
LOCATION 's3://wishluck/hive/tables/delayedFlights';


-- load data from s3 to table
LOAD DATA INPATH 's3://wishluck/Data/DelayedFlights-updated.csv' OVERWRITE INTO TABLE delayedFlights;

describe formatted delayedFlights;