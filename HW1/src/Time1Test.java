import java.util.Scanner;

public class Time1Test {
    public  static  void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        //Time1 time = new ....
        Time1 time = new Time1(13, 5, 32);

        //呼叫printUniversal()
        System.out.println("Initial Time (24-hour format): ");
        time.printUniversal();

        //呼叫printStandard()
        System.out.println("Initial Time (12-hour format): ");
        time.printStandard();

        //使用者輸入時間過了幾秒，用迴圈呼叫tick
        System.out.print("Enter how many seconds have passed: ");
        int secondsPassed = scanner.nextInt();
        for (int i = 0; i < secondsPassed; i++) {
            time.tick();
        }

        //呼叫printUniversal()
        System.out.println("Updated Time (24-hour format): ");
        time.printUniversal();

        //呼叫printStandard()
        System.out.println("Updated Time (12-hour format): ");
        time.printStandard();
    }

}
