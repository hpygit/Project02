package com.hpy.java;

import java.util.ArrayList;

/**
 * @author hpy
 *
 *1、IDAE中代码模板所处得位置：setting-Editor-Live Templates / postfix Completion
 *2、常用的模板
 *
 *
 */
public class Templates {

    //模板六prsf 可生成 private static final私有的静态常量
    //prsf
    private static final Customer customer = new Customer();
    //psf公共的全局的静态常量
    public static final int num1 = 1;
    //psfi
    public static final int num2 = 2;
    //psfs
    public static final String name="hpy";


    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("sout");
        //变形：soutp/soutm/soutv/xxx.sout
        //soutp输出形参
        System.out.println("args = [" + args + "]");
        //soutv就近打印值
        int num1=10;
        int num2=20;
        System.out.println("num2 = " + num2);
        //num1.sout输出一个值
        System.out.println(num1);

        //模板三：fori  for循环
        String arr[] = new String[]{"Tom","Jerry","HanMeimei","LiLei"};
        //fori
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object anInt : list) {

        }
        //变形list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形list.forr倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }




    }
    public void method(){
        //soutm
        System.out.println("Templates.method");

        //模板五ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //ifn
        if (list == null) {

        }
        //变形xxx.null
        if (list == null) {

        }
        //变形inn
        if (list != null) {

        }
        //变形 xxx.nn
        if (list != null) {

        }


    }


}
