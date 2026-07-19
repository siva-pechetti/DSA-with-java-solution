
public class HalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        int i,j,k;

        System.out.println("Right half pyramid:");
        for ( i=0;i<n; i++) {
            for ( j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        int m=5;
        System.out.println("Inverted");
        for( i=1;i<=m;i++){
            for( j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Left Half Pyramid Pattern");
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if((i+j) <= n){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.print("Reverse Left Half Pyramid Pattern\n");
        for(i=1;i<=n;i++){
            for(j=1;j<=5;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}