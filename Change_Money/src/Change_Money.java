import java.util.Scanner;

public class Change_Money {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền bạn muốn quy đổi : ");
        usd = sc.nextDouble();
        double quydoi = vnd * usd;
        System.out.println("Số tiền của bạn thu được là : " + quydoi);

    }
}
