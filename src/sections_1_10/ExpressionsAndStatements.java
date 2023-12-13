package sections_1_10;

public class ExpressionsAndStatements {
    public static void main(String[] args) {

        //printYearsAndDays(561600);
        //System.out.println(hasTeen(9, 99, 29));
        //System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        //System.out.println(isLeapYear(2100));
        //System.out.println(shouldWakeUp(true, 24));
        //printMegaBytesAndKiloBytes(5000);
        //printConversion(-5.6);
        //checkNumber(-11);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        }
        return false;
    }
    public static void printEqual(int a, int b, int c) {
        if (a >= 0 && b >= 0 && c >= 0) {
            if (a == b && b == c) {
                System.out.println("All numbers are equal");
            } else if (a != b && a != c && b != c) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
    public static void printYearsAndDays(long minutes) {

        if (minutes >= 0) {
            int years = (int) minutes / 60 / 24 / 365;
            int days = (int) ((minutes - years * 60 * 24 * 365) / 60 / 24);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
    public static double area(double radius) {
        if (radius >= 0) {
            return Math.PI * Math.pow(radius, 2);
        }
        return -1.0;
    }
    public static double area(double x, double y) {
        if (x >= 0 && y >= 0) {
            return x * y;
        }
        return -1.0;
    }
    public static boolean isTeen(int a) {
        return (a >= 13 && a <= 19);
    }
    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
    }
    public static boolean hasEqualSum(int a, int b, int c) {
        return a + b == c;
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        //System.out.println(Math.round((int)(a * 1000)));
        //System.out.println(Math.round((int)(b * 1000)));
        return Math.round((int)(a * 1000)) == Math.round((int)(b * 1000));
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else return true;
            }
        }
        return false;
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23)) {
                return true;
            }
        }
        return false;
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour) {

        long milesPerHour;
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
        }
        return milesPerHour;
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
    public static void checkNumber(int number) {
        String result = "";
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else if (number == 0) {
            result = "zero";
        }
        System.out.println(result);
    }
}
