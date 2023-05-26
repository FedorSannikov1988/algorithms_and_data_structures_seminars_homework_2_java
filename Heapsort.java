public class Heapsort {

    private int[] array;

    public Heapsort(int[] array) {
        this.array = array;
    }

    public void sort() {

        for (int i = (array.length/2)-1; i >= 0; i --) {
            dumping(array, array.length, i);
        }

        for (int i = (array.length-1); i >= 0; i --) {

            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            dumping(array, i, 0);
        }
    }

    private void dumping(int array[], int sizePyramid, int startPoint) {

        int topPyramid = startPoint;
        int leftBranch = ((2 * topPyramid) + 1);
        int rightBranch = ((2 * topPyramid) + 2);

        if (leftBranch < sizePyramid && array[leftBranch]>array[topPyramid]) {
            topPyramid = leftBranch;
        }

        if (rightBranch < sizePyramid && array[rightBranch]>array[topPyramid]) {
            topPyramid = rightBranch;
        }

        if(topPyramid != startPoint) {
            int temp = array[startPoint];
            array[startPoint] = array[topPyramid];
            array[topPyramid] = temp;

            dumping(array, sizePyramid, topPyramid);
        }
    }

}
