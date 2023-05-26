public class Selectionsort {

    private int[] array;

    public Selectionsort(int[] array) {
        this.array = array;
    }

    public void sort() {

        int byffer;

        for (int i = 0; i < array.length; i++) {

            int min = i;

            for (int j = i + 1; j < array.length; j++) {

                if(array[j] < array[min]) {
                    min = j;
                }
            }

            if(min != i) {
                byffer = array[min];
                array[min] = array[i];
                array[i] = byffer;
            }
        }
    }
}
