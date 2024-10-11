public class XY {
    public static void main(String[] args) {
        int[][] cords = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(var x = 0; x < cords.length; x++) {         //巡行二維陣列， x為列數
            for(var y = 0; y < cords[x].length; y++) {  //巡行二維陣列， y為列數
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }
    }
} 
