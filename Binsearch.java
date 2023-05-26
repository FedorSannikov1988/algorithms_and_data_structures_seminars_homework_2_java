public class Binsearch {

    private int[] array;

    private int value;

    public Binsearch(int[] array, int value) {
        this.array = array;
        this.value = value;
    }

    public Integer search() {

        int min = 0;

        int max = array.length - 1;

        int midpoint;

        while(max - min > 1){

            midpoint = (max + min) / 2;

            if(value > array[midpoint])
                min = midpoint;
            else
                max = midpoint;
        }

        if(array[min] == value) {
            return min;
        }

        if(array[max] == value) {
            return max;
        }

        return null;
    }

    public Integer searchRecursion() {

        return binarySearchRecursion(array, value, 0, array.length-1);

    }

    private Integer binarySearchRecursion(int[] array, int value, int min, int max) {

        int midpoint;

        if(max < min) {
            return null;
        }
        else {
            midpoint = (max - min) / 2 + min;
        }

        if (array[midpoint] < value) {
            return binarySearchRecursion(array, value, midpoint + 1, max);
        }
        else {
            if (array[midpoint] > value) {
                return binarySearchRecursion(array, value, min, midpoint - 1);
            }
            else {
                return midpoint;
            }
        }
    }
}