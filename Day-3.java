// Day-3

// Create a class that includes a data member that holds a serial number for each object created from a class that is the //first object will be numbered 1,the second 2 and so on when each object is creating ,its constructor can examine this count //member variable to determine the appropriate serial number for the new object add a member function that permits an object //to report its own serial number then the main() function that creates objects and queries each one about its serial number //they should respond i am object 2,and so on 

class SerialNumber {
    private static int count = 0; // Static variable to track object count
    private int serialNumber; // Instance variable for each object's serial number

    // Constructor to assign serial number
    SerialNumber() {
        count++;
        this.serialNumber = count;
    }

    // Method to display the serial number
    void showSerialNumber() {
        System.out.println("I am object " + serialNumber);
    }
}

public class Day3{
    public static void main(String[] args) {
        // Creating objects
        SerialNumber obj1 = new SerialNumber();
        SerialNumber obj2 = new SerialNumber();
        SerialNumber obj3 = new SerialNumber();

        // Displaying serial numbers
        obj1.showSerialNumber();
        obj2.showSerialNumber();
        obj3.showSerialNumber();
    }
}
