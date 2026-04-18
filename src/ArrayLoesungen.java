public class ArrayLoesungen
{
    /*
    Aufgabe 3: Ermittle den größten Wert eines Integer-Arrays
     */
    static int max(int[] arr)
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    /*
    Aufgabe 05:
    Drehe die Werte in einem Array um. Die Methode soll folgende Signatur haben
     */
    static int[] umdrehen(int[] arr)
    {
        int[] arrU = new int[arr.length];
        for (int i = 0; i < arrU.length; i++) {
            arrU[i] = arr[arr.length - 1 -i];
        }
        return arrU;
    }


    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arrU = umdrehen(arr1);

    }
}
