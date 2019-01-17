package Search;

public class SortSearch {
    public static void main(String[] args) {
        Integer[] unsortedArray = {9, 4, 2, 6, 7, 5, 3, 1, 8};

        SortSearch search = new SortSearch();

        Integer key = 6;
        System.out.println("Do linear search");
        System.out.println("Search for " + key + " in unsorted array");
        foundMessage(search.linearSearch(unsortedArray, key) > -1, key);
        System.out.println();

        key = 12;
        System.out.println("Do linear search");
        System.out.println("Search for " + key + " in unsorted array");
        foundMessage(search.linearSearch(unsortedArray, key) > -1, key);
        System.out.println();

        // binary search
        Integer[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        key = 6;
        System.out.println("Do binary search");
        System.out.println("Search for " + key + " in sorted array");
        foundMessage(search.binarySearch(sortedArray, key) > -1, key);
        System.out.println();

        key = 12;
        System.out.println("Do binary search");
        System.out.println("Search for " + key + " in sorted array");
        foundMessage(search.binarySearch(sortedArray, key) > -1, key);
        System.out.println();
    }

    private static void foundMessage(boolean found, int key) {
        if (found) {
            System.out.println("Found " + key + " in array");
        }
        else {
            System.out.println("Did not find " + key + " in array");
        }
    }

    public int linearSearch(Comparable[] arr, Comparable key) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;

    }

    public int binarySearch(Comparable[] arr, Comparable key) {
        return binarySearch(arr, 0, arr.length - 1, key);
    }

    private int binarySearch(Comparable[] arr, int first, int last, Comparable key) {
        if (first > last) return -1;    //looked at everything

        // find middle element
        int mid = first + (last - first) / 2;

        // check if the middle element is the key
        if (arr[mid].compareTo(key) == 0) return mid;
        else if(arr[mid].compareTo(key) < 0) return binarySearch(arr, mid + 1, last, key);
        else return binarySearch(arr, first, mid - 1, key);
    }
}
