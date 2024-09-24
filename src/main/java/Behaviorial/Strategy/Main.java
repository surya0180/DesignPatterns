package Behaviorial.Strategy;

import java.util.Arrays;

interface SortStrategy {
    public void sortArray(int[] numbers);
}

class BubbleSort implements SortStrategy {
    @Override
    public void sortArray(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted using Bubble Sort");
    }
}

class QuickSort implements SortStrategy {
    @Override
    public void sortArray(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted using Quick Sort");
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class SortContext {
    private final SortStrategy strategy;
    public SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }
    public void sortNumberArray(int[] numbers) {
        this.strategy.sortArray(numbers);
    }
}

public class Main {
    public static void main(String[] args) {
        SortContext context = new SortContext(new QuickSort());
        int[] numbers = {7, 2, 3, 5, 4, 1, 6, 9, 8};
        context.sortNumberArray(numbers);
        for(Integer i: numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
