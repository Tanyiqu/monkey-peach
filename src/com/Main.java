package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // f1();

        f2();

        // f3();

        // f4();
    }

    // 数组解法
    // 后面替换成自己实现的动态数组
    static void f1() {
        List<Integer> list = new ArrayList<>();

        int peach = 1;
        list.add(peach);

        for (int i = 9; i > 0; i--) {
            peach = (peach + 1) * 2;
            list.add(peach);
        }
        System.out.println(list);
        // [1, 4, 10, 22, 46, 94, 190, 382, 766, 1534]

        // 输出最后一个元素
        System.out.println(list.get(list.size() - 1));
    }

    // 链表解法
    // 后面使用自己实现的链表
    static void f2() {
        List<Integer> list = new LinkedList<>();

        int peach = 1;
        list.add(peach);

        for (int i = 9; i > 0; i--) {
            peach = (peach + 1) * 2;
            list.add(peach);
        }
        System.out.println(list);
        // [1, 4, 10, 22, 46, 94, 190, 382, 766, 1534]

        // 输出最后一个元素
        System.out.println(list.get(list.size() - 1));
    }

    // 递归解法
    static void f3() {
        System.out.println(dg(10));
    }

    // 递归函数
    static int dg(int day) {
        if (day == 1) {
            return 1;
        } else {
            return (dg(day - 1) + 1) * 2;
        }
    }

    // 使用栈解决
    // 后面使用自己实现的栈
    static void f4() {
        Stack<Integer> stack = new Stack();
        int peach = 1;
        stack.push(peach);

        for (int i = 9; i > 0; i--) {
            peach = (peach + 1) * 2;
            stack.push(peach);
        }

        System.out.println(stack.pop());
    }

}