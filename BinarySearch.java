import java.io.*;
import java.util.*;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
         for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter a Number: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Enter number to search: ");
        int search = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int found = -1;

        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(arr[mid] == search)
            {
                found = mid;
                break;
            }
            else if(arr[mid] < search)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        if(found != -1)
        {
            System.out.println("Number found at index: " + found);
        }
        else
        {
            System.out.println("Number not found");
        }
    }
}