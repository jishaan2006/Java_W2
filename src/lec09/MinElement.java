package lec09;

public class MinElement {
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int min=arr[0][0];
        for(int[] row:arr) {
            for(int a:row) {
                if(a<min){
                    min=a;
                }
            }
        }
        System.out.println("Min Element :"+min);
    }
}
