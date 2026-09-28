public class Practice5 {
    public static void main(String[] args) {
        int[] a={1,2,4,8,5};
        int secondl=-1;
        int largest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                secondl=largest;
                 largest=a[i];
            }
            else if(a[i]>secondl && a[i]!=largest){
                secondl=a[i];
            }
        }
        System.out.println(secondl);
    }
}
