import java.util.Arrays;
import java.util.Scanner;
public class StudentInfo {

    String studentName;
    int studentId;
    int studentAge;
    double studentAverageGrade;
    String studentCourse;
    String studentSentiment;

    public static void main() {

        StudentInfo myStudentObject = new StudentInfo();
        getDetails(myStudentObject);
        printDetails(myStudentObject);
    }


    static void getDetails(StudentInfo s) {
        Scanner input = new Scanner(System.in);

        System.out.println(s.printStars(10) + " Student Information " + s.printStars(10));
        System.out.println("You will be prompted to enter some details about a student.");

        System.out.print("Enter Student Name: ");
        s.studentName = input.nextLine();

        while(true) {
            System.out.print("Enter Student ID (between 1000 and 99999): ");
            try {
                int sid = Integer.parseInt(input.nextLine());
                if (sid >= 1000 && sid <= 99999) {
                    s.studentId = sid;
                    break;
                }
                else {
                    System.out.println("The number must be between 1000 and 99999.");
                }

            } catch(NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }

        while(true) {
            try {
                System.out.print("Enter Student Age: ");
                int sa = Integer.parseInt(input.nextLine());
                if (sa >= 0 && sa <= 200) { // restricting age
                    s.studentAge = sa;
                    break;
                }
                else {
                    System.out.println("The number must be between 0 and 200.");
                }
            } catch(NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }

        while(true) {
            try {
                System.out.print("Enter Student average grade: ");
                int sg = Integer.parseInt(input.nextLine());
                if (sg >= 0 && sg <= 100) { // restricting grade
                    s.studentAverageGrade = sg;
                    break;
                }
                else {
                    System.out.println("The number must be between 0 and 100.");
                }
            } catch(NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }

        System.out.print("Enter Student's Course: ");
        s.studentCourse = input.nextLine();

        System.out.print("Did the student enjoy the Course: ");
        s.studentSentiment = input.nextLine();

        System.out.println(s.printStars(40));
    }

    static void printDetails(StudentInfo s) {
        System.out.println("STUDENT DETAILS");
        System.out.println("Name: " + s.studentName);
        System.out.println("ID: " + s.studentId);
        System.out.println("Age: " + s.studentAge);
        System.out.println("Average: " + s.studentAverageGrade);
        System.out.println("Course: " + s.studentCourse);
        System.out.println("Did the student enjoy the Course: " + s.studentSentiment);

        System.out.println(s.printStars(40));

        System.out.println("Vowel Count in Name: " + s.numVowels(s.studentName));
        System.out.println("Word Count in Course Name: " + s.numWords(s.studentCourse));
        System.out.println("Reversed Name: " + s.reverseString(s.studentName));
        String above50;
        if(s.studentAverageGrade > 50) {
            above50 = "yes";
        }
        else {
            above50 = "no";
        }
        System.out.println("Is average Above 50? " + above50);

        System.out.println("Word Count in Course Name: " + s.numVowels(s.studentName)); //TODO

        String sentiment;
        String[] negative = {"n","N","no", "No", "nope", "Nope"};
        String[] positive = {"y","Y","yes","Yes","yep"};
        String s1 = s.studentSentiment;
        boolean containsNegative = false;
        for (String string : negative) {
            if (s1.equals(string)) {
                containsNegative = true;
                break;
            }
        }
        boolean containsPositive = Arrays.stream(positive).anyMatch(s.studentSentiment::equals);
        if(containsNegative) {
            sentiment = "Course isn't that enjoyable";
        }
        else if (containsPositive) {
            sentiment = "Great Course";
        }
        else {
            sentiment = "Student sentiment unclear";
        }
        System.out.println(sentiment);

        return;
    }

    private int numVowels(String str) {
        /*
        Description: This method takes a string as input and returns the count of vowels
                       (a, e, i, o, u) in the string.
        Algorithm: Iterate through the characters of the input string and
                   increment a counter for each vowel encountered.
         */

        str = str.toLowerCase(); // don't deal with two cases of each letter later
        int totalVowels = 0;

        for (int i = 0; i < str.length(); i++) {    // go over each letter and check for vowels
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                totalVowels++;
            }
        }

        return totalVowels;
    }

    private int numWords(String str) {
        /*
        Description: This method takes a string as input and returns the count of words in the string.
        Algorithm: Split the input string into words using whitespace as delimiter and
                    return the count of resulting substrings.
         */
        return -1; //you will return correct value -1 used so that code compiles
    }

    private String reverseString(String str) {
      /*
    Description: This method takes a string as input and returns a new string with the
                characters in reverse order.
    Algorithm: Iterate through the characters of the input string from end to start
                and append them to a new string.

     */

        return ""; //you will return correct value
    }

    public String printStars(int num) {
        String theStars = "";
        for(int i = 0; i<num;i++)
            theStars += "*";
        return theStars;
    }

    public String isAboveThreshold(double value, double threshold) {

         /*
    Description: This method takes 2 doubles as input and returns "Yes" or "No".
    Algorithm: Checks if the value entered is above the threshold value, returns Yes if it is
    or No if it isn't

     */

        return ""; //you will return correct value
    }

    //TODO You may add in any methods that you wish
}
