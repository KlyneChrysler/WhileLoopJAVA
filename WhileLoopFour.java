public class WhileLoopFour {
    public static void main ( String[] args ) {

        int x = 1;
        int y = 2;

        while ( x <= 5 ) { 
            int z = 1;
            while ( z <= y ) {
                System.out.print(" ");
                z++;
            }
            
            int a = x;
            while ( a >= 1 ) {
                System.out.print("*");
                a--;
            }
            System.out.println();
            x += 2;
            y--;
        }
    }
}