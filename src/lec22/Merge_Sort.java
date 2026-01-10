package lec22;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr={1,5,2,9,7,3,6,4};
        int start=0;
        int end= arr.length-1;
        Merge_Sort_Solution sortSolution=new Merge_Sort_Solution();
        sortSolution.mergesort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
}
class Merge_Sort_Solution{
    void mergesort(int[] arr,int left,int right){
        if(left>= right) {
            return;
        }
        int mid=(left+right)/2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    static void merge(int[] arr,int left,int mid,int right){
        ArrayList<Integer> sortedList=new ArrayList<>();
        int i=left;
        int j=mid+1;

        while (i<=mid && j<=right){
            if(arr[i]<arr[j]){
                sortedList.add(arr[i]);
                i++;
            }else{
                sortedList.add(arr[j]);
                j++;
            }
        }

        while (i<=mid){
            sortedList.add(arr[i]);
            i++;
        }

        while(j<=right){
            sortedList.add(arr[j]);
            j++;
        }

        for(int k=0;k<sortedList.size();k++){
            arr[left+k]=sortedList.get(k);
        }
    }
}