package stepDefenition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class steps {
    int a;
    int b;
    int sum;
    int mines;
    int pr;
    int del;

    @Дано("^два числа (.*) and (.*)$")
    public void given(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Тогда("^находим сумму двух чисел$")
    public void summa(){
        sum = a + b;
    }

    @Когда("^находим разность двух чисел$")
    public void minus(){
        mines = a - b;
        System.out.println("(minus) Разница чисел " + a + " и " + b + " = " + mines);
    }

    @И("^находим произведение двух чисел$")
    public void proizv(){
        pr = a * b;
    }

    @И("^находим деление двух чисел$")
    public void delenie(){
        del = a / b;
    }

    @И("^выводим сумму на экран$")
    public void printResult(){
        System.out.println("Сумма чисел " + a + " и " + b + " равняется " + sum);
        System.out.println("Разница чисел " + a + " и " + b + " равняется " + mines);
        System.out.println("Произведение чисел " + a + " и " + b + " равняется " + pr);
        System.out.println("Деление чисел " + a + " и " + b + " равняется " + del);
    }
}
