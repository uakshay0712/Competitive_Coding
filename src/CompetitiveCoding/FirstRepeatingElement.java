package CompetitiveCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scr.nextInt();

            if (map.get(a[i]) == null)
                map.put(a[i], 1);
            else
                map.put(a[i], map.get(a[i]) + 1);
        }
        int ch = 0;

        for (int i = 0; i < n; i++)
            if (map.get(a[i]) > 1) {

                ch = 1;
                System.out.println(a[i]);
                break;
            }
        if (ch == 0)
            System.out.println("-1");
        }

    }
