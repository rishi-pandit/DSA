package com.DSA_Class;

public class Ex_Spiral_3 {
    public static void main(String[] args) {
        int[][] a = new int [][] {
                {2,3,4},
                {1,7,20},
                {1,4,5},

        };
        /**
         * algorithm
         * 1. traverse all elements of the row 0
         2. traverse all elements of last column
         3. traverse all the elements of last row in reverse order
         4. traverse all the elements in reverse order of 1st column except [0,0] index
         5. repeat the process for the rest no. of columns and rows
         */
        int ci = 0, rj=0, k, r =3 , c = 3;

        while(ci<=r && rj <=c) {
            for(k=rj;k<=c;k++)
                System.out.print(a[ci][k]+" ");
            ci++;
            for(k=ci;k<=r;k++)
                System.out.print(a[k][c]+" ");
            c--;

            for(k=c;k>=rj;k--)
                System.out.print(a[r][k]+" ");
            rj++;
            for(k=r-1; k>=rj; k--)
                System.out.println(a[k][ci]);
            r--;

        }

    }
}
