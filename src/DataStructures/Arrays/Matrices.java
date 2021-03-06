
// import java.lang.reflect.Array;
import java.util.*;

public class Matrices {
    /*
     * Double Suffix Notation :
     * Each element in a matrix has its own particular 'address'
     * or location which can be defined by a system of double
     * suffixes, the first indicating the row, the second
     * the column, thus:
     * 
     * int[][] a = new int[][] { {a(11), a(12), a(13), a(14)},
     * {a(21), a(22), a(23), a(24)},
     * {a(31), a(32), a(33), a(34)},
     * };
     * a(23) indicates the element in the second row and third column
     * This because matrices are defined as row by column i.e
     * Arrayname[row][column] = a[2][3];
     */

    // THIS SECTION PRINTS ALL THE DIFFERENT TYPES OF MATRIX
    static void PrintMatrix(int[][] matrix) {
        System.out.println("\nThe value of the matrix is ");
        System.out.println(Arrays.deepToString(matrix));
    }

    static void PrintMatrixList(ArrayList<ArrayList<Integer>> matrix) {
        System.out.println("\nThe value of the matrix is ");
        System.out.println(matrix);
    }

    static void PrintThreeDimensionalMatrixList(ArrayList<ArrayList<ArrayList<Integer>>> matrix) {
        System.out.println("\nThe value of the matrix is ");
        System.out.println(matrix);
    }

    static void PrintThreeDMatrixList(ArrayList<ArrayList<ArrayList<String>>> matrix) {
        System.out.println("\nThe value of the matrix is ");
        System.out.println(matrix);
    }
    // END OF PRINT SECTION

    static int[][] M1() {
        int[][] matrix = new int[][] {
                { 6, -5, 1, 3 },
                { 2, -4, 8, 3 },
                { 4, -7, -6, 5 }
        };
        for (int row = 0; row < matrix.length; row++) {// for each row
            for (int column = 0; column < matrix.length + 1; column++) {// for each column in the row
                System.out.println(matrix[row][column]);
            }
        }
        return matrix;
    }

    static int[][] AddMatrix() {
        int row = 0;
        int col = 0;
        int[][] A1 = new int[][] { { 4, 2, 3 }, { 5, 7, 6 }, { 6, 5, 12 } };
        int[][] A2 = new int[][] { { 1, 8, 9 }, { 3, 5, 4 }, { 9, 13, 6 } };
        int[][] newMatrix = new int[A1.length][A1.length];
        for (row = 0; row < A1.length; row++) {
            for (col = 0; col < A1.length; col++) {
                newMatrix[row][col] = A1[row][col] + A2[row][col];
            }
        }

        return newMatrix;
    }

    static int[][] SubtractMatrix() {
        int row = 0;
        int col = 0;
        int[][] A1 = new int[][] { { 4, 2, 3 }, { 5, 7, 6 }, { 6, 5, 12 } };
        int[][] A2 = new int[][] { { 1, 8, 9 }, { 3, 5, 4 }, { 9, 13, 6 } };
        int[][] newMatrix = new int[A1.length][A1.length];
        for (row = 0; row < A1.length; row++) {
            for (col = 0; col < A1.length; col++) {
                newMatrix[row][col] = A1[row][col] - A2[row][col];
            }
        }

        return newMatrix;
    }

    static int[][] ScalarMultiplicationMatrix() {
        int row = 0;
        int col = 0;
        int[][] A1 = new int[][] { { 4, 2, 3 }, { 5, 7, 6 }, { 6, 5, 12 } };
        // int[][] A2 = new int[][] {{1,8,9},{3,5,4},{9,13,6}};
        int[][] newMatrix = new int[A1.length][A1.length];
        for (row = 0; row < A1.length; row++) {
            for (col = 0; col < A1.length; col++) {
                newMatrix[row][col] = 3 * (A1[row][col]);
            }
        }

        return newMatrix;
    }

    static int[][] TwoMatrixMultiplication(int[][] A1, int[][] A2) {
        /*
         * Two matrices can be multiplied together only when the
         * number of columns in the first matrix is equal
         * to the number of rows in the second matrix.
         * so basically if we have two matrices
         * number of columns of first matrix is = A1[0].length
         * number of rows of second matrix is = A2.length
         * They can only be multiplied
         * if A1[0].length == A2.length
         * 
         */
        /*
         * A1.length = number of rows of first matrix
         * A1[0].length = number of columns of first matrix
         * A2.length = number of rows of second matrix
         * A2[0].length = number of columns of second matrix
         * rowOfFirst * columnOfSecond = newElement;
         */
        int[][] newMatrix = new int[A1.length][A2[0].length];
        if (A1[0].length == A2.length) {
            // newMatrix[0][0] = (A1[0][0] * A2[0][0]) + (A1[0][1] * A2[1][0]) + (A1[0][2] *
            // A2[2][0]);
            // newMatrix[1][0] = (A1[1][0] * A2[0][0]) + (A1[1][1] * A2[1][0]) + (A1[1][2] *
            // A2[2][0]);
            if (A2[0].length == 1) {
                int row = 0;
                int col = 0;
                for (row = 0; row < newMatrix.length; row++) {
                    for (col = 0; col < newMatrix[0].length; col++) {
                        newMatrix[row][col] = (A1[row][col] * A2[0][col]) + (A1[row][1] * A2[1][col])
                                + (A1[row][2] * A2[2][col]);
                    }
                }
            } else if (A2[0].length > 1) {
                for (int nmRow = 0; nmRow < newMatrix.length; nmRow++) {
                    int j = 0;
                    int col = 0;
                    for (int nmCol = 0; nmCol < newMatrix[0].length; nmCol++) {
                        int row = 0;
                        newMatrix[row][col++] = (A1[row][0] * A2[0][j]) + (A1[row][1] * A2[1][j]);
                        j++;
                    }
                    j = 0;
                    col = 0;
                    for (int nmCol = 0; nmCol < newMatrix[0].length; nmCol++) {
                        int row = 1;
                        newMatrix[row][col++] = (A1[row][0] * A2[0][j]) + (A1[row][1] * A2[1][j]);
                        j++;
                    }
                    j = 0;
                    col = 0;
                    for (int nmCol = 0; nmCol < newMatrix[0].length; nmCol++) {
                        int row = 2;
                        newMatrix[row][col++] = (A1[row][0] * A2[0][j]) + (A1[row][1] * A2[1][j]);
                        j++;
                    }
                    // OUTPUT -> [[18, 29, 43, 31], [30, 43, 62, 44], [32, 32, 41, 27]]
                }
            }
        } else {
            System.out.println("Sorry the two matrices cannot be multiplied");
            return null;
        }

        return newMatrix;
    }

    // UNDERSTANDING HOW TO WORK WITH THE TWO DIMENSIONAL DYNAMIC ARRAY
    static ArrayList<ArrayList<Integer>> MultidimensionalArrayList() {
        ArrayList<ArrayList<Integer>> numList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 3; i++) {
            numList.add(new ArrayList<>());
        }
        for (int i = 1; i <= 3; i++) {
            numList.get(0).add(i);
            numList.get(1).add(i * 2 * 7);
            numList.get(2).add((i + 15) * i);
        }

        int row = numList.size();
        for (int i = 0; i < row; i++) {
            int col = numList.get(i).size();
            for (int j = 0; j < col; j++) {
                System.out.printf("The value -> %d%n", numList.get(i).get(j));
                Integer mainRow = i; // Autoboxing -> PUTTING PRIMITIVE IN WRAPPER CLASS
                Integer mainCol = j; // Autoboxing -> PUTTING PRIMITIVE IN WRAPPER CLASS
                Integer mainVal = numList.get(i).get(j); // -> GETTING ALL THE VALUES IN THE ARRAY
                System.out.printf("Element at numList[%d][%d] is %d%n", mainRow, mainCol, mainVal);
                // System.out.printf("Vertex %d is connected to vertex %d%n",mainRow,mainCol);
            }
            System.out.println(numList.get(i) + "\n\n");
        }
        return numList;
    }

    // UNDERSTANDING THE THREEDIMENSIONAL ARRAYS
    static ArrayList<ArrayList<ArrayList<Integer>>> ThreeDimensionalArrayList() {
        ArrayList<ArrayList<ArrayList<Integer>>> space = new ArrayList<ArrayList<ArrayList<Integer>>>();
        for (int i = 0; i < 3; i++) {
            space.add(new ArrayList<ArrayList<Integer>>()); // ADDING 2-D ARRAY TO THE 3-D ARRAY
            for (int j = 0; j < 3; j++) {
                space.get(i).add(new ArrayList<Integer>()); // ADDING 1-D ARRAY TO THE 2-D ARRAY
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                space.get(0).get(i).add(j + 9 * i / 2);
                space.get(1).get(i).add(j * 2 * 7 + i);
                space.get(2).get(i).add((j + 15) * i);
            }
        }
        return space;
    }

    // A THREE DIMENSIONAL DYNAMMIC ARRAY, MIMICKING THE RGB DISTRIBUTION ON A
    // SCREEN
    static ArrayList<ArrayList<ArrayList<String>>> ThreeDArrayList(Random john) {
        ArrayList<ArrayList<ArrayList<String>>> space = new ArrayList<ArrayList<ArrayList<String>>>();
        int x_axis_length = 3;
        int y_axis_length = 3;
        int z_axis_length = 3;

        for (int i = 0; i < x_axis_length; i++) {
            space.add(new ArrayList<ArrayList<String>>(y_axis_length));
            for (int j = 0; j < y_axis_length; j++) {
                space.get(i).add(new ArrayList<String>(z_axis_length));
            }
        }
        int rate = john.nextInt(105);
        int gate = john.nextInt(105);
        int bate = john.nextInt(105);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                space.get(i).get(j).add("Red " + "" + (rate * i * i));
                space.get(i).get(j).add("Blue " + "" + (bate * j * j));
                space.get(i).get(j).add("Green " + "" + (gate + i * j));
            }
        }
        return space;
    }

    public static void main(String[] args) {
        int[][] M1 = M1();
        // System.out.println(Arrays.deepToString(M1));
        PrintMatrix(M1);
        System.out.printf("\nThe number of rows for the matrix M1 is %d", M1.length);
        System.out.printf("\nThe number of columns for the matrix M1 is %d", M1[0].length);
        int[][] M2 = AddMatrix();
        PrintMatrix(M2);
        int[][] M3 = SubtractMatrix();
        PrintMatrix(M3);
        int[][] M4 = ScalarMultiplicationMatrix();
        PrintMatrix(M4);

        // Multiplying a matrix
        int[][] A1 = new int[][] { { 4, 7, 6 }, { 2, 3, 1 } };
        int[][] A2 = new int[][] { { 8 }, { 5 }, { 9 } };
        int[][] M5 = TwoMatrixMultiplication(A1, A2);
        PrintMatrix(M5);

        int[][] A3 = new int[][] { { 1, 5 }, { 2, 7 }, { 3, 4 } };
        int[][] A4 = new int[][] { { 8, 4, 3, 1 }, { 2, 5, 8, 6 } };
        int[][] M6 = TwoMatrixMultiplication(A3, A4);
        PrintMatrix(M6);

        ArrayList<ArrayList<Integer>> maica;
        maica = MultidimensionalArrayList();
        PrintMatrixList(maica);
        Random rand = new Random();
        ArrayList<ArrayList<ArrayList<String>>> bayco;
        bayco = ThreeDArrayList(rand);
        PrintThreeDMatrixList(bayco);

        ArrayList<ArrayList<ArrayList<Integer>>> Jayco;
        Jayco = ThreeDimensionalArrayList();
        PrintThreeDimensionalMatrixList(Jayco);
        System.out.println(rand.nextInt(20));
    }
}
/**
 * This was the Brute Force Solution i was able to come up with
 * else if(A2[0].length > 1){
 * // for(row = 0; row < newMatrix.length; row++){
 * // for(col = 0; col < newMatrix[0].length; col++){
 * int row = 0;
 * int col = 0;
 * newMatrix[row][col++] = (A1[0][0]*A2[0][0])+(A1[0][1]*A2[1][0]);
 * newMatrix[row][col++] = (A1[0][0]*A2[0][1])+(A1[0][1]*A2[1][1]);
 * newMatrix[row][col++] = (A1[0][0]*A2[0][2])+(A1[0][1]*A2[1][2]);
 * newMatrix[row][col++] = (A1[0][0]*A2[0][3])+(A1[0][1]*A2[1][3]);
 * col = 0;
 * row++;
 * newMatrix[row][col++] = (A1[1][0]*A2[0][0])+(A1[1][1]*A2[1][0]);
 * newMatrix[row][col++] = (A1[1][0]*A2[0][1])+(A1[1][1]*A2[1][1]);
 * newMatrix[row][col++] = (A1[1][0]*A2[0][2])+(A1[1][1]*A2[1][2]);
 * newMatrix[row][col++] = (A1[1][0]*A2[0][3])+(A1[1][1]*A2[1][3]);
 * col = 0;
 * row++;
 * newMatrix[row][col++] = (A1[2][0]*A2[0][0])+(A1[2][1]*A2[1][0]);
 * newMatrix[row][col++] = (A1[2][0]*A2[0][1])+(A1[2][1]*A2[1][1]);
 * newMatrix[row][col++] = (A1[2][0]*A2[0][2])+(A1[2][1]*A2[1][2]);
 * newMatrix[row][col++] = (A1[2][0]*A2[0][3])+(A1[2][1]*A2[1][3]);
 * // [[18, 29, 43, 31], [30, 43, 62, 44], [32, 32, 41, 27]]
 * // }
 * // }
 * }
 */
