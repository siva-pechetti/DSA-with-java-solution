public class TrianglePyramid {

    public static void pyramid1(int n) {
        int i, j;

        System.out.println("Triangl pyramid Pattern");

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if ((i + j) <= n) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void pyramid2(int n){
        int i,j;
        System.out.println("Reverse Triangle Pattern");
        for(i=1 ;i<=n;i++){
            for (j=1;j<=n;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
    public static void DiamondStarPattern(int n){
        int rows=5;
        int i,j;
        System.out.println("DiamondStarPattern");

        for(i=1;i<=rows;i++){
            for(j=1;j<=rows;j++){
                if((i+j)<=rows){
                    System.out.print(" ");
                }
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=1;i<=rows-1;i++){
            for(j=1;j<=rows-1;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void  RightPascalTriangle(int r){

        int i,j;
        System.out.println("Right Pascal’s Triangle");
        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=r-1;i++){
            for(j=r-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    public static void HollowTrianglePattern(int n) {
//        int i, j;
//        String space=" ";
//        System.out.println("Hollow pyramid Pattern");
//
//        for (i = 1; i <= n; i++) {
//            for (j = 1; j <= n; j++) {
//                if ((i + j) <= n) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*"+space);
//                    space += " ";
//                }
//            }
//            System.out.println();
//        }
//    }

    public static void HallowSquare(int r){
        int i,j;
        System.out.println("Hallow Square");
        for(i=1;i<=r;i++){
            for(j=1;j<=r;j++){
                if(i==1 || j==1 || i==r || j==r){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static  void HallowRightHalfPyramid(int r){
        int i,j;
        System.out.println("HallowRightHalfPyramid");
        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                if(i==r || j==1 || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid1(5);
        pyramid2(5);
        DiamondStarPattern(5);
        RightPascalTriangle(5);
//        HollowTrianglePattern(5);
        HallowSquare(4);
        HallowRightHalfPyramid(4);
    }
}