public class StudentInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentInfo myStudentObject = new StudentInfo();
        System.out.println(myStudentObject.printStars(10) + " Student Information " + myStudentObject.printStars(10));
        System.out.println("You will be prompted to enter some details about a student.");

        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();
        //TODO Enter code to ask user for student details as per example above and store responses

        System.out.println(myStudentObject.printStars(40));

        //TODO print out the student details

        System.out.println(myStudentObject.printStars(40));
        System.out.println("Vowel Count in Name: " + myStudentObject.numVowels(studentName));
        //TODO Call appropriate methods and print information as per the example above
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
