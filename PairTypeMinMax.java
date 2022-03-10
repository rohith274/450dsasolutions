//Find Maximum of array - Using Pair return type
class PairTypeMinMax {

    static pair getMinMax(long a[], long n) {

        pair hello = new pair(a[0], a[0]);

        // Write your code here
        for (int i = 0; i < n; i++) {
            if (a[i] > hello.second) {
                hello.second = a[i];
            }
            if (a[i] < hello.first) {
                hello.first = a[i];
            }
        }

        return hello;

    }

}