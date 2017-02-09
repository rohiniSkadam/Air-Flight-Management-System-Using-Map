Instructions : Make any necessary assumption, and clearly state the assumptions made.

Expectations : Write the compiling code using your choice of IDE.

Problem Statement :-

Problem : Implement a standalone flight search engine that lists matching flights for a traveler who is looking to fly between 2 locations on a given date. The input locations should be in 3-letter location code format as present in the airlines flight data.

Specifications : 

You are given 3 CSV files, each containing the available flights data for British Airways, Lufthansa Airlines and Air France respectively. Each file contains the following fields:

1) FLIGHT_NUM - Unique flight number, starting with 2-letter airline code.

2) DEP_LOC - Departure location code of the flight.

3) ARR_LOC - Arrival location code of the flight.

4) VALID_TILL - Date (DD-MM-YYYY) till which each flight is available. It means that this flight would fly once every day till this date.

5) FLIGHT_TIME - Local time (HHmm) at which the flight departs from the departure location.

6) FLIGHT_DURN - Flight duration (HH.mm) from departure location to the arrival location.

FARE - This is the fare of the flight per person in $ (US Dollars).

Assumptions and Constraints : 

Following assumptions and constraints apply:

1. The engine should accept 4 input parameters: Departure Location, Arrival Location, Flight Date, Output

2. Preference. “Output Preference” is a String suggesting whether the flight results should be sorted only by fare, or by both fare and flight duration.

3. The engine should then search for the flights in all 3 CSV files, and list the aggregate results on standard output, sorted by Fare and Flight Duration, depending on “Output Preference”.

4. The engine should be written considering that there could be more CSV files in future, and each CSV file might contain more data than present.

5. If the Departure location or/and Arrival location is not present in any of the CSV files, then engine should return a user friendly error. 

6. If there are no flights available for the user entered input parameters, then engine should return a different user friendly error.

Input data : 

The following PIPE delimited sample data is given to you. You are allowed to extend on this data and create heavier input files.

AIR FRANCE

FLIGHT_NUM|DEP_LOC|ARR_LOC|

AF299|FRA|LHR|20-11-2010|0600|

AF118|DUB|MUC|21-12-2010|1410|

AF371|AMS|MAD|30-11-2010|1210|

AF453|BOS|CDG|20-11-2010|1350|

AF544|BOM|LHR|10-12-2010|1150|

AF271|AMS|MAD|27-10-2010|1100|

AF249|JFK|LHR|01-12-2010|1550|

LUFTHANSA AIRLINES

FLIGHT_NUM|DEP_LOC|ARR_LOC|

LH348|DEL|AMS|30-11-2010|2325|

LH201|LHR|MEL|21-11-2010|0230|

LH342|VIE|JFK|20-10-2010|1130|

LH451|LHR|PEK|30-11-2010|1130|

LH119|FRA|CDG|06-12-2010|1220|

LH929|FRA|LHR|10-12-2010|0100|

LH801|DUB|MUC|11-12-2010|1710|

BRITISH AIRWAYS

FLIGHT_NUM|DEP_LOC|ARR_LOC|

BA123|DEL|AMS|12-10-2010|0050|

BA412|BOS|CDG|31-12-2010|0210|

BA413|BOS|AMS|30-11-2010|1530|

BA111|LHR|PEK|30-10-2010|2340|

BA765|LHR|BOM|31-12-2010|1420|

BA322|CDG|NRT|15-11-2010|0010|

BA438|DEL|AMS|30-11-2010|1325|

BA102|LHR|MEL|01-12-2010|0330|

BA234|VIE|JFK|20-10-2010|1230|

Evaluation criteria : 

* Code Completeness/ Correctness

* Code Structure and quality: Modularity, usage of OO principles, size of classes/functions,

* Choice of data structures

* class/function/variable names, package/class structure
