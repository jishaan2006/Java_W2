package lec15;

import java.util.HashMap;

public class TargetSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr={1,2,7,3,4,5,6,8,9};
        int target=15;
        for(int i=0;i<arr.length;i++){
            int difference=target-arr[i];
            if(map.containsKey(difference)){
                System.out.println("At index : "+map.get(difference)+" & "+i);
                break;
            }
            map.put(arr[i],i);
        }
    }
}
