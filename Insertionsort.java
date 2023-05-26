public class Insertionsort {

    private int[] array;

    public Insertionsort(int[] array) {
        this.array = array;
    }

    public void sort() {

        int byffer;
        int min;

        for (int i = 0; i < array.length; i++) {

            min = i;

            for (int j = i + 1; j < array.length; j++) {

                if(array[j] < array[min]) {
                    byffer = array[min];
                    array[min] = array[i];
                    array[i] = byffer;
                }
            }
        }
    }
}
