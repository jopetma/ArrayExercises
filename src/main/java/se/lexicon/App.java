package se.lexicon;


import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class App<Int> {
/* 8. Write a program which will remove the duplicate elements of a given
array [20, 20, 40, 20, 30, 40, 50, 60, 50].
Expected output:                 Array: 20 20 40 20 30 40 50 60 50
                  Array without duplicate values: 20 40 30 50 60
*/
public static void main(String[] args) {
    int array8[] = {20, 20, 40, 20, 30, 40, 50, 60, 50};
//    int array8rensad[] = new int[0];
    Arrays.sort(array8);
    for (int i = 0; i < array8.length; i++) { ;
        for (int j = i + 1; j < array8.length - 1; j++) { ;
            if (array8[i] != array8[j]){;
                int array8rensad[] = new int[0];
                array8rensad.length  = array8[i];
                System.out.println(array8rensad);
            }else {
                    break;
                }
            }
        }
    }




/* 7. Write a program which will set up an array to hold 10 numbers and print
out only the uneven numbers.
Expected output: Array: 1 2 4 7 9 12
Odd Array: 1 7 9
*/
/*
public static void main(String[] args) {
    int array7[] = {1, 2, 4, 6, 7, 8, 9, 10, 12, 14};

    for (int i = 0 ; i < array7.length ; i++) { ;
        if ( array7[i] % 2 > 0)  { ;
            System.out.println(array7[i]);
        }
    }
}
1
7
9
Process finished with exit code 0
*/

/* 6. Write a program which will set up an array to hold the next values in this
order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
Expected output: Average is: 17.3
*/
/*
    public static void main(String[] args) {
        int array6[] = {43, 5, 23, 17, 2, 14};
        int array6sum = 0;
        for (int i = 0; i < array6.length; i++) {
            array6sum = array6sum + array6[i];
        }
        double array6Div = array6sum;
        array6Div = array6Div / array6.length;

        System.out.println(array6Div);
    }
//17.333333333333332
//Process finished with exit code 0
*/

/* 5. Create a two-dimensional string array [2][2]. Assign values to the 2d
array containing any Country and City.
Expected output:
France Paris
Sweden Stockholm
    */
    /*
    public static void main(String[] args) {
        String[][] city5 = new String[2][2];
        city5[0][0] = "France";
        city5[0][1] = "Paris";
        city5[1][0] = "Sweden";
        city5[1][1] = "Stockholm";
        //String array51 = Arrays.toString(city5);
        //System.out.println(array51);
        for (String[] array51 : city5) {
            System.out.println(Arrays.toString(array51));
        }
    }
[France, Paris]
[Sweden, Stockholm]
Process finished with exit code 0
*/


/* 9. Write a method which will add elements in an array.
Remember that arrays are fixed in size so you need to come up with a
solution to “expand” the array.

10. Write a program which will represent multiplication table stored in
multidimensional array.
Hint: You have two-dimensional array with values
[[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
*/

/* 4. Write a program which will copy the elements of one array into another
array.
Expected output: Elements from first array: 1 15 20
Elements from second array: 1 15 20

    public static void main(String[] args) {
        int array5[] = {1, 15, 20};
        int array51[] = Arrays.copyOf(array5, array5.length + 7) ;
        array51[5]=35;
        System.out.println(Arrays.toString(array51));
    }
}
[1, 15, 20, 0, 0, 35, 0, 0, 0, 0]
Process finished with exit code 0
*/

/* 3. Write a program which will sort string array.
Expected output: String array: [Paris, London, New York, Stockholm]
  Sort string array: [London, New York, Paris, Stockholm]
*/
/*
    public static void main(String[] args) {
String city3[] = {"Paris", "London", "New York", "Stockholm"};
            Arrays.sort(city3);
            for (String cities : city3) {
                System.out.println(cities);
            }
    }
}
        London
        New York
        Paris
        Stockholm
        Process finished with exit code 0
*/


/* 2. Create a program and create a method with name ‘indexOf’ which will
    find and return the index of an element in the array. If the element
    doesn’t exist your method should return -1 as value.
    Expected output: Index position of number 5 is: 2.
     Exercise 2, indexOf
     */
/*
    private int[] number2 = {1, 5, 3, 4, 2};

    public int findNumber(int numberToFind) {
        for (int numberX : number2) {
            if (numberX == numberToFind) {
                ;
                return numberX;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search by index: ");
        int numberX = Integer.parseInt(scanner.nextLine());

        App app = new App();
        int foundNumber = app.findNumber(numberX);
        System.out.println(foundNumber);
      }
      }
*/

/* 1. Write a program which will store elements in an array of type ‘int’ and
print it out.Expected output: 11 23 39 etc.
     */
/*
    public static void main(String[] args) {
        {
            int numberArray1[] = new int[]{5, 4, 3, 2, 1,};
            System.out.println(Arrays.toString(numberArray1));
        }
    }
        [5, 4, 3, 2, 1]
        Process finished with exit code 0
    */
}



