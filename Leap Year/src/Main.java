import java.io.*;

class LeapYear {

    public static void isLeapYear(int year) {
        boolean is_leap_year = false;

        if (year % 4 == 0) {
            is_leap_year = true;

            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        } else {
            is_leap_year = false;
        }

        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a year: ");
            String inputYear = reader.readLine();
            int year = Integer.parseInt(inputYear);
            isLeapYear(year);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid year.");
        }
    }
}
