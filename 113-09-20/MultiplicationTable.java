
public class MultiplicationTable {
    public static void main(String[] args) {
        for(var j = 1; j < 10; j++) { 
           for(var i = 2; i < 10; i++) { 
               System.out.printf("%d*%d=%2d ",i, j,  i * j);
           } 
           System.out.println(); 
        }  
    }
}
// j = 1 => i = 2, 3, 4, 5, 6, 7, 8, 9
// j = 2 => i = 2, 3, 4, 5, 6, 7, 8, 9
