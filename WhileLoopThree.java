public class WhileLoopThree {
    public static void main ( String[] args ) {

        int x = 5;
        int y = 2;

        while ( x >= 1 ) {
            
            int a = x;
            while ( a >= 1 ) {
                System.out.print("*");
                a--;
            }
            System.out.println(); 
            
            int z = 2;
            while ( z >= y ) {
                System.out.print(" ");
                z--;
            }
            x -= 2;
            y--;
        }
    }
}