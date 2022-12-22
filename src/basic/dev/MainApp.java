package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Phần 1
		System.out.println("***Phan 1***");
		System.out.println("nhap vao ho va ten");
		String hoVaTen = sc.nextLine();
		System.out.println("nhap vao nam sinh");
		int namSinh = sc.nextInt();
		System.out.println("nhap vao diem toan");
		int toan = sc.nextInt();
		System.out.println("nhap vao diem ly");
		int ly = sc.nextInt();
		System.out.println("nhap vao diem van");
		int van = sc.nextInt();

		print(hoVaTen, namSinh);
		diemTrungBinh(toan, ly, van);

		System.out.println("nhap vao c");
		double d = sc.nextDouble();
		System.out.println("nhap vao d");
		double f = sc.nextDouble();

		System.out.println("nhap vao so nguyen a");
		int a = sc.nextInt();
		System.out.println("nhap vao so nguyen b");
		int b = sc.nextInt();
		System.out.println("nhap vao so nguyen c");
		int c = sc.nextInt();

		dienTichChuViHCN(a, b);
		tong(a, b);
		hieu(a, b);
		tich(a, b);
		thuong(a, b);
		max(a, b, c);
		min(a, b, c);
		tong(a, b, c);
		chiaHet(a, b);

		// Phần 2
		System.out.println("***Phan 2***");
		System.out.println("nhap vao so nguyen n");
		int n = sc.nextInt();

		chanLe(n);
		print(n);
		chiaHet(n);
		tong(n);
		tinhP(n);
		thang(n);
		// Phần 3
		System.out.println("***Phan 3***");
		tong(a, b);
		hieu(a, b);
		tinhP(n);
		tinhTongChanLe(n);
		tongBeHonN(n);
	}

	private static void tongBeHonN(int n) {
		int tongN = 0;
		for (int i = 0; i < n; i++) {
			tongN += i;
		}
		System.out.println("tong cac so be hon n = " + tongN);
	}

	private static void tinhTongChanLe(int n) {
		int tongChan = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				tongChan += i;
			}
		}
		System.out.println("tong cac so chan = " + tongChan);
		int tongLe = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				tongLe += i;
			}
		}
		System.out.println("tong cac so le = " + tongLe);
	}

	private static void thang(int n) {
		switch (n) {
		case 1:
			System.out.println("day la thang mot");
			break;
		case 2:
			System.out.println("day la thang hai");
			break;
		case 3:
			System.out.println("day la thang ba");
			break;
		case 4:
			System.out.println("day la thang bon");
			break;
		case 5:
			System.out.println("day la thang nam");
			break;
		case 6:
			System.out.println("day la thang sau");
			break;
		case 7:
			System.out.println("day la thang bay");
			break;
		case 8:
			System.out.println("day la thang tam");
			break;
		case 9:
			System.out.println("day la thang chin");
			break;
		case 10:
			System.out.println("day la thang muoi");
			break;
		case 11:
			System.out.println("day la thang muoi mot");
			break;
		case 12:
			System.out.println("day la thang muoi hai");
			break;
		default:
			System.out.println("n khong hop le");
			break;
		}
	}

	private static void tinhP(int n) {
		int p = 1;
		for (int i = 1; i <= n; i++) {
			p *= i;
		}
		System.out.println("p = 1*2*3*...*n = " + p);
	}

	private static void tong(int n) {
		System.out.println();
		double s = 1;
		for (int i = 2; i <= n; i++) {
			s += 1.0 / i;
		}
		System.out.println("s =1+1/2+1/3+...+1/n = " + s);
	}

	private static void chiaHet(int n) {
		System.out.println();
		if (n % 5 == 0) {
			System.out.format("%d chia het cho 5", n);
		} else {
			System.out.format("%d khong chia het cho 5", n);
		}
	}

	private static void print(int n) {
		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.print("1=>n" + i + " ");
		}
	}

	private static void chanLe(int n) {
		if (n % 2 == 0) {
			System.out.format("%d la so chan", n);
		} else {
			System.out.format("%d la so le", n);
		}
	}

	private static void chiaHet(int a, int b) {
		if (a % b == 0) {
			System.out.println("a chia het cho b");
		} else {
			System.out.println("a khong chia het cho b");
		}
		if (b % a == 0) {
			System.out.println("b chia het cho a");
		} else {
			System.out.println("b khong chia het cho a");
		}
	}

	private static void max(int a, int b, int c) {
		if (a >= b && a >= c) {
			System.out.println("max = " + a);
		} else if (b >= a && b >= c) {
			System.out.println("max = " + b);
		} else {
			System.out.println("max = " + c);
		}
	}

	private static void min(int a, int b, int c) {
		if (a <= b && a <= c) {
			System.out.println("max = " + a);
		} else if (b <= a && b <= c) {
			System.out.println("max = " + b);
		} else {
			System.err.println("max = " + c);
		}
	}

	private static void tong(int a, int b, int c) {
		System.out.println("tong = " + (a + b + c));
	}

	private static void tong(double a, double b) {
		System.out.println("tong = " + (a + b));
	}

	private static void hieu(double a, double b) {
		System.out.println("hieu = " + (a - b));
	}

	private static void tich(double a, double b) {
		System.out.println("tich = " + (a * b));
	}

	private static void thuong(double a, double b) {
		System.out.println("thuong = " + (a / b));
	}

	private static void dienTichChuViHCN(double d, double f) {
		System.out.println("dien tich cua hinh chu nhat s = " + (d * f));
		System.out.println("chu vi cua hinh chu nhat p = " + ((d + f) * 2));
	}

	private static void diemTrungBinh(int toan, int ly, int van) {
		System.out.println("diem trung binh cua 3 mon = " + (toan + van + ly) / 3);

	}

	private static void print(String hoVaTen, int namSinh) {
		System.out.println("ho va ten: " + hoVaTen);
		System.out.println("tuoi: " + (2022 - namSinh));
	}

}