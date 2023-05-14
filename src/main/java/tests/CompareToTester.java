package tests;

import StringOperator.StringOperator;

/**
 * <h1>Класс для тестирования созданного метода лексикографического сравнения*/
public class CompareToTester {
    /**
     * <h1>Тест для лексикографического сравнения</h1>
     * В нём 1000 раз генерируются две случайные строки длиной 20 символов, сравниваются написанным методом
     * StringOperator.compareTo и полученный результат сравнивается с результатом метода String.compareTo.
     * <p>Результат формата
     * <br>"---------test номер_теста is successful" и
     * <br>"---------test номер_теста is invalid"
     * <br>выводится в sout.</p>*/
    public static void test(){
        for (int i = 0; i < 1000; i++){
            String a = StringOperator.randomString(20, true, true);
            String b = StringOperator.randomString(20, true, true);;
            int actual = StringOperator.compareTo(a, b);
            int expected = a.compareTo(b);
            if (actual == expected){
                System.out.println("---------test "  + (i + 1) + " is successful");
            }
            else{
                System.out.println("---------test " + (i + 1) + " is invalid");
            }
        }
    }
}
