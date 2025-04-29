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
        double sum = sum(array);
        double length = array.length;
        double result = sum/length;
        return Math.floor(result * 100.0) / 100.0;
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
        int length = array.length;
        int myArray[] = new int[length];
        int index = 0;
        for (int i = length-1; i >= 0; i--)
        {
            myArray[index] = array[i];
            index++;
        }
        return myArray;
    }

    public static void reverseTwo(int[] array) {
        int replaceValue = array.length-1;
        for (int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i]=array[replaceValue-i];
            array[replaceValue-i]=temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            if(array[i] == num) return true;
            }
        return false;
        }


    public static boolean linearSearchString(String[] array, String str) {
        for (String word : array) {
            if (word.equals(str)) return true;
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
            arrayToString += array[i];
                if (i!=array.length-1) arrayToString += ", ";
            }
        return arrayToString;
        }


    public static boolean twoSum(int[] array, int num) {
        for (int checkNumber=0; checkNumber<array.length; checkNumber++) {
            for (int i=checkNumber+1; i<array.length; i++) {
                if (array[checkNumber]+array[i]==num) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {

        int end = array[array.length-1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = end;

    }

    public static void shiftLeft(int[] array) {
        int start = array[0];
        for (int i = 0; i<array.length-1; i++)
        {
            array[i] = array[i+1];
        }
        array[array.length-1] = start;

    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++)
        {
            shiftRight(array);
        }

    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++){
            shiftLeft(array);
        }
    }
}

