import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentInfo {

    String studentName = "Unknown";
    int studentId = 0;
    int studentAge = 0;
    double studentAverageGrade = 0.0;
    String studentCourse = "";
    String studentSentiment = "";

    public static void main(String[] args) {

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
                if (sid > 1000 && sid < 99999) {
                    s.studentId = sid;
                    break;
                }
                else {
                    System.out.println("The number must be between 1000 and 99999");
                }

            } catch(NumberFormatException e) {
                System.out.println("Please enter a number.");
            }

        }

        System.out.print("Enter Student Age: ");
        s.studentAge = Integer.parseInt(input.nextLine());

        System.out.print("Enter Student average grade: ");
        s.studentAverageGrade = Double.parseDouble(input.nextLine());

        System.out.print("Enter Student's Course: ");
        s.studentCourse = input.nextLine();

        System.out.print("Did the student enjoy the Course: ");
        s.studentSentiment = input.nextLine();

        System.out.println(s.printStars(40));

        return;
    }

    static void printDetails(StudentInfo s) {
        System.out.println("STUDENT DETAILS");
        System.out.println("Name: " + s.studentName);
        System.out.println("ID: " + s.studentId);
        System.out.println("Age: " + s.studentAge);
        System.out.println("Average: " + s.studentAverageGrade);
        System.out.println("Course: " + s.studentCourse);

        System.out.println(s.printStars(40));
        System.out.println("Vowel Count in Name: " + s.numVowels(s.studentName));
        return;
    }

    private int numVowels(String str) {
        /*
        Description: This method takes a string as input and returns the count of vowels
                       (a, e, i, o, u) in the string.
        Algorithm: Iterate through the characters of the input string and
                   increment a counter for each vowel encountered.
         */
        return -1; //you will return correct value -1 used so that code compiles
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
