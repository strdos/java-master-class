package sections_1_10;

import java.util.Scanner;

public class ExpressionsAndStatements {
    public static void main(String[] args) {

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area > 0 && areaPerBucket > 0) {

            double diff = area / areaPerBucket;
            return (int) (diff % 1 == 0 ? diff : diff + 1);
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width > 0 && height > 0 && areaPerBucket > 0) {

            double diff = width * height / areaPerBucket;
            return (int) (diff % 1 == 0 ? diff : diff + 1);
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {

            double diff = width * height / areaPerBucket - extraBuckets;
            return (int) (diff % 1 == 0 ? diff : diff + 1);
        }
        return -1;
    }

    public static void inputThenPrintSumAndAverage() {

        int sum = 0, count = 0, input = 0;
        long avg = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter an integer number: ");
                input = scanner.nextInt();
                sum += input;
                count++;
            } catch (Exception e) {
                if (count > 0) {
                    avg = Math.round((double)sum / count);
                }
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

    public static void printSquareStar(int number) {
        if (number >= 5) {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if ((i == 0) || (i == number - 1) || (j == 0) || (j == number - 1) || (i == j) || (i == number - 1 - j)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int getLargestPrime(int number) {

        if (number > 1) {
            int originalNumber = number;
            int result = originalNumber;
            for (int i = 2; i <= originalNumber / 2; i++) {
                if (number % i == 0) {
                    result = i;
                    while (number % i == 0) {
                        number /= i;
                    }
                }
            }
            return result;
        }
        return -1;
    }

    public static int getLargestPrimeMyVersion(int number) {
        if (number >= 1) {
            for (int i = number / 2; i > 1; i--) {
                if (number % i == 0) {
                    if (getLargestPrime(i) == -1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0) || (goal > bigCount * 5 + smallCount)) {
            return false;
        }
        if (goal / 5 <= bigCount) {
            if (goal % 5 <= smallCount) {
                return true;
            }
        } else if ((goal / 5 - bigCount) * 5 + (goal % 5) <= smallCount) {
            return true;
        }
        return false;
    }

    public static void numberToWords(int number) {

        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        if (number > 0) {
            int reversedNumber = reverse(number);
            int trailingZeros = getDigitCount(number) - getDigitCount(reversedNumber);
            while (reversedNumber > 0) {
                switch (reversedNumber % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber /= 10;
            }

            for (int i = 0; i < trailingZeros; i++) {
                System.out.println("Zero");
            }
            return;
        }
        System.out.println("Invalid Value");
    }

    public static int reverse(int number) {
        int reverse = 0;
        boolean negativeNumber = false;
        if (number < 0) {
            number *= -1;
            negativeNumber = true;
        }
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return negativeNumber ? reverse * -1 : reverse;
    }

    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        }
        if (number > 0) {
            int count = 0;
            while (number > 0) {
                count++;
                number /= 10;
            }
            return count;
        }
        return -1;
    }

    public static boolean isPerfectNumber(int number) {
        if (number >= 1) {
            int sumOfDivisors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }
            return sumOfDivisors == number;
        }
        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first >= 10 && second >= 10) {
            int greatestCommonDivisor = 0;
            int smallerNumber = Math.min(first, second);

            for (int i = 1; i <= smallerNumber; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    greatestCommonDivisor = i;
                }
            }
            return greatestCommonDivisor;
        }
        return -1;
    }

    public static void printFactors(int number) {
        if (number >= 1) {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
            System.out.println(number);
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
        }
        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            return (a / 10 == b / 10) ||
                    (a % 10 == b / 10) ||
                    (a / 10 == b % 10) ||
                    (a % 10 == b % 10);
        }
        return false;
    }

    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int sum = 0;
            while (number > 0) {
                if (number % 2 == 0) {
                    sum += number % 10;
                }
                number /= 10;
            }
            return sum;
        }
        return -1;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int sum = number % 10;
            while (number > 0) {
                if (number < 10) {
                    sum += number;
                }
                number /= 10;
            }
            return sum;
        }
        return -1;
    }

    public static int sumFirstAndLastDigitMyVersion(int number) {
        if (number >= 0) {
            int sum = number % 10;
            number /= 10;
            while (number > 10) {
                number /= 10;
            }
            sum += number;
            return sum;
        }
        return -1;
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }
        int initial = number;
        int reverse = 0;

        while (number > 0) {
            reverse = (int) (reverse * 10 + number % 10);
            number /= 10;
        }
        return initial == reverse;
    }

    public static boolean isOdd(int number) {

        if (number > 0) {
            if (number % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;
                case 4, 6, 9, 11:
                    return 30;
                case 2:
                    return isLeapYear(year) ? 29 : 28;
            }
        }
        return -1;
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
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
        return Math.round((int) (a * 1000)) == Math.round((int) (b * 1000));
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
