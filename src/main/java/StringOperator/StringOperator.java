package StringOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
* <h1>Класс, содержащий в себе методы для работы со строками
 * */
public class StringOperator {
    /**
     * <h1>Метод, выполняющий лексикографическое сравнение двух строк
     * @param a String, строка 1
     * @param b String, строка 2
     * @return int, результат сравнения*/
    public static int compareTo (String a, String b){
        int n = Math.min(a.length(), b.length());
        // алгоритм лексикографического сравнения
        for (int i = 0; i < n; i++){
            if (a.charAt(i) != b.charAt(i)){
                return a.charAt(i) - b.charAt(i);
            }
        }
        if (a.length() < b.length()){
            return 1;
        }
        else if (a.length() > b.length()){
            return -1;
        }
        return 0;
    }

    /**
     * <h1>Метод, генерирующую строку из случайных букв и цифр заданной длины
     * @param n int, длина строки
     * @param f bool, должна ли строка содержать буквы?
     * @param k bool, должна ли строка содержать цифры?
     * @return String, сгенерированая строка*/
    public static String randomString(int n, boolean f , boolean k)
    {
        // проверка на истинность хотя бы одного из параметров. В противном случае -
        // сообщение sout
        if (!f && !k){
            return "At least one parameter must be true";
        }
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] numbers = "1234567890".toCharArray();
        List<Character> charListToGenerate = new ArrayList<>();
        if (f){
            for (char letter: alphabet) {
                charListToGenerate.add(letter);
            }
        }
        if (k){
            for (char number: numbers) {
                charListToGenerate.add(number);
            }
        }
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++){
            int index = random.nextInt(charListToGenerate.size());
            result.append(charListToGenerate.get(index));
        }
        return result.toString();
    }
}