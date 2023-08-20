package lesson4;

import java.util.Arrays;

import static lesson4.hw1.Main1.generateRandomArray;
public class Main7
{
    /**
     * Сортировка вставками
     */
    public static void main(String[] args)
    {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        for (int left = 0; left < arr.length; left++)
        {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--)
            {
                if (value < arr[i])
                {
                    arr[i + 1] = arr[i];
                } else
                {
                    break;
                }
            }
            arr[i + 1] = value;
        }
        System.out.println("Insertion Sort: ");
        System.out.println(Arrays.toString(arr));
    }
}

