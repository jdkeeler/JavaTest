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
        Question_TwoSum(twoSumArray, targetValue);


        //OUTPUT THE NUMBERS
        System.out.println("\n\n-----QUESTION_COLLECTIONS-----\n\n");
        System.out.println(Question_Collections());

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


}