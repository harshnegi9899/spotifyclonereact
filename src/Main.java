import java.util.*;

public class Main {
	// public static int checknumber(int a) {
	// // int x[0]=0;

	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int[] number = new int[a];

		for (int i = 0; i < a; i++) {
			number[i] = sc.nextInt();
		}

		boolean isAscending = true;

		for (int i = 0; i < number.length - 1; i++) {

			if (number[i] > number[i + 1]) {

				isAscending = false;

			}
		}
		if (isAscending) {
			System.out.println("the array is sprted in ascendig order");
		} else {
			System.out.println("the array is not sorted in ascending order");
		}
		// int[] number = new int[a];

		// for (int i = 0; i < a; i++) {
		// number[i] = sc.nextInt();
		// }

		// int max = Integer.MIN_VALUE;
		// int min = Integer.MAX_VALUE;

		// for (int i = 0; i < number.length; i++) {
		// if (number[i] < min) {
		// min = number[i];

		// }
		// if (number[i] > max) {
		// max = number[i];
		// }

		// }
		// System.out.println("the smallest number is" + min);

		// System.out.println("the largest number is" + max);

		// String[] names = new String[a];

		// for (int i = 0; i < a; i++) {
		// names[i] = sc.next();
		// }

		// for (int i = 0; i < names.length; i++) {
		// System.out.println("name of " + (i + 1) + "is " + names[i]);
		// }

		// Scanner scn = new Scanner(System.in);
		// int yahoo = scn.nextInt();
		// int[] google = new int[yahoo];

		// for (int i = 0; i < yahoo; i++) {
		// google[i] = scn.nextInt();
		// }

		// int x = scn.nextInt();
		// for (int i = 0; i < google.length; i++) {
		// if (google[i] == x) {
		// System.out.println("the index of this element is" + i);
		// }

	}

	// int x = 0;
	// int y = 1;
	// System.out.println(x + " ");

	// if (a > 1) {
	// for (int i = 2; i <= a; i++) {
	// System.out.println(y + "");
	// int temp = y;
	// y = x + y;
	// x = temp;
	// }
	// }

	// int countp = 0;
	// int countn = 0;
	// int countz = 0;
	// if (a > 0) {
	// for (int i = 0; i <= a; i++) {
	// countp++;
	// if (i == 0) {
	// countz++;
	// }

	// }

	// System.out.println(countp);

	// System.out.println(countz);

	// } else if (a < 0) {
	// for (int i = -1; i >= a; i--) {
	// countn++;
	// }
	// System.out.println(countn);
	// }

	// int sum = 0;
	// sum = (a + b + c) / 3;
	// System.out.println(sum);

	// for (int i = a; i <= a; i++) {
	// if (a % 2 == 0) {
	// System.out.println("even number");
	// } else {
	// System.out.println("odd number");
	// }
	// }
	// int count = 0;
	// for (int i = 2; i < a; i++) {
	// if (a % i == 0) {
	// // System.out.print("not prime");
	// count++;

	// }

	// }
	// if (count != 0) {
	// System.out.println("not prime");
	// } else {
	// System.out.println("prime");
	// }
	// int x = calculatefactorial(a);
	// System.out.print("the factorial of a is " + factorial);

	// int n = scn.nextInt();

	// for (int i = 1; i <= n; i++) {
	// for (int j = 1; j <= n - i; j++) {
	// System.out.print(" ");
	// }
	// for (int j = 1; j <= 2 * i - 1; j++) {
	// System.out.print("*");
	// }

	// System.out.println();
	// }
	// for (int i = n; i >= 1; i--) {
	// for (int j = 1; j <= n - i; j++) {
	// System.out.print(" ");
	// }
	// for (int j = 1; j <= 2 * i - 1; j++) {
	// System.out.print("*");
	// }

	// System.out.println();
	// }

	// for (int i = 1; i <= n; i++) {
	// for (int j = 1; j < n - i; j++) {
	// System.out.print(" ");
	// }
	// for (int j = 1; j <= i; j++) {
	// System.out.print(i + i - 1);
	// }
	// System.out.println();
	// }

	// for (int i = 1; i <= n; i++) {
	// for (int j = 0; j <= n - i; j++) {
	// System.out.print(" ");
	// }
	// for (int j = 2; j <= n - i; j++) {
	// System.out.print(" ");
	// }
	// for (int j = 1; j <= n; j++) {
	// System.out.print("*");
	// }
	// System.out.println();
	// }

	// for (int i = 1; i < n; i++) {
	// for (int j = 1; j <= i; j++) {
	// System.out.print("*");
	// }
	// int spaces = n = i;
	// for (int j = 1; j < spaces; j++) {
	// System.out.print(" ");
	// }

	// System.out.println();
	// }

	// for (int i = 1; i <= n; i++) {
	// for (int j = 1; j <= i; j++) {
	// System.out.print("*");
	// }

	// int spaces = 2 * (n - i);
	// for (int j = 1; j <= spaces; j++) {
	// System.out.print(" ");
	// }

	// for (int j = 1; j <= i; j++) {
	// System.out.print("*");
	// }
	// System.out.println();
	// }

	// for (int i = n; i >= 1; i--) {
	// for (int j = 1; j <= i; j++) {
	// System.out.print("*");
	// }

	// int spaces = 2 * (n - i);
	// for (int j = 1; j <= spaces; j++) {
	// System.out.print(" ");
	// }

	// for (int j = 1; j <= i; j++) {
	// System.out.print("*");
	// }
	// System.out.println();
	// }

	// int number = 1;

	// for (int i = 1; i <= n; i++) {

	// // for (int j = 1; j <= n - i; j++) {
	// // System.out.print(" ");
	// // }3
	// for (int j = 1; j <= i; j++) {
	// if ((i + j) % 2 == 0) {
	// System.out.print("1");
	// } else {
	// System.out.print("0");
}

// System.out.println();
// }

// for (int i = 1; i < n; i++) {
// for (int j = 1; j < n; j++) {
// System.out.print("*");

// }
// System.out.println();
// }

// for (int i = 2; i < n; i++) {
// if (n % i == 0) {
// // System.out.println("not prime");
// count++;
// }
// }
// if (count != 0) {
// System.out.println("not prime");
// } else {
// System.out.println(" prime");
// }

// }

// int x = fibonacci(n);
// System.out.println(x);
// }

// public static int fibonacci(int n) {
// if (n == 0 || n == 1) {
// return n;
// } else {
// return ((fibonacci(n - 2) * fibonacci(n - 2)) - fibonacci(n - 1));
// }
// }
// }
// int m= 1;
// int a = 1;
// for (int i = 3; i < n; i++){
// f(i)=f(i-1)+f(i-2);

// }

// int count = 0;
// int x = countnumber(n, count);
// System.out.print(x);

// }

// public static int countnumber(int n, int c) {
// if (n == 0) {
// return c;
// } else {
// return countnumber(n / 10, c + 1);

// }

// printnumber(n);
// }

// public static void printnumber(int n) {
// if (n == 0) {
// return;
// } else {
// System.out.println(n);
// printnumber(n - 1);
// }

// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = scn.nextInt();
// }

// int a = scn.nextInt();

// int count =0;

// int x =counttd(a);
// System.out.println(x);

// }
// public static int counttd(int a){
// if ( a==0){
// return 0;
// }
// else{
// return 1+ counttd(a);
// }

// }
// }

// int k = scn.nextInt();

// boolean x = setbit(a, k);
// System.out.println(x);

// printnos(a);

// }

// public static void printnos(int a) {
// if (a == 0) {
// return;
// } else {
// printnos(a - 1);
// // System.out.println(a);
// }
// System.out.println(a);
// }

// public static boolean setbit(int a, int k) {
// if ((a & (1 << k)) != 0) {
// return true;
// } else {
// return false;
// }
// }
// }

// int count = 0;

// for (int i = 2; i < a; i++) {
// if (a % i == 0) {
// // System.out.println("not prime");
// count++;
// }

// }
// if (count != 0) {
// System.out.println("not prime");
// } else {
// System.out.println("prime");
// }

// do {
// System.out.println(a);
// int b = scn.nextInt();
// if (b >= 89) {
// System.out.println("good");
// } else if (b <= 89 && b >= 60) {
// System.out.println("average");
// } else if (b <= 60 && b >= 30) {
// System.out.println("htt bhsdk");
// } else {
// System.out.println("stop");

// }

// } while (a == 1);

// }

// if (a == 1) {
// int b = scn.nextInt();
// if (b >= 90) {
// System.out.println("very good");
// } else if (b <= 89 && b >= 60) {
// System.out.println("good");
// } else if (b <= 60 && b >= 30) {
// System.out.println("still good because marks doesnt matter");
// }
// } else {
// System.out.println("stop");
// }

// for (int i = 1; i <= a; i++) {
// if (i % 2 == 0) {
// System.out.println(i);

// }
// }

// int sum = 0;

// for (int i = 0; i <= a; i++) {
// sum += i;
// }
// 1
// int b = scn.nextInt();

// int c = scn.nextInt();

// switch (c) {
// case 1:
// System.out.println(a + b);
// break;
// case 2:
// System.out.println(a - b);
// break;
// case 3:
// System.out.println(a * b);
// break;
// case 4:
// System.out.println(a / b);
// break;
// case 5:
// System.out.println(a % b);
// break;

// }

// if (c == 1) {
// System.out.println(a + "+" + b + "=" + (a + b));
// } else if (c == 2) {
// System.out.println(a + "-" + b + "=" + (a - b));
// } else if (c == 3) {
// System.out.println(a + "*" + b + "=" + (a * b));
// } else if (c == 4) {
// System.out.println(a + "/" + b + "=" + (a / b));
// } else if (c == 5) {
// System.out.println(a + "%" + b + "=" + (a % b));
// } else {
// System.out.println("invalid");
// }

// if (a % 2 == 0) {
// System.out.println("even");
// } else {
// System.out.println("odd");
// }

// if (age > 18) {
// System.out.println("eligible to give vote");
// } else {
// System.out.println("not eligible");
// }

// for (int i = 0; i <= 10; i++) {
// System.out.println(r + "*" + i + "=" + r * i);

// }

// double pi = 3.14159;
// double area = pi * r * r;5
// System.out.println(area);
// int nod = 0;
// int temp = n;
// while (temp != 0) {
// temp = temp / 10;
// nod++;
// }
// int div = (int) Math.pow(10, nod - 1);
// while (div != 0) {
// int q = n / div;
// System.out.println(q);

// n = n % div;
// div = div / 10;
// }

// public static void printnos(int a) {
// if (a == 0) {
// return;
// } else {
// printnos(a - 1);
// System.out.println(a);
// }
// }
// }
// Java program to print table of a number
// using recursion
// import java.util.*;

// class GFG {

// // print_table() prints table of number and takes
// // 1 required value that is number of whose teble to be
// // printed and an optional input i whose default value
// // is
// // 1
// static void print_table(int n, Integer... val) {
// int i = 1;
// if (val.length != 0)
// i = val[0];
// if (i == 11) // base case
// return;
// System.out.println(n + " * " + i + " = " + n * i);
// i++; // increment i
// print_table(n, i);
// }

// public static void main(String[] args) {
// int n = 5;
// print_table(n);
// }
// }

// This code is contributed by phasing17
