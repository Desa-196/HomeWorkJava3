/*
Задание

Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение

 */

import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = generateRandomArrayList(20, 10, 0);
        System.out.println(list);
        System.out.println(deleteEvenArrayList(list));
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
                //resultList.add(o);
            }
        }
        return resultList;
    }
}