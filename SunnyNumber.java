import java.util.Scanner;

class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int newnum = num + 1;
        boolean flag = false;
        int sqrt = 0;

        for (int i = 1; i <= newnum / 2; i++) {
            if (i * i == newnum) {
                flag = true;
                sqrt = i;
                break;
            }
        }

        if (flag) {
            System.out.println(sqrt + " is a Sunny Number (" + newnum + ")");
        } else {
            System.out.println(newnum + " is not a Sunny Number");
        }
    }
}