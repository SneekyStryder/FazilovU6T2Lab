public class ArrayAlgorithms {

    /** Returns the average of all values in numList as a double.
     *
     *  PRECONDITION: numList.length > 0
     */
    public static double average(int[] numList) {
        double sum = 0;
        for (int i = 0; i < numList.length; i++) {
            sum += numList[i];
        }
        return sum / numList.length;
    }

    /** Returns the value in numList that represents the minimum
     * value in numList.
     *
     *  PRECONDITION: numList.length > 0
     */
    public static int minimum(int[] numList) {
        int minimum = 100;
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] < minimum) {
                minimum = numList[i];
            }
        }
        return minimum;
    }

    /** Returns the number of Strings in strList that contain the target.
     *
     *  PRECONDITION: strList.length > 0
     */
    public static int howManyContain(String[] strList, String target) {
        int counter = 0;
        for (int i = 0; i < strList.length; i++) {
            if (strList[i].contains(target)) {
                counter++;
            }
        }
        return counter;
    }

    /** Prints each String in wordList, on its own line, in reverse order.
     *
     *  PRECONDITION: wordList.length > 0
     */
    public static void reversePrint(String[] wordList) {
        for (int i = wordList.length - 1; i >= 0; i--) {
            System.out.println(wordList[i]);
        }
    }

    /** Returns an array containing all characters in myStr, in order.
     *
     *  PRECONDITION: myStr.length() > 0
     */
    public static String[] stringToArray(String myStr) {
        String[] chars = new String[myStr.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = myStr.substring(i, i + 1);
        }
        return chars;
    }

    /**  This method checks each Person in the people array, and if they
     *  are an adult (at least 18 years old), they introduce themselves
     *  (i.e. by calling the introduce() method)
     *
     *  PRECONDITION: people.length > 0
     */
    public static void introduceAdults(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() >= 18) {
                people[i].introduce();
            }
        }
    }

    /** Returns a new array containing all elements from arr1 combined with
     *  all elements from arr2; arr1's elements should be followed by
     *  arr2's elements
     *
     *  PRECONDITION: arr1.length > 0, arr2.length > 0
     */

    public static int[] combine(int[] arr1, int[] arr2) {
        int[] completeArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            completeArray[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < completeArray.length; i++) {
            completeArray[i] = arr2[j];
            j++;
        }
        return completeArray;
    }

    /** Multiplies each number in numList by multiplier.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void multiplyBy(int[] numList, int multiplier) {
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * multiplier;
        }
    }

    /** Switches each boolean value in boolList to its opposite value;
     *  a true value becomes false, and false values become true.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: boolList.length > 0
     */
    public static void flipBool(boolean[] boolList) {
        for (int i = 0; i < boolList.length; i++) {
            if (boolList[i] == true) {
                boolList[i] = false;
            }
            else if (boolList[i] == false) {
                boolList[i] = true;
            }
        }
    }

    /** Adds a "!" to the end of each String in wordList.  However, if a
     *  a string already ends in an exclamation point, do NOT add another.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: wordList.length > 0
     */
    public static void addExclamation(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            if (!(wordList[i].substring(wordList[i].length() - 1).equals("!"))) {
                wordList[i] += "!";
            }
        }
    }

    /** Shifts all elements in numList to the LEFT one index;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The first element in the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {1, 3, 4, 7, 6, 5} (all elements shifted left one
     *  with the last element wrapping around to the back)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftLeft(int[] numList) {
        int firstElement = numList[0];
        for (int i = 1; i < numList.length; i++) {
            numList[i - 1] = numList[i];
        }
        numList[numList.length - 1] = firstElement;
    }

    /** Shifts all elements in numList to the RIGHT one index;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The last element in the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {6, 5, 1, 3, 4, 7} (all elements shifted right one
     *  with the last element wrapping around to the front)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftRight(int[] numList) {
        int lastElement = numList[numList.length - 1];
        for (int i = numList.length - 1; i > 0; i--) {
            numList[i] = numList[i - 1];
        }
        numList[0] = lastElement;
    }

    /** Reverses all elements in an array; this method modifies
     *  the original array and does not return anything (void).
     *
     *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
     *  modifies the array to {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */ /*
    public static void reverse(int[] numList) {
        int[] randomArray = new int[numList.length];

        for (int i = 0; i < numList.length; i++) {
            randomArray[i] = numList[i];
        }

        for (int i = 0; i < numList.length; i++) {
            int idx = numList.length - i - 1;
            numList[idx] = randomArray[i];
        }

    }
    */

    public static void reverse(int[] numList) {
        for (int i = 0; i < numList.length / 2; i++) {
            int tempVal = numList[i];
            int idx = numList.length - i - 1;
            numList[i] = numList[idx];
            numList[idx] = tempVal;
        }
    }


}
