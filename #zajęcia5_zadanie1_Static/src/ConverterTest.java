/**
 * Created by krzychol99 on 2017-01-12.
 */
public class ConverterTest {
    public static void main(String[] args) {
        CalendarConverter converter = new CalendarConverter();

        for (int i = 1; i<8; i++){
            String descriptionDay = " dzień tygodnia to: ";

            System.out.println(i + descriptionDay);
            converter.convertDayToString(i);
        }
    }
}
