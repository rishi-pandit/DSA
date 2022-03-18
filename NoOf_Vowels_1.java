/*Q.There is a array of string data. In every array elements, you need to find the no.
        of vowel present and print in the order.

        Sample:
        input:  {apple, mango, pineapple, stawberry, promegenate}
        output: 2, 2, 4, 2, 5

 */

package com.DSA_Class;
import java.util.Arrays;
import java.util.Scanner;

public class NoOf_Vowels_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       // String []starr ={sc.nextLine()};
        String []starr = new String[5];
        for(int i=0; i<5; i++){

           starr[i] = sc.next();
        }
        int []arr = new int[5];
        System.out.println("Frequencies of vowels before sorting : ");
        for(int i=0; i<starr.length; i++){
            int c=0;

            for(int j=0; j<5; j++){
                char ch = starr[i].charAt(j);
                if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                    c++;
                }
            }
            arr[i] = c;
            System.out.print(c + " , ");
        }
        System.out.println();
        System.out.println("Frequencies of vowels after sorting : ");
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" , ");
        }
    }
}
