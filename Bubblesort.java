public class Bubblesort {

    private int[] array;

    public Bubblesort(int[] array) {
        this.array = array;
    }

    public void sort() {

        int byffer;

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i ; j++) {

                if(array[j] > array[j+1]) {

                    byffer = array[j];
                    array[j] = array[j+1];
                    array[j+1] = byffer;
                }
            }
        }
    }

    public void sortImprove() {

        boolean needSort;

        int byffer;

        do{
            needSort = false;

            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]) {

                    byffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = byffer;

                    needSort = true;
                }
            }
        } while (needSort);
    }
}
