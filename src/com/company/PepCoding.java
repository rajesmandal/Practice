package com.company;


import java.util.Scanner;


public class PepCoding {

    public static void main(String[] args) {


//        subArray();
//        rotateArray();
//        prime();
//        printAllPrime();
//        fibonacci();
//        countDigit();
//        digitsOfANumber();
//        reverseANumber();
//        pattern6();
//        pattern7();
//        pattern8();
//        pattern9();
//        pattern10();
//        pattern11();
//        pattern12();
//        pattern14();
//        pattern15();
//        pattern16();
//        pattern17();
//        pattern18();
//        pattern19();
//        pattern20();
//        patternM();
//        patternInvertedHourGlass();


    }
    public static void patternInvertedHourGlass()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int half = n/2+1;
        int right = n;
        int left = 1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (i == 1 || i == n)
                    System.out.print("*\t");
                else if (i == left) {
                    if (j >= left && j <= right)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                else if (i >= n/2+1){
                    if (j == left || j == right)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }


            }
            System.out.println();
            if (i < half) {
                right--;
                left++;
            }
            else
            {
                right++;
                left--;
            }
        }
    }
    public static void patternM()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int left = 1;
        int right = n;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (i > n / 2 + 1) {
                    if (j == 1 || j == n) {
                        System.out.print("*\t");
                    } else
                        System.out.print("\t");
                }
                else if (i <= n / 2 + 1)
                {
                    if (j == 1 || j == n) {
                        System.out.print("*\t");
                    }
                    else if (j == left && j == right) {
                        System.out.print("*\t");
                    }
                    else if (j == left || j == right)
                    {
                        System.out.print("*\t");
                    }
                    else
                        System.out.print("\t");

                }

            }
            System.out.println();
            if (i <= n / 2 + 1) {
                right--;
                left++;
            }
        }

    }

    public static void pattern20()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int left = n / 2 + 1;
        int right = n / 2 + 1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (i < n / 2 + 1) {
                    if (j == 1 || j == n) {
                        System.out.print("*\t");
                    } else
                        System.out.print("\t");
                }
                else if (i >= n / 2 + 1)
                {
                    if (j == 1 || j == n) {
                        System.out.print("*\t");
                    }
                    else if (j == left && j == right) {
                        System.out.print("*\t");
                    }
                    else if (j == left || j == right)
                    {
                        System.out.print("*\t");
                    }
                    else
                        System.out.print("\t");

                }

            }
            System.out.println();
            if (i >= n / 2 + 1) {
                right++;
                left--;
            }
        }

    }
    public  static void pattern19()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (i == n/2+1)
                    System.out.print("*\t");
                else if (i == 1) {
                    if (j <= n / 2 + 1 || j == n)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                else if (i == n){
                    if (j >= n / 2 + 1 || j == 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                else if (i < n/2+1){
                    if (j == n || j == n/2+1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                else if (i > n/2+1){
                    if (j == 1 || j == n/2+1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
    public static void pattern18()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int half = n/2+1;
        int right = n;
        int left = 1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (i == 1 || i == n)
                    System.out.print("*\t");
                else if (i == left) {
                    if (j == left || j == right)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                else if (i > n/2+1){
                    if (j >= left && j <= right)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }

            }
            System.out.println();
            if (i >= half) {
                right++;
                left--;
            }
            else
            {
                right--;
                left++;
            }
        }
    }


    public static void pattern17(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int half = (n/2)+1;
        int st = half;
        for(int i = 1; i <= n; i++)
        {
            for (int j = 1 ; j <= n; j++)
            {
                if(i == half)
                    System.out.print("*\t");
                else if(j >= half && j <= st)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
            if(i >= half)
                st--;
            else
                st++;
        }
    }

    public static void pattern16(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j <= i || j >= n * 2 - i) {
                    System.out.print(count);
                    if(j < i )
                        count++;
                        System.out.print("\t");
                        if (j >= n * 2 - i)
                            count--;
                    } else
                        System.out.print("\t");
            }
            count++;
            System.out.println();
        }
    }



    public static void pattern15(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int half = (n >> 1) + 1;
        int left = (n >> 1) + 1;
        int right = (n >> 1) + 1;
        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (j >= left && j <= right )
                {
                    if (j <= half)
                        System.out.print(++count);
                    else
                        System.out.print(--count);
                }
                System.out.print("\t");
            }
            System.out.println();
            if(i < (n >> 1) + 1)
            {
                left--;
                right++;
            }
            else
            {
                count = count-2;
                left++;
                right--;
            }
        }
    }



    public static void pattern14(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mult;
        for(int i = 1; i <= 10; i++){
            mult = n * i;
            System.out.println(n + " * " +i+ " = " +mult );
        }
    }
    public static void pattern12(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if(j <= i){
                    System.out.print(a + "\t");
                    int s = a + b;
                    a = b;
                    b = s;
                }
            }
            System.out.println();
        }
    }
    public static void pattern11(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if(j <= i){
                    System.out.print(count+"\t");
                    count++;
                }
            }
            System.out.println();
        }
    }

    public static void pattern10() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int left = n/2 + 1;
        int right = n/2 + 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j == left || j == right) {
                    System.out.print("*\t");
                } else
                    System.out.print("\t");
            }
            if(i<n/2+1)
            {
                left--;
                right++;
            }
            else
            {
                left++;
                right--;
            }
            System.out.println();
        }
    }


    public static void pattern9() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j == i || i + j == n + 1 )
                {
                    System.out.print("*\t");
                }

                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void pattern8() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n+1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j == temp-i)
                {
                    System.out.print("*");
                    break;
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void pattern7() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j == i)
                {
                    System.out.print("*");
                    break;
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void pattern6()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j,k=0;
        int temp = n/2 + 1;
        int temp1 = temp+1;
        for (i  = 1; i <= n; i++)
        {
            k = i <= temp ? k+1 : k-1;

            for (j = 1; j <= n+2; j++)
            {
                if (j <= temp1-k || j >= temp1+k)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void pythagoreanTriplet()
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
            System.out.println("true");
        else
            System.out.println("false");
    }



    public static void reverseANumber(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n != 0)
        {
            int s = n % 10;
            n = n / 10;
            System.out.println(s);
        }
    }



        public static void digitsOfANumber(){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int power = 1;
            int temp = n;
            while (temp >= 10) {
                temp /= 10;
                power *= 10;
            }

            temp = n;
            while (power != 0) {
                int digit = temp / power;
                System.out.println(digit);

                temp = temp % power;
                power = power / 10;
            }
        }


    public static void countDigit() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while (n != 0)
        {
            n = n / 10;
            count++;
        }
        System.out.println(count);

    }




    public static void fibonacci()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++)
        {
            System.out.println(a);
                int s = a + b;
                a = b;
                b = s;


        }

    }




    public static void printAllPrime() {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int h = in.nextInt();

        for (int i = l; i <= h; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.println(i);

        }
    }







    public static void prime() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int count = 0;
            int n = in.nextInt();
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 0)
                System.out.println("prime");
            else
                System.out.println("not prime");

        }
    }


    public static int digitFrequency(int n, int d) {
        int count = 0;
        while (n != 0) {
            int temp;
            temp = n % 10;
            n = n / 10;
            if (temp == d) {
                count++;
            }
        }
        return count;

    }

    public static int getValueInBase(int n, int b) {
        int p = 1;
        int rev = 0;
        while (n != 0) {
            int temp = n % b;
            rev += (temp * p);
            p *= 10;
            n = n / b;
        }
        return rev;
    }

    public static int getValueIndecimal(int n, int b) {
        int temp = 0;
        int res = 0;
        int i = 1;

        while (n != 0) {
            temp = n % 10;
            res += (temp * i);
            i = i * b;
            n = n / 10;
        }

        return res;
    }


    public static void subArray() {
        int n = 3;
        int arr[] = {10, 20, 30};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }


    public static void rotateArray() {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for (int a = 0; a < size; a++) {
            arr[a] = in.nextInt();
        }
        int n = in.nextInt();
        for (int i = n - 1; i < size; i++) {
            System.out.print(arr[i]);
        }
        if (n == 1) {
            return;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
        }
    }
}


