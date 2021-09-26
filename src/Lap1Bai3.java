import java.util.Scanner;

public class Lap1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Chiều dài cạnh: ");
            double canh = scanner.nextDouble();
            double dienTich = Math.pow(canh, 3);
            System.out.printf("Diện tích là: %.1f", dienTich);
        }
        finally{scanner.close();}
    }
}
