package com.itheima.hello;

/**
 * HelloWorld 程序入口类
 * 该类包含 Java 程序的入口方法，用于输出欢迎信息
 */
public class HelloWorld {
    /**
     * Java 程序的主入口方法
     * 
     * @param args 命令行参数数组，字符串类型，用于接收程序启动时传入的参数
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("--------------------------------------------");
        printHelloWorld();
        System.out.println("--------------------------------------------");
        System.out.println("两数之和为：" + sum(1, 2));
    }

    // 打印3行HelloWorld
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    // 求任意两个整数的和
    public static int sum(int a, int b) {
        return a + b;
    }
}
