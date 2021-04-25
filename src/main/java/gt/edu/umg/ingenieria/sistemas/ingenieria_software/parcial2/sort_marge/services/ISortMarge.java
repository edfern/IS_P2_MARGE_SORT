package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.sort_marge.services;

public interface ISortMarge {
    void margeSort(int[]a, int n);
    void merge(int[] a, int[] l, int[] r, int left, int right);

}
