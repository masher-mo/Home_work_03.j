/*
 * 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа.
 */


 import java.util.ArrayList;
 import java.util.Random;
 
 public class task_002 {
     public static void main(String[] args) {
         Random rnd = new Random();
         ArrayList<Integer> list1 = new ArrayList<Integer>();
         for (int i = 0; i < 10; i++) {
             int val = rnd.nextInt(-50, 50);
             list1.add(val);
         }
         System.out.printf("Произвольный список целых чисел %s\n", list1);
         int i = 0;
         while (i < list1.size()) {
             if (list1.get(i) % 2 == 0) {
                 list1.remove(i);
             }
             else {
                 i++;
             }
         }
         System.out.printf("Список с удаленными четными числами %s", list1);
     }
 }
