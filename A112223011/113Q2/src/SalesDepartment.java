import java.util.Scanner;

public class SalesDepartment {
    public  static void main(String args[]) {
        SalesPerson[] salesTeam = new SalesPerson[3];
        SalesPerson sales1 = new SalesPerson("SE111", "林俊傑");
        SalesPerson sales2 = new SalesPerson("SE222", "張佳豪");
        SalesPerson sales3 = new SalesPerson("SE333", "劉威廷");
        salesTeam[0] = sales1;
        salesTeam[1] = sales2;
        salesTeam[2] = sales3;
        operation(salesTeam);
    }

    public static void operation(SalesPerson[] salesTeam) {
        SalesPerson targetSales;
        Scanner input = new Scanner(System.in);
        menu();

        while (input.hasNext()) {
            int choice = input.nextInt();
            try {
                switch (choice) {
                    case 1:
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.print("請輸入銷售金額： ");
                            double salesAmount = input.nextDouble();
                            targetSales.setGrossSales(salesAmount);
                        }
                        break;
                    case 2:
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.print("請輸入獎金比例： ");
                            double bonusRate = input.nextDouble();
                            targetSales.setCommissionRate(bonusRate);
                        }
                        break;
                    case 3:
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null)
                            System.out.printf("薪資： %.1f%n", targetSales.salary());
                        break;
                    default:
                        System.out.println("選項錯誤，請重新輸入");
                        break;
                    //?????????????????????????????
                    //?????????????????????????????
                    //?????????????????????????????
                    //?????????????????????????????
                    //?????????????????????????????
                }
            }
            catch (IllegalArgumentException ex) {
                System.out.println("輸入錯誤，請重試");
            }
            menu();
        }
        for (SalesPerson s : salesTeam)
            System.out.print(s.toString());
    }

    public static SalesPerson selectedSales(SalesPerson[] salesTeam) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入編號： ");
        String salesID = input.next();

        for (SalesPerson sales : salesTeam) {
            if (sales.getId().equals(salesID)) {
                return sales;
            }
        }
        //?????????????????????????????
        //從salesTeam陣列中，搜尋與輸入salesID
        //相同的sales物件，並回傳該物件
        //?????????????????????????????

        System.out.println("編號輸入錯誤");
        return null;
    }

    public static void menu() {
        System.out.println("\n\nROC股份有限公司：");
        System.out.print("1.設定銷售金額\n2.設定獎金比例\n3.薪資查詢\n請輸入： ");
    }
}