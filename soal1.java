public class soal1 {
    public static void main(String[] args) {
  java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Masukkan angka: ");
  int angka = scanner.nextInt();
    System.out.println(angka % 2 == 0 ? "Genap" : "Ganjil");

    if (angka > 0) {
        System.out.println("Positif");
    } else if (angka < 0) {
        System.out.println("Negatif");
    } else {
        System.out.println("Nol");
    }
    System.out.print("Masukkan nilai: ");
    int nilai = scanner.nextInt();

    String grade = nilai >= 85 ? "A"
      : nilai >= 70 ? "B"
      : nilai >= 55 ? "C"
      : "D";

    String status = nilai >= 55 ? "Lulus" : "Tidak Lulus";

    System.out.println("Grade: " + grade);
    System.out.println("Status: " + status);

    System.out.print("Masukkan angka 1–7: ");
    int angkaHari = scanner.nextInt();

switch (angkaHari) {
  case 1: System.out.println("Senin"); break;
  case 2: System.out.println("Selasa"); break;
  case 3: System.out.println("Rabu"); break;
  case 4: System.out.println("Kamis"); break;
  case 5: System.out.println("Jumat"); break;
  case 6: System.out.println("Sabtu"); break;
  case 7: System.out.println("Minggu"); break;
  default: System.out.println("Angka tidak valid");
}

System.out.print("Masukkan angka pertama: ");
double angka1 = scanner.nextDouble();
System.out.print("Masukkan operator (+, -, *, /, %): ");
String operator = scanner.next();
System.out.print("Masukkan angka kedua: ");
double angka2 = scanner.nextDouble();

switch (operator) {
    case "+":
        System.out.println("Hasil: " + (angka1 + angka2));
        break;
    case "-":
        System.out.println("Hasil: " + (angka1 - angka2));
        break;
    case "*":
        System.out.println("Hasil: " + (angka1 * angka2));
        break;
    case "/":
    case "%":
        if (angka2 == 0) {
            System.out.println("Error: tidak boleh membagi atau menggunakan modulus dengan nol.");
        } else if (operator.equals("/")) {
            System.out.println("Hasil: " + (angka1 / angka2));
        } else {
            System.out.println("Hasil: " + (angka1 % angka2));
        }
        break;
    default:
        System.out.println("Operator tidak valid.");
}

System.out.print("Masukkan sisi pertama: ");
double sisi1 = scanner.nextDouble();
System.out.print("Masukkan sisi kedua: ");
double sisi2 = scanner.nextDouble();
System.out.print("Masukkan sisi ketiga: ");
double sisi3 = scanner.nextDouble();

if (sisi1 <= 0 || sisi2 <= 0 || sisi3 <= 0 ||
    sisi1 + sisi2 <= sisi3 ||
    sisi1 + sisi3 <= sisi2 ||
    sisi2 + sisi3 <= sisi1) {
    System.out.println("Bukan segitiga");
} else if (sisi1 == sisi2 && sisi2 == sisi3) {
    System.out.println("Segitiga sama sisi");
} else if (sisi1 == sisi2 || sisi1 == sisi3 || sisi2 == sisi3) {
    System.out.println("Segitiga sama kaki");
} else {
    System.out.println("Segitiga sembarang");
}
      
}
}



