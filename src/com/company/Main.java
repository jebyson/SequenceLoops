package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        int val = 0;
        while (val++ < 100) {
            i = val;
            int cnt = 1;

            while (i != 1) {
                cnt++;
                if (i % 2 == 0)
                    i = i / 2;
                else
                    i = 3 * i + 1;
            }
            System.out.println(val + "-" + cnt);
        }
    }
}
