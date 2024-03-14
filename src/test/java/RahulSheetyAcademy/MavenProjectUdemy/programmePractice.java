package RahulSheetyAcademy.MavenProjectUdemy;

public class programmePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// fabonacci
		/*
		 * int n1 = 0, n2 = 1, n3; System.out.print(n1 + " " + n2); for (int i = 2; i <
		 * 10; ++i) { n3=n1+n2; System.out.print(" "+n3); n1=n2; n2=n3; }
		 */

		// prime number
		// 0 and 1 is not prime no.
		// number n
		// divide by 2,3,4 reminder = 0> not prime
		// and
		// divided by same number reminder is 0
		/*
		 * int i, m=0; // int n = 100;
		 *
		 * Scanner sc= new Scanner(System.in); System.out.println("enter no");
		 *
		 * int n=sc.nextInt(); int flag = 0; m=n/2; if (n == 0 || n == 1) {
		 * System.out.println(n + " Number is not prime"); } else { for (i = 2; i <=m;
		 * i++) if (n % i == 0) { System.out.println(n + " Number is not prime"); flag =
		 * 1; break; } } if (flag == 0) { System.out.println(n + " Number is  prime");
		 *
		 * }
		 */

		// pallindrome
		// number 343
		// take reminder 1st > 3
		// 2nd > 4 >1st *10+2nd >34
		// , 3rd > 3 > 2nd total *10+3rd >final
		/*
		 * int r, sum = 0; int n = 5651; int temp = n; while (n > 0) { r = n % 10; sum =
		 * (sum * 10) + r; n = n / 10; } if (temp == sum)
		 * System.out.println("palindrome number "); else
		 * System.out.println("not palindrome");
		 */

		// factproa;
		// number n
		// n-1
		// n *n-1 > a
		// n-2 * a
		/*
		 * int n=5; int factor =1; int m=0; for(int i=1;i<=n;i++) {
		 *
		 * factor=factor*i; } System.out.println(factor);
		 */

		// armstrong nu
		// n
		// n%10 and n/10
		// r*r +r*r +----

		/*
		 * int r; int add = 0; int n = 153; int temp=n; while(temp>0) { r = temp % 10;
		 * temp = temp / 10; add = (r *r*r) + add; } if (add == n) {
		 * System.out.println("yes");} else System.out.println("not");
		 */

		/*
		 * //star pattern int n=4; for(int i=0;i<n;i++) { for(int j=0;j<=i;j++) {
		 * System.out.print("* "); } System.out.println(); } System.out.println(); int
		 * m=4; for(int i=m-1;i>=0;i--) { for(int j=0;j<=i;j++) {
		 * System.out.print("* "); } System.out.println(); }
		 */

		/*
		 * int rowCount = 6; for (int i = 0; i < rowCount; i++) { int spaceCount =
		 * (rowCount - (i)); //System.out.println(spaceCount + "space"); for (int j = 0;
		 * j < spaceCount-1; j++) { // System.out.print(" space print " + j );
		 * System.out.print(" "); } int starCount = rowCount - spaceCount+1 ;
		 * //System.out.println(starCount + "star"); for (int k = 0; k < starCount; k++)
		 * { // System.out.print(" star print " + k); System.out.print("*"); }
		 * System.out.println(""); }
		 */

		// reverse no
		/*
		 * int n=4567; int temp=0; while(n>0) { int r=n%10; temp= temp*10 +r; n=n/10; }
		 * System.out.println(temp);
		 */

		// Peterson Number
		// n
		// last digit and fact
		// 2ndlast and fact + prev
		// ----

		// atm programm
		/*
		 * int balance=10000, withdraw, deposit;
		 *
		 * Scanner sc = new Scanner(System.in);
		 *
		 * while(true) { System.out.println("Automated Teller Machine");
		 * System.out.println("Choose 1 for Withdraw");
		 * System.out.println("Choose 2 for Deposit");
		 * System.out.println("Choose 3 for Check Balance");
		 * System.out.println("Choose 4 for EXIT");
		 * System.out.print("Choose the operation you want to perform:");
		 *
		 * System.out.println("enter choice"); int choice= sc.nextInt(); switch (choice)
		 * { case 1: System.out.println("enter amount to withdraw");
		 * withdraw=sc.nextInt(); if(withdraw<=balance) {
		 * System.out.println("witdrwas succsss"); balance=balance-withdraw;
		 * System.out.println(" ");
		 *
		 * } else { System.out.println("insuffi bala"); System.out.println(" ");
		 *
		 * } break;
		 *
		 * case 2: System.out.println("enter amount to Deposit"); deposit=sc.nextInt();
		 * balance=balance+deposit; System.out.println(" "); break;
		 *
		 * case 3: //System.out.println("enter amount to chekc balance");
		 * System.out.println("bal is= "+balance); System.out.println(" ");
		 *
		 * break; case 4: //System.out.println("enter to exit");
		 * System.out.println(" ");
		 *
		 * System.exit(0);
		 *
		 * } }
		 */

		// largest number
		/*
		 * int a, b, c, d; Scanner sc = new Scanner(System.in);
		 *
		 * System.out.println("enter first number"); a = sc.nextInt();
		 *
		 * System.out.println("enter 2nd number"); b = sc.nextInt(); if (a > b) {
		 *
		 * System.out.println("enter 3rd number"); c = sc.nextInt(); if (a > c) {
		 * System.out.println(" a is greater"); } else
		 * System.out.println(" c is greater"); } else {
		 * System.out.println("enter 3rd number"); c = sc.nextInt(); if (b > c) {
		 * System.out.println(" b is greater"); } else
		 * System.out.println(" c is greater"); }
		 */

		// smallest no
		/*
		 * int a, b, c, temp,small; Scanner sc = new Scanner(System.in);
		 * System.out.println("enter first number"); a = sc.nextInt();
		 * System.out.println("enter 2d number"); b = sc.nextInt();
		 * System.out.println("enter 3rd number"); c = sc.nextInt(); temp=a<b?a:b;
		 * small=c<temp?c:temp; System.out.println("The largest number is: "+small);
		 */

		// array
		// array copy
		/*
		 * int arr1[] = new int[] { 1, 2, 3, 4, 5 }; int[] arr2 = new int[arr1.length];
		 * for (int i = 0; i < arr1.length; i++) { arr2[i] = arr1[i]; }
		 * System.out.println("array of 1 is"); for (int i = 0; i < arr1.length; i++) {
		 * System.out.print(arr1[i] + " "); } System.out.println();
		 * System.out.println("arry of 2nd is"); for (int i = 0; i < arr2.length; i++) {
		 * System.out.print(arr2[i] + " "); }
		 */

		// practce
		/*
		 * int n=4156514, r=0, sum=0; int temp=n;
		 *
		 * while(n>0) {
		 *
		 * r=n%10; //4 sum=sum*10+r; // n=n/10; } if(temp==sum) {
		 * System.out.println("pal"); } else { System.out.println("not");
		 *
		 * }
		 */
		/*
		 * int i, n = 5, fact = 1;
		 *
		 * for (i = 1; i <= n; i++) {
		 *
		 * fact = fact * i; } System.out.println(fact);
		 */
		/*
		 * int i, flag = 0; int n = 111; if (n == 0 || n == 1) {
		 * System.out.println("not prime"); } else {for (i = 2; i <= n/2; i++) { if (n %
		 * i == 0) { System.out.println("not"); flag = 1; break; } } if(flag==0) {
		 * System.out.println("prime"); } }
		 */

}}