import java.util.Arrays;
public class Linear_search1 {
    public static void main(String[] args) {
        int[] nums={23,76,8,99,65,14};
        int target=99;
        int result=Linear_search(nums,target);
        System.out.println("The targeted index is" + " " + result);
    }

    static int Linear_search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
            
    }
    
}
