public class Quicksort {

    private int[] array;

    public Quicksort(int[] array) {
        this.array = array;
    }

    public void sort() {
        quicksort(array,0, array.length-1);
    }

    private void quicksort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        //int pivot = source[(leftMarker + rightMarker) / 2];
        int pivot = source[leftMarker];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quicksort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quicksort(source, leftBorder, rightMarker);
        }
    }
}
