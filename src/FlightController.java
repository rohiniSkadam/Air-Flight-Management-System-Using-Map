import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by synerzip on 17/1/17.
 */

public class FlightController {
    private ArrayList<String> arr;
    private FlightView fview =new FlightView();
    private Map<Integer,Flight> flightMap=new TreeMap<>();

    public void searchFlight(String filename,String dept_loc,String arrival_loc,String date,int choiceCode) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()) {
            String line = sc.nextLine().toUpperCase().toString();
            if (!line.isEmpty()) {
                StringTokenizer token = new StringTokenizer(line, "|");
                arr = new ArrayList<>(line.length());
                while (token.hasMoreTokens()) {
                    arr.add(token.nextToken());
                }
                if (arr.get(1).equals(dept_loc) && arr.get(2).equals(arrival_loc)&& arr.get(3).equals(date))
                {
                    Flight model = new Flight(arr.get(0), arr.get(1), arr.get(2), arr.get(3), Integer.parseInt(arr.get(4)), Float.parseFloat(arr.get(5)));
                    if (choiceCode == 1)
                        flightMap.put(Integer.parseInt(arr.get(4)), model);
                    else if (choiceCode == 2)
                        flightMap.put((int) Float.parseFloat(arr.get(5)), model);
                    else
                        System.out.println("Wrong Choice.");
                }
            }
        }
    }
    public void updateView()
    {
        fview.viewFlights(flightMap);
    }
}