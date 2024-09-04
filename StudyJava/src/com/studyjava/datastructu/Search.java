package com.studyjava.datastructu;

public class Search {
    private static void sort(int[] a){
        for (int i = 0; i < a.length - 1; i++){
            boolean flag = false;
            for (int j = 0; j < a.length - 1 - i; j++){
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
    private static int simpleSearch(int[] a, int target){
        for (int i = 0; i < a.length; i++){
            if (a[i] > target) break;
            if (a[i] == target) return i;
        }
        return -1;
    }

    private static int binarySearch(int[] a, int target){
        int left = 0, right = a.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int i = a[mid];
            if (i > target)
                right = mid - 1;
            else if (i < target)
                left = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
