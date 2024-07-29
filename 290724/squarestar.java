public class squarestar {
    public static void main(String[] args) {
        int r = 8, c = 22;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || i==(r-1)){
                    System.out.print("*");
                }
                else if(j==0 || j== c-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
}
