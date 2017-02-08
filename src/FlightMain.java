import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

/**
 * Created by synerzip on 17/1/17.
 */
public class FlightMain {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner sc=new Scanner(System.in);
        String dept_loc,arrival_loc,date;
        int choiceCode;

        System.out.print("Enter Departure Location  : ");
        dept_loc=sc.nextLine().toUpperCase();
        System.out.print("Enter Arrival Location  : ");
        arrival_loc=sc.nextLine().toUpperCase();
        System.out.print("Enter Date   : ");
        date=sc.nextLine().toUpperCase();
        System.out.print("Enter Output Preference :   1. Fare \t 2. Flight Duration \nEnter Preference Choice Code : ");
        choiceCode=sc.nextInt();

        FlightController fc=new FlightController();

        File dir = new File("/home/synerzip/Projects/AIR Flight Management System/AFMByUsing_Map/AirFlightManagementSystem/src/FlightInformation");
        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            for (File f : fileList) {
                fc.searchFlight(f.getAbsolutePath(),dept_loc,arrival_loc,date,choiceCode);
            }
        }
    fc.updateView();
    }

}
