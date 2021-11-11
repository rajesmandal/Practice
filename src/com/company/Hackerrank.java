package com.company;

import java.util.Scanner;

public class Hackerrank {
    public static void test() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(s.substring(start,end));


    }
}
class CoderByte{
    public static boolean codelandUsernameValidation(String str) {
        // code goes here
        if (str.length() < 4 || str.length() > 25) {
            return false;
        }
        if (!Character.isLetter(str.charAt(0))) {
            return false;
        }
        if (str.charAt(str.length()-1)=='_')
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)) || str.charAt(i) == '_') {
                continue;
            }else {
                return false;
            }
        }

    return true;
    }

    public static String palindrome(String str){
        String rev = "";
        for (int i=str.length()-1;i >= 0; i--){
            rev = rev + str.charAt(i);

        }
        System.out.println("rev value " +rev);
        System.out.println("str value " +str);
        if(str.equals(rev)) {
            return "Palindrome";
        }
        return "Not Palindrome";

    }
    public static String palindrome1(String str){
        int j = str.length()-1;
        for ( int i = 0; i < str.length()/2; i++)
        {
            if(str.charAt(i) != str.charAt(j)){
                return "Not a Palindrome";
            }
            j--;
        }
        return "Is Palindrome";


    }
    public static int count1(int arr[])
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            count = count+arr[i];
        }
        return count;

    }
    public static void counts1() {
        int arr[] = {0, 0, 1, 1, 1, 1, 1};
        int i = 0;
        while (arr[i] != 1)
        {
            i++;
        }
        System.out.println(arr.length-i);

    }

/*    public static int secondLargest()
    {
        int k=0;
        int temp;
        int arr[]={40,123,25,123,38};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (k = i+1; k < arr.length; k++)
            {
                if (arr[i]!=arr[k])
                {
                    return arr[k];
                }
            }

        }
       // System.out.print("Second Largest number is "+ arr[k]);
//        System.out.print("Second Largest number is "+ arr[1]);
        return arr[k];
    }*/

    public static void secondLarge()
    {
        int max = Integer.MIN_VALUE, secMax = 0;
        int arr[]={40,123,25,123,38};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                secMax = max;
                max = arr[i];

            }
        }
        System.out.println(max);
        System.out.println(secMax);

    }

   /* public static void findSumNearToZero()
    {
        int []arr = {1,3,-5,7,8,20,-40,6};
        int sum;
        int negative;
        int positive;
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                sum = arr[i] + arr [j];


                if (sum < 0)
                {
                    if ()
                    {

                    }
                    negative = sum;
                }
                if (sum < 0)
                {

                }
                positive = sum;
            }

        }


    }*/

    public static void conscutive()
    {
        int arr[] = new int[3];
        int temp = 0;
        int result = 0;
        Scanner in = new Scanner(System.in);
        for (int a = 0; a < arr.length; a++ )
        {
            arr[a] = in.nextInt();

        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        result = arr[arr.length-1]-arr[0]-arr.length-1;
        System.out.println(result);

    }

    public static void main(String[] args) {
//        CoderByte.loops();

//        CoderByte.solution();

    }
    public static void loops()
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int k=0;k<t;k++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                int c = 1;
                int s = 0;
                for (int j = 0; j <= i; j++) {
                    s = (c * b) + s;
                    c = c * 2;
                    sum = s + a;
                }
                System.out.print(sum + " ");
            }

        }
    }
    public static void solution(){
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (in.hasNext())
        {
            i++;
            System.out.println(i+" "+in.nextLine());

        }
    }









}
