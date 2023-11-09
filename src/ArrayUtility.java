public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double average = sum/array.length;
        int averageTimesHundred = (int) (average * 100);
        return averageTimesHundred/100;
    }

    public static int minimum(int[] array) {
        int minimumValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (minimumValue > array[i]){
                minimumValue = array [i];
            }
        }
        return minimumValue;
    }

    public static int maximum(int[] array) {
        int maximumValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (maximumValue < array[i]){
                maximumValue = array [i];
            }
        }
        return maximumValue;
    }

    public static int evenCount(int[] array) {
        int noOfEven = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                noOfEven++;
            }
        }
        return noOfEven;
    }

    public static int[] reverseOne(int[] array) {
        int[] myArray;
        for (int i = array.length-1; i >= 0; i--){
            for (int n = 0; n < array.length; n++)
            myArray[n] = array[i];
        }
        return myArray;
    }

    public static void reverseTwo(int[] array) {
        int[] myArray;
        for (int i = array.length - 1; i >= 0; i--) {
            int n = 0;
            if (n < array.length) {
                myArray[n] = array[i];
                n++;
            }
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            if(array[i] == num) return true;
            }
        return false;
        }

    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++){
            array[i] = array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String arrayToString = "";
        for (int i = 0; i < array.length; i++){
            arrayToString = arrayToString + array[i];
        }
        return arrayToString;
    }

    public static boolean twoSum(int[] array, int num) {
        boolean check = false;
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array.length && n != i; n++){
                check = array[i]+array[n] == num;
            }
        }
        return check;
    }

    public static void shiftRight(int[] array) {
        array[0] = array[array.length-1];
        for (int i = 1; i < array.length; i++){
            array[i] = array[i-1];
        }
    }

    public static void shiftLeft(int[] array) {
        array[array.length-1] = array [0];
        for (int i = 0; i < array.length-1; i++){
            array[i] = array[i+1];
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++){
            shiftLeft(array);
        }
    }
}

