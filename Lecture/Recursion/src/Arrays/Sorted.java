package Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,20,8};
        System.out.println(soreted(arr,0));
    }

    static boolean soreted(int[] arr,int index) {
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index + 1] && soreted(arr,index+1);
    }
}
