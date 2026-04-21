

 class Hitung {
    int tambah(int a, int b) {
        return a + b;
    }

    double tambah(double a, double b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }
}

public class HitungBeraksi {
    public static void main(String[] args) {
        Hitung hitung = new Hitung();

        System.out.println("Pertambahan 2 angka (int): " + hitung.tambah(5, 3));
        System.out.println("Pertambahan 2 angka (double): " + hitung.tambah(5.5, 3.3));
        System.out.println("Pertambahan 3 angka (int): " + hitung.tambah(1, 2, 3));
    }
}