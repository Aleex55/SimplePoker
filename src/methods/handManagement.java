package methods;

public class handManagement {
    public void handSort(int[] array) {
        int aux = 0;
        //buble sort que ordena ascendentment
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < ((array.length - i) - 1); j++) {
                if (array[j] > array[j+1]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }
}
