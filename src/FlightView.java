import java.util.ArrayList;
import java.util.Map;

/**
 * Created by synerzip on 17/1/17.
 */
public class FlightView {

    public void viewFlights(Map<Integer, Flight> flightmap) {
        System.out.println("\n \t\t ***** FLIGHT INFORMATION *****");
        System.out.println("FLIGHT_NO|DEP_LOC|ARR_LOC|VALID_TILL| FARE  |FLIGHT_DURN|\n");
        for(Map.Entry<Integer, Flight> entry:flightmap.entrySet()){
            Flight b=entry.getValue();
            System.out.println(b.getFlightNum()+"\t |"+b.getDepartLoc()+"\t | "+b.getArrivalLoc()+"\t |"+b.getDate()+"| "+b.getFare()+"\t| "+b.getDuration()+"\t\t|");
        }
        if(flightmap.isEmpty())
        {
            System.out.println("Flights Not Available.");
        }

    }
}
