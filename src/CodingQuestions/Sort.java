import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Sort {
    static int[] largeSmall(Integer[] array) {
        int largest = 0;
        int smallest = array[0];
        for (int a : array) {
            if (a > largest) {
                largest = a;
            }
            if (a < smallest) {
                smallest = a;
            }
        }
        return new int[] { largest, smallest };
    }

    static int ConsonountCount(String s) {
        /*
         * This function can also be used to calculate the amount of vowels present in a
         * string.
         */
        s = s.toLowerCase();
        int numcon = 0;
        for (char c : s.toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                numcon++;
            }
        }
        // numcon = s.length() - numcon;
        return numcon;
    }

    static void ReverseArray() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int j = array.length - 1;
        int temp = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    static void characterCounter() {
        String s = "Hello World";
        Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            dictionary.put(c, dictionary.getOrDefault(c, 0) + 1);
        }
        System.out.println("\n\n\n" + dictionary);
    }

    public static void main(String[] args) {
        Integer[] array = { 109, 302, 34, 4, 55, 36, 17, 86, 29, 10 };
        System.out.println(Arrays.toString(array));

        int[] ind = largeSmall(array);
        System.out.println(Arrays.toString(ind));
        int L = Arrays.asList(array).indexOf(ind[0]);
        System.out.println(L);
        int S = Arrays.asList(array).indexOf(ind[1]);
        System.out.println(S);

        Integer[] array2 = { 8, 4, 6, 2, 6, 4, 7, 9, 5, 8 };
        Integer[] array3 = { 9, 5, 4 };
        int[] res = largeSmall(array2);
        int[] res3 = largeSmall(array3);
        System.out.println("\n\n\n" + Arrays.toString(res));
        System.out.println("\n\n\n" + Arrays.toString(res3));

        int num = ConsonountCount("aeroplanser");
        System.out.printf("%n%nThe total amount of consonants in the given word are %d\n\n", num);
        // String name = "james";
        // System.out.printf("%n%nThe name is %s",name.getClass().getName());

        ReverseArray();
        characterCounter();
    }
    // System.out.println(theVariable.getClass().getName());
}

// Random rand = new Random();
// int temp = 0;
// int index = 0;
// int[] randnum = new int[10];
// for (int i = 0; i < randnum.length; i++) {
// randnum[i] = rand.nextInt(100);
// }
// System.out.println(Arrays.toString(randnum));
// for(int i = 0; i < randnum.length; i++) {
// for(int j = i+1; j < randnum.length; j++){
// if(randnum[i] > randnum[j])
// {
// temp = randnum[i];
// randnum[i] = randnum[j];
// randnum[j] = temp;
// System.out.println(j);
// index = j;
// }
// }
// }
// System.out.printf("the number is %d %n the index is %d",temp, index);
// return index;

/*
 * Complete the 'countMax' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts STRING_ARRAY upRight as parameter.
 */

// public static long countMax(List<String> upRight) {
// int length = upRight.size();
// int[][] twodgrid = new int[length][length];
// long count = 1;
// int max = 0;
// for( int i = 0; i < length; i++){
// String []temp = upRight.get(i).split(" ");
// int r = Integer.parseInt(temp[0]);
// int c = Integer.parseInt(temp[1]);
// for(int j = 0; j < r; j++){
// for(int k = 0; k < c; k++){
// twodgrid[j][k]+=1;
// if(!(j==0 & k==0) && twodgrid[j][k]>max){
// max = twodgrid[j][k];
// count = 1;
// }else if (twodgrid[j][k] == max){
// count++;
// }
// }
// }
// }
// return count;
// }
// }

// int []count = new int[a.length];
// for(int i = 0; i < a .length; i++){
// for(int j = i+1; j < a.length; j++){
// if(a[i] == a[j]){
// // System.out.println("\nDuplicate: " + a[i] + " at index " + i + "\n " +
// a[j] + " at index " + j);
// count[i] = j;
// // inc++;
// // return a[i];
// }
// }
// }
// System.out.println("\n\n\nThe duplicates are: " + Arrays.toString(count)+" "+
// count.length);
// int smallest = count[0];
// for (int b : count) {
// if (b < smallest && b != 0) {
// smallest = b;
// System.out.println("\n\n\nsmallest: " + smallest);
// return a[smallest];
// }
// else if (count.length == 2){
// return a[count.length-1];
// }else if(b == smallest && b != 0){
// return a[smallest];
// }
// }
// return -1;