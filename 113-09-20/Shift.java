public class Shift {
    public static void main(String[] args) {
        int number = 1; 
        System.out.printf( "2 的 0 次方: %d%n", number); 
        System.out.printf( "2 的 1 次方: %d%n", number << 1); 
        System.out.printf( "2 的 2 次方: %d%n", number << 2); 
        System.out.printf( "2 的 3 次方: %d%n", number << 3); 
    }
}


// 2 -> 00000010
// 2 << 1 -> 000000100 =>4
// 2 << 2 -> 000001000 =>8
// 5 -> 00000101