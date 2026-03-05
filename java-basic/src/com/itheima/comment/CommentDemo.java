package com.itheima.comment;
/**
 * 3、文档注释.
 * 这是一个程序
 * 是用来讲解注释的使用。
 * **/
public class CommentDemo {
    /**
     * 这是一个main方法，是程序的入口
     * 必须有这个main方法，程序才能执行
     * **/
    public static void main(String[] args) {
        // 目标：认识三种注释
        // 1、单行注释：
        // 打印两行诗句
        System.out.println("我欲乘风归去，又恐琼楼玉宇");

        /*
        2、多行注释：
        打印三行诗句，依次打印
        */
        System.out.println("西风瘦马，客输西风");
        System.out.println("西风瘦马，客输西风");
        System.out.println("西风瘦马，客输西风");

    }
}

// 注释不影响程序的执行，编译后的class文件中，注释也会被删除
// 可以用AI帮写注释