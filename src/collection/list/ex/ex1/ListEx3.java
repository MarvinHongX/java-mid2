package collection.list.ex.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("n개의 정수를 입력하세요 (종료 0): ");
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n == 0) {
            return;
        }


        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            numbers.add(input);
        }

        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }

        double average = (double) total / numbers.size();
        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }
}
