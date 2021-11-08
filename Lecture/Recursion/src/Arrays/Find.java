package Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {4,6,1,8,2,9,8};
        int target = 8;
//        System.out.println(find(arr,target,0));
//        System.out.println(findIndex(arr,target,0));
//        ArrayList<Integer>ans = findAllIndex(arr,target,0,new ArrayList<>());
//        System.out.println(ans);
        System.out.println(findAllIndex2(arr,target,0));
    }

    static boolean find(int[] arr,int target,int index) {
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index + 1);
    }

    static int findIndex(int[] arr,int target,int index) {
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return  index;
        } else {
            return findIndex(arr,target,index + 1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
