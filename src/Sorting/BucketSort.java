import java.util.ArrayList;
import java.util.Collections;


public class BucketSort {
    static void bucketSort(int[] arr, int bucketCount) {
        if (arr.length == 0) return;

        // Find the maximum and minimum values in the array
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int num : arr) {
            if (num < minValue) minValue = num;
            if (num > maxValue) maxValue = num;
        }

        // Create buckets
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        // Distribute input array values into buckets
        for (int num : arr) {
            int bucketIndex = (int) ((long)(num - minValue) * bucketCount / (maxValue - minValue + 1));
            buckets.get(bucketIndex).add(num);
        }

        // Sort each bucket and concatenate the results
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int bucketCount = 5; // You can choose the number of buckets
        bucketSort(arr, bucketCount);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}