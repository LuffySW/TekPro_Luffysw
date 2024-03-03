package exercise3;

abstract class Sortable {
    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        int h = 1;
        
        // Calculate the initial gap sequence
        while (h < n / 3) {
            h = 3 * h + 1; // 1, 4, 13, 40, 121, ...
        }

        // Start with the largest gap and work down to a gap of 1
        while (h >= 1) {
            // Perform insertion sort for elements gapped by h
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && (a[j - h].compare(a[j]) > 0); j -= h) {
                    // Swap elements if they are out of order
                    Sortable temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                }
            }
            // Move to the next gap
            h /= 3;
        }
    }
}