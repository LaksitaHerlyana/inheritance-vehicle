import java.util.Scanner;

public class vehicledriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan yang ingin Anda masukkan:");
        System.out.println("1. Mobil");
        System.out.println("2. Sepeda");
        System.out.print("Pilihlah Anda (1/2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("1. Mobil Biasa");
            System.out.println("2. Mobil Convertible");
            System.out.print("Pilihlah Anda (1/2): ");
            int carChoice = scanner.nextInt();

            if (carChoice == 1) {
                System.out.println("Masukkan detail Mobil Biasa:");
                System.out.print("Harga: ");
                double carPrice = scanner.nextDouble();

                System.out.println("Ingin diskon? (true/false): ");
                boolean wantDiscount = scanner.nextBoolean();
                double discountPrice = carPrice;

                if (wantDiscount) {
                    System.out.print("Masukkan persentase diskon: ");
                    double carDiscount = scanner.nextDouble();
                    discountPrice = carPrice - (carPrice * carDiscount / 100);
                }

                System.out.println("Detail Mobil:");
                System.out.println("Harga setelah diskon: " + discountPrice);
            } else if (carChoice == 2) {
                System.out.println("Masukkan detail Mobil Convertible:");
                System.out.print("Harga: ");
                double carPrice = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Roof type (hard/soft): ");
                String roofType = scanner.nextLine();

                System.out.println("Ingin diskon? (true/false): ");
                boolean wantDiscount = scanner.nextBoolean();
                double discountPrice = carPrice;

                if (wantDiscount) {
                    System.out.print("Masukkan persentase diskon: ");
                    double carDiscount = scanner.nextDouble();
                    discountPrice = carPrice - (carPrice * carDiscount / 100);
                }

                System.out.println("Detail Mobil Convertible:");
                System.out.println("Roof type: " + roofType);
                System.out.println("Harga setelah diskon: " + discountPrice);
            } else {
                System.out.println("Pilihan jenis mobil tidak valid.");
            }
        } else if (choice == 2) {
            System.out.println("Masukkan detail Sepeda:");
            System.out.print("Jumlah roda: ");
            int numWheels = scanner.nextInt();
            System.out.print("Harga: ");
            double bikePrice = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Tipe sepeda (Gunung/Balai Raya): ");
            String bikeType = scanner.nextLine();

            System.out.println("Ingin diskon? (true/false): ");
            boolean wantDiscount = scanner.nextBoolean();
            double discountPrice = bikePrice;

            if (wantDiscount) {
                System.out.print("Masukkan persentase diskon: ");
                double bikeDiscount = scanner.nextDouble();
                discountPrice = bikePrice - (bikePrice * bikeDiscount / 100);
            }

            System.out.println("Detail Sepeda:");
            System.out.println("Tipe: " + bikeType);
            System.out.println("Jumlah roda: " + numWheels);
            System.out.println("Harga setelah diskon: " + discountPrice);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
