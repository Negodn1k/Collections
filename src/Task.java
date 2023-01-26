import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task extends Random {
    int[] arr;

    public void go() {
        arr = new int[10];
        int i = 0;
        while (i <= (arr.length - 1)) {
            arr[i] = randomize();
            i++;
        }
        System.out.println("Массив из рандомных чисел = "+Arrays.toString(arr));

        ArrayList<Integer> arr2 = new ArrayList<>();
        i = 0;
        while (i <= (arr.length - 1)) {
            if (arr[i] >= 0) {
                arr2.add(arr[i]);
            }
            i++;
        }
        System.out.println("Положительные числа исходного массива = " + arr2);

        int size = arr2.size();
        i = 0;
        while (i <= size){
            arr2.add(arr2.get(i) * 10);
            i++;
        }
        System.out.println("Добавлены значения умноженные на 10 = " + arr2);

        i = 0;
        while (i < arr2.size()) {
            if (arr2.get(i) < 10) {
                arr2.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Удаленны числа меньше 10 = " + arr2);

        Collections.sort(arr2);
        System.out.println("Массив отсортирован по возрастанию = " + arr2);
    }
}
