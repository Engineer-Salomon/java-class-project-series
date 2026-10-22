public class j3 {
    public static void main(String[] args) {
        int a;
        for( int i=1; i<=10; i++){
            System.out.println();
            for(a = 10-i; a>=1;a--)
                System.out.print(" ");
            for (int n = 1;n<=i;n++)
                System.out.print(" *");
           }
        for( int i=1; i<=10; i++){
            System.out.println();
            for(a = 1; a<=i;a++)
                System.out.print(" ");
            for (int n = 0;n<=10-a;n++)
                System.out.print(" *");
        }
    }
    
}
