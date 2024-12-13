import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();


        list.add("Apple");
        list.add("Banana");
        list.add("Orange");


        System.out.println("ArrayList內容:" + list);


        String fruit = list.get(1);
        System.out.println("第2個元素:" + fruit);

        list.set(1, "Blueberry");
        System.out.println("更新後的ArrayList:" + list);

        list.remove(0);
        System.out.println("刪除後的ArrayList:" + list);

        int size = list.size();
        System.out.println("ArrayList大小:" + size);

        boolean hasApple = list.contains("Apple");
        System.out.println("ArrayList是否包含Apple:" + hasApple);

        if (list.isEmpty()) {
            System.out.println("使用迴圈訪問元素");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println("ArrayList是空的");
        }

    }
}
