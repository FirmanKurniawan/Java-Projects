import java.util.Scanner;

public class Math extends Thread{
	int score = 0; 
	Scanner obj = new Scanner(System.in);
	
	public void Quiz(){
		int x = 12;
		int y = 12;
		Integer input;
		int ans;
		
		System.out.print(x + " + " + y + " = ");
		input = obj.nextInt();
		ans = x + y;
		
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score);
			System.exit(0);
		}
		
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		
		System.out.println();
	
	}
	
	
	

	public void Quiz2() {
		
		int x = 20;
		int y = 18;
		Integer input;
		int ans;
		
		System.out.print(x + " - " + y + " = ");
		input = obj.nextInt();
		ans = x - y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+1);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
	}
	
	
	public void Quiz3() {
		int x = 8;
		int y = 2;
		Integer input;
		int ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextInt();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+2);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
		
	}
	
	
	public void Quiz4() {
		int x = 90;
		int y = 10;
		Integer input;
		int ans;
		
		System.out.print(x + " + " + y + " = ");
		input = obj.nextInt();
		ans = x + y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+3);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
		
	}
	
	
	public void Quiz5() {
		double x = 9.2;
		double y = 5.3;
		double input;
		double ans;
		
		System.out.print(x + " + " + y + " = ");
		input = obj.nextDouble();
		ans = x + y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+4);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
		
	}
	
	
	
	public void Quiz6() {
		double x = 91.4;
		double y = 2.3;
		double input;
		double ans;
		
		System.out.print(x + " + " + y + " = ");
		input = obj.nextDouble();
		ans = x + y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+5);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
		
	}
	
	
	
	public void Quiz7() {
		double x = 8.6;
		double y = 3.3;
		double input;
		double ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextDouble();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+6);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
		
	}
	
	
	
	public void Quiz8() {
		double x = 2.5;
		double y = 1.3;
		double input;
		double ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextDouble();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+7);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
		
	}
	
	
	
	public void Quiz9() {
		double x = 11.6;
		double y = 2.2;
		double input;
		double ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextDouble();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+8);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
		
	}
	
	
	
	public void Quiz10() {
		double x = 6.2;
		double y = 2.2;
		double input;
		double ans;
		
		System.out.print(x + " + " + y + " = ");
		input = obj.nextDouble();
		ans = x + y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+9);
			System.exit(0);;
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
		
	}
	
	
	
	public void Quiz11() {
		int  x = 2;
		int y = 2;
		int input;
		int ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextInt();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+10);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println();
		
	}
	
	
	
	public void Quiz12() {
		int x = 2;
		int y = 2;
		int input;
		int ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextInt();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+11);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println();
	}
	
	
	
	public void Quiz13() {
		int x = 2;
		int y = 90;
		int input;
		int ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextInt();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+12);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println();
	}
	
	
	
	public void Quiz14() {
		int x = 0;
		int y = 500;
		int input;
		int ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextInt();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+13);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println();
	}
	
	
	
	
	public void Quiz15() {
		int x = 2;
		int y = 4;
		int input;
		int ans;
		
		System.out.print(x + " + " + y + " = ");
		input = obj.nextInt();
		ans = x + y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+14);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println(); 
	}
	/*
	 * WAVE2
	 */
	
	public void Quiz16() {
		int x = 600;
		int y = 400;
		int input;
		int ans;
		
		System.out.print(x + " + " + y + " = ");
		input = obj.nextInt();
		ans = x + y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+15);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println(); 
	}
	
	
	
	public void Quiz17() {
		int x = 15;
		int y = 15;
		int input;
		int ans;
		
		System.out.print(x + " + " + y + " = ");
		input = obj.nextInt();
		ans = x + y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+16);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println(); 
	}
	
	
	
	public void Quiz18() {
		int x = 2;
		int y = 1;
		int input;
		int ans;
		
		System.out.print(x + " + " + y + " = ");
		input = obj.nextInt();
		ans = x + y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+17);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println(); 
	}
	
	

	public void Quiz19() {
		int x = 2;
		int y = 16;
		int input;
		int ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextInt();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+18);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println(); 
	}
	
	
	
	public void Quiz20() {
		int x = 200;
		int y = 4;
		int input;
		int ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextInt();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+19);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println(); 
	}
	
	
	
	public void Quiz21() {
		int x = 12;
		int y = 6;
		int input;
		int ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextInt();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+20);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println(); 
	}
	
	
	
	public void Quiz22() {
		int x = 4;
		int y = 4;
		int input;
		int ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextInt();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+21);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println(); 
	}
	
	
	
	public void Quiz23() {
		double x = 2.2;
		double y = 4.1;
		double input;
		double ans;
		
		System.out.print(x + " x " + y + " = ");
		input = obj.nextDouble();
		ans = x * y;
		if(input == ans) {
			System.out.println("Correct");
		}
		else if(input != ans){
			System.out.println("Wrong");
			obj.close();
			System.out.println("Total score: " + score+22);
			System.exit(0);
		}
		else{
			System.out.println("invalid input");
			System.exit(0);
		}
		
		System.out.println("Congratulations, you've won"); 
	}
	
	

	
	
	public static void main(String [] args){
		Math x1 = new Math();
		x1.Quiz();
		x1.Quiz2();
		x1.Quiz3();
		x1.Quiz4();
		x1.Quiz5();
		x1.Quiz6();
		x1.Quiz7();
		x1.Quiz8();
		x1.Quiz9();
		x1.Quiz10();
		x1.Quiz11();
		x1.Quiz12();
		x1.Quiz13(); 
		x1.Quiz14();
		x1.Quiz15();
		
		/////Descending Order/////
		Math a = new Math();
		a.Quiz15();
		a.Quiz14();
		a.Quiz13();
		a.Quiz12();
		a.Quiz11();
		a.Quiz10();
		a.Quiz9();
		a.Quiz8();
		a.Quiz7();
		a.Quiz6();
		a.Quiz5();
		a.Quiz4();
		a.Quiz3();
		a.Quiz2();
		a.Quiz();
		
	/////Mixed Order/////
		Math b = new Math();
		b.Quiz15();
		b.Quiz();
		b.Quiz14();
		b.Quiz2();
		b.Quiz13();
		b.Quiz3();
		b.Quiz12();
		b.Quiz4();
		b.Quiz11();
		b.Quiz5();
		b.Quiz10();
		b.Quiz6();
		b.Quiz9();
		b.Quiz7();
		b.Quiz8();
///////////////////////////////////////////////////////
		
	/////WAVE2 -- Ascending Order/////
		Math x2 = new Math();
		x2.Quiz16();
		x2.Quiz17();
		x2.Quiz18();
		x2.Quiz19();
		x2.Quiz20();
		x2.Quiz21();
		x2.Quiz22();
		x2.Quiz23();
		
		
	/////WAVE2 -- Descending Order/////
		Math c = new Math();
		
		c.Quiz23();
		c.Quiz22();
		c.Quiz21();
		c.Quiz20();
		c.Quiz19();
		c.Quiz18();
		c.Quiz17();
		c.Quiz16();
		
	/////WAVE2 -- Mixed Order/////
		Math d = new Math();
		d.Quiz16();
		d.Quiz18();
		d.Quiz17();
		d.Quiz20();
		d.Quiz23();
		d.Quiz21();
		d.Quiz19();
		d.Quiz22();
		
///////////////////////////////////////////////////////		
		
	/////FINAL-WAVE2 -- Ascending Order/////
		Math x3 = new Math();
		x3.Quiz20();
		x3.Quiz21();
		x3.Quiz22();
		x3.Quiz23();
		
	/////FINAL-WAVE2 -- Descending Order/////
		x3.Quiz23();
		x3.Quiz22();
		x3.Quiz21();
		x3.Quiz20();
		
	/////FINAL-WAVE2 -- Mixed Order/////
		x3.Quiz23();
		x3.Quiz21();
		x3.Quiz22();
		x3.Quiz20();
	/////Complete/////

	}
}
