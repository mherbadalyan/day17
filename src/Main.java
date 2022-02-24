import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Task1
        add(10);
        add(10,20);
        add(10,10.0);
        add(10.0,10);

//        Task2
//        sum(10,10);

//        Task3
        sum(10,10);
        sum(10,10.0);

//        Task4
        int[] intArray = new int[5];
        float[] floatArray = new float[5];
        double[] doubleArray = new double[5];
        printArray(intArray);
        printArray(floatArray);
        printArray(doubleArray);

//        Task5
        search(intArray);
        search(intArray, 5);

//        Task6
        System.out.println(square(10));
        System.out.println(square(10.0));

//        Task7
        System.out.println(max(10,20));
        System.out.println(max(10,20,30));
        System.out.println(max(10,20,30,40));

//        Task8
        System.out.println(distance(2,-5,-4,3));
        System.out.println(distance(2,-5));

//        Task9
        fahrenheitCelsius(32.0f , 1 );
        fahrenheitCelsius(1, 32.0f );

//        Task10
        System.out.println(reminder(567));
        System.out.println(reminder(567, 7));
    }


    /**
     * task1
     * Write a function add with these 3 types of overloading.
     * static void add();
     *
     * @param i
     */
    private static void add(int i) {
        System.out.println("Method with one parameter int");
    }
    private static void add(int i, int j) {
        System.out.println("Method with two parameter int");
    }
    private static void add(int i, double j) {
        System.out.println("Method with two parameter int and double");
    }
    private static void add(double i, int j) {
        System.out.println("Method with two parameter double and int");
    }

    /**
     * task2
     * @param i
     * @param j
     * @return
     */
//    private static int sum(int i,int j) {
//        System.out.println("Method with two parameter int");
//        return i+j;
//    }
//    private static double sum(int i,int j) {
//        System.out.println("Method with two parameter int");
//        return (double) (i+j);
//    }

    /**
     * task3
     * fixing task 2 bag
     *
     * @param i
     * @param j
     * @return
     */
    private static int sum(int i, int j) {
        System.out.println("Method with two parameter int");
        return i + j;
    }
    private static double sum(int i, double j) {
        System.out.println("Method with two parameter int and double");
        return i + j;
    }

    /**
     * task4
     *
     * @param intArray
     */
    private static void printArray(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
    }
    private static void printArray(float[] intArray) {
        System.out.println(Arrays.toString(intArray));
    }
    private static void printArray(double[] intArray) {
        System.out.println(Arrays.toString(intArray));
    }

    /**
     * task5
     * first method return size of array
     * second method return index of given number
     *
     * @param intArray
     * @return
     */
    private static int search(int[] intArray) {
        return intArray.length;
    }
    private static int search(int[] intArray, int index) {
        if (index < 0 || index >= intArray.length) {
            System.out.println("wrong index");
            return -1;
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == index) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Task6
     * first method returns square of circle
     * second method returns square of square
     * third method returns square of rectangle
     *
     * @param i
     * @return
     */
    private static int square(int i) {
        return (int) (Math.PI * Math.pow(i, 2));
    }
    private static int square(double i) {
        return (int) Math.pow(i, 2);
    }
    private static int square(int i, int j) {
        return i * j;
    }

    /**
     * task7
     * methods return max value from given parameters
     *
     * @param num1
     * @param num2
     * @return
     */
    private static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    private static int max(int num1, int num2, int num3) {
        return num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
    }
    private static int max(int num1, int num2, int num3, int num4) {
        int[] array = {num1, num2, num3, num4};
        int max = array[0];
        for (int i = 1; i < 4; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Task 8
     * first method returning distance between 2 points
     * second method return distance between 1 point and center
     *
     * @param Ax
     * @param Ay
     * @param Bx
     * @param By
     * @return
     */
    private static int distance(int Ax, int Ay, int Bx, int By) {
        return (int) Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2));
    }
    private static int distance(int Ax, int Bx) {
        return distance(Ax, 0, Bx, 0);
    }

    /**
     * task9
     * converting and printing celsius to fahrenheit and fahrenheit to celsius
     *
     * @param celsius
     * @param choice
     */
    private static void fahrenheitCelsius(float celsius, int choice) {
        if (choice == 1) {
            System.out.println((int) (celsius * 1.8 + 32));
        } else if (choice == 2) {
            System.out.println((double) (celsius * 1.8 + 32));
        } else System.out.println("Wrong choice");
    }
    private static void fahrenheitCelsius(int choice, float farhrenheit) {
        if (choice == 1) {
            System.out.println((int) ((farhrenheit - 32) / 1.8));
        } else if (choice == 2) {
            System.out.println((double) ((farhrenheit - 32) / 1.8));
        } else System.out.println("Wrong choice");
    }

    /**
     * task 10
     * first method return sum of digits for that value
     * second method return reminder from sum of digits divided to second parameter
     *
     * @param num
     * @return
     */
    private static int reminder(int num) {
        int sum = 0;
        int newNum = Math.abs(num);
        while (newNum > 0) {
            sum += newNum % 10;
            newNum /= 10;
        }
        return sum;
    }
    private static int reminder(int num, int reminder) {
        num = reminder(num);
        return num % reminder;
    }
}
