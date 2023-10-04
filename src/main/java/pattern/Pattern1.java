package pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int[] a = {10, 36, 54, 89, 12};
        printElements(a);
        a = orderElements(a);
        System.out.println();
        System.out.println("After sorting : ");
        printElements(a);
        System.out.println();
        System.out.println("===================");
        System.out.println("Printing all pairs");
        int sum = 0;
        for (int i : a) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print("<" + i + ", 3>, ");
                sum += i + 3;
            } if (i % 2 == 0) {
                System.out.print("<" + i + ", 4>, ");
                sum += i + 4;
            } if (perfectSquareCheck(i)) {
                System.out.print("<" + i + ", 5>, ");
                sum += i + 5;
            }
        }
        System.out.println();
        System.out.println("===================");
        System.out.println("Total sum is " + sum);
    }

    private static boolean perfectSquareCheck(int a) {
        for (int i = 1; i < a; i++) {
            if (i * i == a) {
                return true;
            }
        }
        return false;
    }

    private static int[] orderElements(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    static void printElements(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
