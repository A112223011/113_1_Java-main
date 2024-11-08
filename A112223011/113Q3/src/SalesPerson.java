import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;
import java.util.Arrays;

public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[3];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        this.id = id;
        this.name = name;
        this.commissionRate = 0.01;
        //預設commissionRate = 0.01
    }

    public SalesPerson(String id, String name, double commissionRate) {
        this.id = id;
        this.name = name;
        this.commissionRate = commissionRate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
       return name;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        if (orderCount == orderArray.length) {
            orderArray = Arrays.copyOf(orderArray, orderArray.length * 2);
        }
        orderArray[orderCount++] = new Order(itemName, itemPrice, amount);

        //*************************
        //(加分項)若陣列長度不足，將陣列長度x2
        //(必要)新增order到orderArray
        //*************************
    }

    public double getGrossSales() {
        double totalSales = 0;
        for (int i = 0; i < orderCount; i++) {
            totalSales += orderArray[i].totalSale();
        }
        return totalSales;
        //*************************
        //計算總銷售額，並回傳
        //*************************
    }

    
    public String getOrders() {
        StringBuilder orders = new StringBuilder();
        for (int i = 0; i < orderCount; i++) {
            orders.append(orderArray[i].toString());
        }
        return orders.toString();
        //****************************************
        //將所有oder的內容，整合為一個字串，並回傳
        //****************************************
    }

    public double salary() {
        return getGrossSales() * commissionRate;
        //****************************************
        //利用getGrossSales()計算薪資
        //****************************************
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
    

