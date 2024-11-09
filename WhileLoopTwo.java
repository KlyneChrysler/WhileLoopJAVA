public class WhileLoopTwo {
    public static void main ( String[] args ) {
        
        int x = 2;

        while ( x >= 0 ) {
            int y = 1;
            while ( y <= x ) {
                System.out.print(" ");
                y++;
            }

            int a = x; 
            while ( a <= 2 ) {
                System.out.print("*");
                a++;
            }
            System.out.println();
            x--;
        }

        x = 1;
        while ( x <= 2 ) {
            int y = 1;
            while ( y <= x ) {
                System.out.print(" ");
                y++;
            }

            int a = x;
            while ( a <= 2 ) {
                System.out.print("*");
                a++;
            }
            System.out.println();
            x++;
        }
    }
}