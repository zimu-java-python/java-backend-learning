package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 目标：掌握8种基本数据类型的定义变量
        printVariable();
    }
    // 请帮我设计一个方法，打印出8种基本数据类型的变量
    public static void printVariable() {
        // 1.整形
        byte b = 10;
        // byte b2 = 128; // 越界了，报错
        short s = 20;
        int a = 10;
        // 注意：随机写一个整数默认是int类型的，2435434431434虽然没有超过long的范围，但是超过了int的范围，所以会报错
        // 如果希望显示long类型的数据，必须用L/l结尾
        long l1 = 2435434431434L;
        long l = 10;

        // 2.浮点型
        // 注意：随机写一个浮点数默认是double类型的，如果希望显示float类型数据，必须用F/f结尾
        //float f1 = 10.1;
        float f = 10.1f;
        double d = 10.1;

        // 3.字符型
        char c = 'a';

        // 4.布尔型
        boolean flag = true;
        boolean flag2 = false;

        // 5.字符串类型（引用数据类型，后续）：定义字符串变量，记录字符串数据
        String name = "张三";
        System.out.println(name);


    }
}
