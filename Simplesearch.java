public class Simplesearch {

    private int[] array;

    private int value;

    public Simplesearch(int[] array, int value) {
        this.array = array;
        this.value = value;
    }

    Integer search() {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                return i;
            }
        }
        return null;
    }
}
