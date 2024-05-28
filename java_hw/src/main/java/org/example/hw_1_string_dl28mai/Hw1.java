package org.example.hw_1_string_dl28mai;

import java.util.Locale;
import java.util.Scanner;

public class Hw1 {
    //  1 уровень сложности: № 1
    //Создайте строку через new - I study Basic Java!
    //Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
    //Распечатать пред-последний символ строки. Используем метод String.charAt().
    //Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    //Вырезать строку Java c помощью метода String.substring().
    //Заменить все символы “а” на “о”.
    //Преобразуйте строку к верхнему регистру.
    //Преобразуйте строку к нижнему регистру.
    public static void main(String[] args) {
        String stringP = new String("I study Basic Java");
        strFunct(stringP);
        Scanner inpNumber = new Scanner(System.in);
        System.out.println("введите первое число");
        double a = inpNumber.nextDouble();
        System.out.println("введите второе число");
        double b = inpNumber.nextDouble();
        System.out.println("сумма чисел равна:" + " " + sumNumber(a,b));
        System.out.println("разность чисел равна:" + " " + differenceNumber(a,b));
        System.out.println("произведение чисел равно:"  + " " + productOfTwoNumbers(a,b));
        System.out.println("частное чисел равно:"  + " " + divisionOfTwoNumbers(a,b));
        System.out.println("Напишите пожалуйста Ваше имя");
        //№ 3
//Напишите программу, которая запрашивает имя пользователя и выводит на экран «Добрый день <…….. !>».
//
//Улучшите программу, которая запрашивает имя пользователя и выводит на экран
//«Добрый день  <…….. !>».
//«Ваше имя начинается с символа <.> и заканчивается на символ <.>».
        String name = inpNumber.next();
        System.out.println("Добрый день" + " "+ name);
        System.out.println("Ваше имя начинается с символа: "+ "( "+ name.charAt(0) + " )"+" " + "и заканчивается на символ:" +" "+"( "+ name.charAt(name.length()-1)+ " )");
    }


    public static void strFunct(String stringInp) {
        System.out.println(stringInp.charAt(stringInp.length() - 2));
if (stringInp.contains("Java")) {
    System.out.println("строка содержит слово: Java  и мы его сейчас покажем ");
    int index = stringInp.indexOf("Java");
    String strJava = stringInp.substring(index,index+4);
    System.out.println(strJava);
}
else System.out.println("строка НЕ содержит слово: Java ");
    String oneA = stringInp.replace("a", "o");
        System.out.println("строка с заменой а=>о выглядит так: "+" " + oneA);
        System.out.println("исходная строка в верхнем регистре выглядит так: "+ " " + stringInp.toUpperCase());
        System.out.println("исходная строка в нижнем регистре выглядит так: "+ " " + stringInp.toLowerCase());
    }
    //Не обязательно
//№ 2
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль
public static double sumNumber (double a, double b) {
        return a+b;
}
public static double differenceNumber (double a, double b) {
        return a-b;
}
public static double productOfTwoNumbers (double a, double b) {
        return a*b;
}

    public static double divisionOfTwoNumbers (double a, double b) {
        return a/b;
    }
}


