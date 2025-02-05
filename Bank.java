// Day-3

// class Calculator {
//     int num1 = 3;
//     int num2 = 7;
//     double num3 = 3.3; // Change float to double for consistency

//     // Static method for integer exponentiation
//     static int powerInt(int num1, int num2) {
//         return (int) Math.pow(num1, num2); // Cast double to int
//     }

//     // Static method for floating-point exponentiation
//     static double powerDouble(int num1, double num3) {
//         return Math.pow(num1, num3); // Return the computed power
//     }
// }

// public class Day3 {
//     public static void main(String[] args) {
//         Calculator calculator = new Calculator();

//         int resultInt = Calculator.powerInt(calculator.num1, calculator.num2);
//         double resultDouble = Calculator.powerDouble(calculator.num1, calculator.num3);

//         System.out.println("PowerInt: " + resultInt);
//         System.out.println("PowerDouble: " + resultDouble);
//     }
// }




// class SExample{
// 		int e1=10;
// 		int e2=88;
// }
// class Swap{
// 	static void SwapClass(SExample s){
//         System.out.println("Before Swap: a = " + s.e1 + ", b = " + s.e2);
// 		 int temp = s.e1;
// 		 s.e1 = s.e2 ;
// 		 s.e2 = temp;
//         System.out.println("after Swap: a = " + s.e1 + ", b = " + s.e2);
// 		}
// 	}
// public class Day3{
// 	public static void main(String[]args){
// 			SExample val = new SExample();
//             Swap.SwapClass(val);
// 			}
// 	}

// Create a class that includes a data member that holds a serial number for each object created from a class that is the //first object will be numbered 1,the second 2 and so on when each object is creating ,its constructor can examine this count //member variable to determine the appropriate serial number for the new object add a member function that permits an object //to report its own serial number then the main() function that creates objects and queries each one about its serial number //they should respond i am object 2,and so on 

// class SerialNumber {
//     private static int count = 0; 
//     private int serialNumber; 

//     SerialNumber() {
//         count++;
//         this.serialNumber = count;
//     }

//     void showSerialNumber() {
//         System.out.println("I am object " + serialNumber);
//     }
// }

// public class Day3{
//     public static void main(String[] args) {
//         SerialNumber obj1 = new SerialNumber();
//         SerialNumber obj2 = new SerialNumber();
//         SerialNumber obj3 = new SerialNumber();

//         obj1.showSerialNumber();
//         obj2.showSerialNumber();
//         obj3.showSerialNumber();
//     }
// }
