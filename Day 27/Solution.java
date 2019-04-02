// Author: Atharv Damle
// To write tests cases to check a program...These test cases are then used in try catch blocks to confirm the output.
// Full Question: https://www.hackerrank.com/challenges/30-testing/problem


static class TestDataEmptyArray {
    public static int[] get_array() {
        int a[] = new int[0];
        return a;
    }
}

static class TestDataUniqueValues {
    public static int[] get_array() {
        int a[] = {1,342,5,22,56,77};
        return (a);
    }

    public static int get_expected_result() {
        return 0;
    }
}

static class TestDataExactlyTwoDifferentMinimums {
    public static int[] get_array() {
        int a[] = {2,5,4,33,6,2,23};
        return (a);
    }

    public static int get_expected_result() {
        return 0;
    }
}
