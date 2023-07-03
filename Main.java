/*
Задание

Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение

 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = generateRandomArrayList(20, 10, 0);
        System.out.print("Сгенерированный ArrayList: ");
        System.out.println(list);
        System.out.print("ArrayList без четных чисел: ");
        System.out.println(deleteEvenArrayList(list));
        System.out.print("Максимальное значение в сгенерированном ArrayList: ");
        System.out.println(Collections.max(list));
        System.out.print("Минимальное значение в сгенерированном ArrayList: ");
        System.out.println(Collections.min(list));
        System.out.print("Среднее значение в сгенерированном ArrayList: ");
        System.out.println(averageArrayList(list));
    }
    public static ArrayList<Integer> generateRandomArrayList(int size, int max, int min) {
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i=0; i < size; i++){
            list.add((int)(Math.random()*(max - min + 1) + min));
        }
        return list;
    }
    public static ArrayList<Integer> deleteEvenArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer o = iterator.next();
            if(o % 2 != 0){
                resultList.add(o);
            }
        }
        return resultList;
    }
    public static double averageArrayList(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer element : list) {
            sum += element;      
        }
        return (double)sum / list.size();
    }
}