package com.itheima.literal;

/**
 * 目标：掌握常见字面量的书写格式
 * **/
public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();
    }
    public static void printLiteral() {
        // 请帮我直接输出常见的字面量
        // 1、整形字面量，直接写
        System.out.println(10);

        // 2、浮点型字面量，直接写（小数）
        System.out.println(10.5);

        // 3、布尔型字面量，true/false
        System.out.println(true);
        System.out.println(false);

        // 4、字符型字面量，单引号，里面有且只有一个字符
        System.out.println('a');
        System.out.println('中');
        System.out.println(' ');
        // System.out.println('中国'); // 错误，有两个字符
        // System.out.println(''); // 错误，没有字符

        // 5、字符串型字面量，双引号，里面可以有任意多个字符
        System.out.println("hello world");
        System.out.println("hello world");

        // 6、掌握一些特殊的字符：\n(换行符) \t(缩进符)
        System.out.println("hello\nworld");
        System.out.println("hello\tworld");

    }
}
