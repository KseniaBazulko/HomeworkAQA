public class Homework01 {

    static int a;
    static int b;
    static String str;
    static int num;

    public static void main(String[] args) {

    }


    public static void printThreeWords() {
        System.out.println("Задание 1:\nOrange\nBanana\nApple\n");

    }


    public static void checkSumSign() {
        System.out.println("Задание 2: ");
        int a = -45;
        int b = 44;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная\n");
        }
    }


    public static void printColor() {
        System.out.println("Задание 3: ");
        int value = 43;
        if (value <= 0) {
            System.out.println("Красный\n");
        } else if (value <= 100) {
            System.out.println("Жёлтый\n");
        } else {
            System.out.println("Зелёный\n");
        }
    }


    public static void compareNumbers() {
        System.out.println("Задание 4: ");
        int a = 324;
        int b = 326;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b\n");
        }
    }


    public static void sumResult() {
        System.out.println("Задание 5: ");

        boolean result = sumMethod(14, 3);
        System.out.println(result + "\n");
    }

    public static boolean sumMethod(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }


    public static void nature() {
        System.out.println("Задание 6: ");
        numMethod(3);
    }

    public static void numMethod(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " - положительное\n");
        } else
            System.out.println("Число " + a + " - отрицательное\n");
    }


    public static void beneficial() {
        System.out.println("Задание 7: ");
        boolean res1 = checkNum(234);
        System.out.println(res1 + "\n");

    }

    public static boolean checkNum(int a) {
        return a <= 0;
    }


    public static void line() {
        System.out.println("Задание 8: ");
        str = "Easy peasy, lemon squeezy!";
        num = 3;
        writeWords(str, num);
    }

    public static void writeWords(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str + "\n");
        }
    }


    public static void leapYear() {
        boolean res1 = isLeap(2024);
        boolean res2 = isLeap(2022);
        System.out.println("Задание 9: ");
        System.out.println(res1);
        System.out.println(res2 + "\n");

    }

    public static boolean isLeap(int year) {
        if (year % 4 != 0 || year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }


    public static void massMethod() {
        System.out.println("Задание 10: ");
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1};
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == 1) {
                arr[a] = 0;
            } else if (arr[a] == 0) {
                arr[a] = 1;

            }
            System.out.print(arr[a]);
        }
    }


    public static void massivMethod() {
        System.out.println("\nЗадание 11: ");
        int[] array = new int[101];
        for (int i = 1; i < array.length; i++) {
            System.out.println((array[i] = i) + " ");
        }
    }


    public static void massiveMethod () {
        System.out.println("Задание 12: ");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int a = 0; a < arr.length; a++) {
            if (arr[a] < 6) {
                arr[a] = arr[a] * 2;
            }
            System.out.println(arr[a]);
        }
    }


    public static void cubeMass () {
        System.out.println("Задание 13: ");
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");

        }

    }


    public static int[] createArray ( int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void arguments () {
        System.out.println("Задание 14: ");
        int len = 10;
        int initialValue = 3;
        int[] newArray = createArray(len, initialValue);


        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

}
