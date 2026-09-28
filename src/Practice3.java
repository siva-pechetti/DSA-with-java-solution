import java.util.HashMap;

public class Practice3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr={1,1,2,2,3,5,5,5};
        for(int i=0;i< arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int num:map.values()){
            if(num>max){
                max=num;
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)== max){
                System.out.println(key);
            }
        }


    }
}
