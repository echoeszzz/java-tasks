package task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class DataComparison {

    private static Map<TimeUnit, Long> computeDiff(Date date1, Date date2) {

        long diffInMillies = date2.getTime() - date1.getTime();

        //create the list
        List<TimeUnit> units = new ArrayList<TimeUnit>(EnumSet.allOf(TimeUnit.class));
        Collections.reverse(units);

        //create the result map of TimeUnit and difference
        Map<TimeUnit, Long> result = new LinkedHashMap<>();
        long milliesRest = diffInMillies;

        for (TimeUnit unit : units) {

            //calculate difference in millisecond
            long diff = unit.convert(milliesRest, TimeUnit.MILLISECONDS);
            long diffInMilliesForUnit = unit.toMillis(diff);
            milliesRest = milliesRest - diffInMilliesForUnit;

            //put the result in the map
            result.put(unit, diff);
        }

        return result;
    }

    public static void main(String[] args) throws ParseException {
        try {
            System.out.println("Enter data as format dd-mm-yyyy");
            Scanner scanner = new Scanner(System.in);
            String date = scanner.nextLine();
            Date userDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            var diff = computeDiff(userDate, new Date());
            for (var key : diff.keySet()) {
                System.out.println(key + ":" + diff.get(key));
            }
        } catch (ParseException e) {
            System.out.println("Format is dd-mm-yyyy\nTry again.");
            System.exit(-1);
        }
    }
}
