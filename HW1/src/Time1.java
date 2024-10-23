public class Time1 {
    private int hour;//時(hour)
    private int minute;//分(minute)
    private int second;//秒(second)

    //建構子(設定時、分、秒的初始直，需檢查資料是否格式正確)
    public Time1(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }

        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }

        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    //方法: 是需要加入get/set
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        }
    }


    //方法: tick (時間增加一秒)
    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    //方法: printUniversal (以24小時制輸出完整時間  14:05:32)
    public void printUniversal() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }

    //方法: printStandard (以12小時制輸出完整時間  2:05:32  PM)
    public void printStandard() {
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String amPm = (hour < 12) ? "AM" : "PM";
        System.out.printf("%02d:%02d:%02d %s%n", standardHour, minute, second, amPm);
    }

    public static void main(String[] args) {
        Time1 time = new Time1(13, 5, 32);
        time.printUniversal();
        time.printStandard();

        time.tick();
        time.printUniversal();
        time.printStandard();
    }
}
