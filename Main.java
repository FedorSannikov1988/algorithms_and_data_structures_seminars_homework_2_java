import java.util.Random;
import java.util.Date;

public class Main {

    private static Random random = new Random();

    private static int generationRandomNumber(int max, int min) {
        int delta = max - min;
        int randNamber = random.nextInt(delta + 1);
        return randNamber + min;
    }

    private static int[] generationRandomArray(int size, int max, int min) {
        int[] array = new int[size];
        for (int i = 0; i < size; i ++) {
            array[i] = generationRandomNumber(max, min);
        }
        return array;
    }

    private static void print(int[] array) {
        System.out.println(" ");
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        int N = 10000;

        int[] arrayForSortOne = generationRandomArray(N, N, 0);

        int[] arrayForSortTwo = arrayForSortOne.clone();

        int[] arrayForSortThree = arrayForSortOne.clone();

        int[] arrayForSortFor = arrayForSortOne.clone();

        int[] arrayForSortFive = arrayForSortOne.clone();

        int[] arrayForSortSix = arrayForSortOne.clone();

        //print(arrayForSortOne);
        //print(arrayForSortTwo);
        //print(arrayForSortThree);
        //print(arrayForSortFor);
        //print(arrayForSortFive);
        //print(arrayForSortSix);

        Heapsort heapsort = new Heapsort(arrayForSortOne);

        Date start = new Date();
        heapsort.sort();
        Date end = new Date();
        long timeHeapsort = end.getTime() - start.getTime();

        //print(arrayForSortOne);

        Bubblesort bubblesort = new Bubblesort(arrayForSortTwo);

        start = new Date();
        bubblesort.sort();
        end = new Date();
        long timeBubblesort = end.getTime() - start.getTime();

        //print(arrayForSortTwo);

        Bubblesort bubblesortImprove = new Bubblesort(arrayForSortThree);

        start = new Date();
        bubblesortImprove.sortImprove();
        end = new Date();
        long timeBubblesortImprove = end.getTime() - start.getTime();

        //print(arrayForSortThree);

        Selectionsort selectionsort = new Selectionsort(arrayForSortFor);

        start = new Date();
        selectionsort.sort();
        end = new Date();
        long timeSelectionsort = end.getTime() - start.getTime();

        //print(arrayForSortFor);

        start = new Date();
        new Insertionsort(arrayForSortFive).sort();
        end = new Date();
        long timeInsertionsort = end.getTime() - start.getTime();

        //print(arrayForSortFive);

        start = new Date();
        new Quicksort(arrayForSortSix).sort();
        end = new Date();
        long timeQuicksort = end.getTime() - start.getTime();

        //print(arrayForSortSix);

        int desiredValue = 100;

        start = new Date();
        Integer resSimplesearch = new Simplesearch(arrayForSortSix, desiredValue).search();
        end = new Date();
        long timeSimplesearch = end.getTime() - start.getTime();

        start = new Date();
        Integer resBinsearch = new Binsearch(arrayForSortSix, desiredValue).search();
        end = new Date();
        long timeBinsearch = end.getTime() - start.getTime();

        start = new Date();
        Integer resBinsearchRecursion = new Binsearch(arrayForSortSix, desiredValue).searchRecursion();
        end = new Date();
        long timerBinsearchRecursion = end.getTime() - start.getTime();

        System.out.printf("resSimplesearch: %d, resBinsearch: %d, resBinsearchRecursion: %d",
                resSimplesearch, resBinsearch, resBinsearchRecursion);

        System.out.println("\n"+"---");

        System.out.printf("timeSimplesearch: %d, timeBinsearch: %d, timerBinsearchRecursion: %d",
                timeSimplesearch, timeBinsearch, timerBinsearchRecursion);

        System.out.println("\n"+"---");

        System.out.printf("timeHeapsort: %d, timeBubblesort: %d, timeBubblesortImprove(Improve-?): %d, timeSelectionsort: %d, timeInsertionsort: %d, timeQuicksort: %d",
                timeHeapsort, timeBubblesort, timeBubblesortImprove, timeSelectionsort, timeInsertionsort, timeQuicksort);

        System.out.println("\n"+"---");
    }
}