public class Questions {
    public static void main(String[] args) {

        //Complete all problems below.
        //Once done run all problems from here
        //Do NOT modify values below
        final int[] duplicatesArray = {1, 5, 3, 2, 6, 8, 9, 10, 1, 5, 8, 9, 3, 10, 45, 32, 16, 14, 3, 5, 9};
        System.out.println("\n\n-----QUESTION_FINDDUPLICATES-----\n\n");
        System.out.println(Question_FindDuplicates(duplicatesArray));

        //Do NOT modify values below
        final int[] twoSumArray = {1, 5, 2, 0, 4, 11, 9, 6, 12, 7};
        final int targetValue = 9;
        //OUTPUT TWO INDICES
        System.out.println("\n\n-----QUESTION_TWOSUM-----\n\n");
        System.out.println(Question_TwoSum(twoSumArray, targetValue));


        //OUTPUT THE NUMBERS
        System.out.println("\n\n-----QUESTION_COLLECTIONS-----\n\n");
        System.out.println(Question_Collections());


        //OUTPUT THE SECTIONS
        final String[] grid = {
                "1,1,r", "1,2,r", "1,3,b", "1,4,r",
                "2,1,b", "2,2,r", "2,3,b", "2,4,b",
                "3,1,b", "3,2,b", "3,3,r", "3,4,r",
                "4,1,r", "4,2,b", "4,3,b", "4,4,r"
        };
        final String color = "r";
        System.out.println("\n\n-----QUESTION_GERRYMANDER-----\n\n");
        System.out.println(Question_Gerrymander(grid, color));
    }

    //Instructions:
    //  Given an array of integers, return all numbers appearing more than once as an string with
    //  one number on every line.  Only include duplicate numbers one time.  A sample input array
    //  is provided, but your code should perform for an array of any number of integers.
    public static String Question_FindDuplicates(int[] inputArray) {

        //YOUR CODE HERE

    }

    //Instructions:
    //  Given an array of integers, return a string of the indexes of two numbers that add up to the
    //  provided target, one index per line.  Return only ONE solution.  You may not use the same
    //  index twice.  A sample array is provided, but code should perform for any array of any
    //  number of integers.
    public static String Question_TwoSum(final int[] inputArray, int targetValue) {


        //YOUR CODE HERE

    }

    //Instructions:
    //  Generate 100 random numbers in the range of [1 - 1000], inclusive.
    //  Then put the numbers into a Map
    //  Move all the numbers into a Set, from the Map
    //  Move the numbers into a List, from the Set
    //  Sort the numbers and then return them as a string with one number on every line
    public static String Question_Collections() {

        //YOUR CODE HERE


    }

    //Instructions:
    //  Given an array of strings representing an NxN grid of red and blue squares and a desired
    //  color "r" or "b", create N contiguous sections of N squares each.  The sections should
    //  be divided in such a way the maximum number of sections where more than half of squares
    //  are the desired color is achieved.
    //  Return the sections as an array of arrays of strings representing the squares in each section.
    //
    //  For example, in a 3x3 square, given:
    //
    //  String[]{
    //    "1,1,r", "1,2,r", "1,3,r",
    //    "2,1,b", "2,2,b", "2,3,b",
    //    "3,1,b", "3,2,b", "3,3,b"
    //  }
    //  and a target color of "b"
    //
    //  The expected return would be
    //
    //  String[][]{
    //    String[] {"1,1", "2,1", "3,1"},
    //    String[] {"1,2", "2,2", "3,2"},
    //    String[] {"1,3", "2,3", "3,3"}
    //  }
    public static String[][] Question_Gerrymander(String[] grid, String color) {

        //YOUR CODE HERE


    }

}