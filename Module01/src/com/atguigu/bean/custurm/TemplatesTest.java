package com.atguigu.bean.custurm;

import java.util.Arrays;

/**
 * @author zuobeiming
 * @date 2022/3/16 - 16:52
 */
public class TemplatesTest {

    // psf
    public static final int IN_IN = 123;

    private static final Customer cus = new Customer();

    // psvm
    public static void main(String[] args) {
        // sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int i = 1;
        System.out.println("i = " + i);
        System.out.println(i);
        // fori
        String[] arr = new String[]{"TIM", "hhh", "zuo"};
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        // iter
        for (String s : arr) {
            System.out.println(s);
        }

    }
}