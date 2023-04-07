//2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
 
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
 
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Задайте размер списка: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Random rand = new Random();
        ArrayList<Integer> list_1 = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            int value = rand.nextInt(0, 100);
            list_1.add(value);
        }
        System.out.printf("Рандомный список: \n %s \n",list_1);
        for (int j = 0; j < list_1.size(); j++) {
            if (list_1.get(j) % 2 == 0){
                list_1.remove(j);
            }
        }
        System.out.printf("Список без четных чисел:\n %s", list_1);
    }
}
