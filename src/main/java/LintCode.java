import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LintCode {
    public static void aPlusb() {
        int a = 0b11;
        int b = 0b010;
        int c = a ^ b;
        int d = (a & b) << 1;
        System.out.println("c = " + Integer.toBinaryString(c) + " d = " + Integer.toBinaryString(d));
    }

    public static BigInteger jiecheng(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(jiecheng(n - 1));
        }
    }

    public static void mergeTwoSortedArray(int[] A, int[] B) {
        int[] c = new int[A.length + B.length];
        int indexA = 0;
        int indexB = 0;
        int indexC = 0;
        while (indexA < A.length && indexB < B.length) {
            if (A[indexA] < B[indexB]) {
                c[indexC++] = A[indexA++];
            } else {
                c[indexC++] = B[indexB++];
            }
        }
        while (indexA < A.length) {
            c[indexC++] = A[indexA++];
        }
        while (indexB < B.length) {
            c[indexC++] = B[indexB++];
        }
        System.out.print("{");
        for (int i = 0; i < c.length; i++) {
            if (i < c.length - 1) {
                System.out.print(c[i] + ",");
            } else {
                System.out.print(c[i]);
            }
        }
        System.out.println("}");
    }

    public static void trailingZero(int n) {
        int count = 0;
        while (n != 0) {
            count += n / 5;
            n = n / 5;
        }
        System.out.println("count = " + count);
    }

    public static void rotateString(char[] str, int offset) {
        StringBuffer sb = new StringBuffer();
        offset = offset % str.length;
        for (int i = offset; i < str.length; i++) {
            sb.append(str[i]);
        }
        for (int i = 0; i < offset; i++) {
            sb.append(str[i]);
        }
        char[] temp = sb.toString().toCharArray();
        for (int i = 0; i < temp.length; i++) {
            str[i] = temp[i];
        }
        System.out.println(str);
    }

    public static void rotateString_1(char[] str, int offset) {
        if (str.length > 0 && str != null) {
            offset = offset % str.length;
            char[] a = str.clone();
            int index = 0;
            for (int i = str.length - offset; i < str.length; i++) {
                str[index++] = a[i];
            }
            for (int i = 0; i < str.length - offset; i++) {
                str[index++] = a[i];
            }
        }
        System.out.println(str);
    }

    public static List<String> fizzbuzz(int n) {
        List<String> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                a.add("fizz buzz");
            } else if (i % 3 == 0) {
                a.add("fizz");
            } else if (i % 5 == 0) {
                a.add("buzz");
            } else {
                a.add(i + "");
            }
        }
        return a;
    }

    public static int strStr(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        if (target.length() == 0) {
            return 0;
        }
        if (source.length() == 0) {
            return -1;
        }
        if (source.length() < target.length()) {
            return -1;
        }
        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            boolean equal = false;
            for (int j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) == target.charAt(j)) {
                    if (j == target.length() - 1) {
                        equal = true;
                    }
                } else {
                    break;
                }
            }
            if (equal) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = (start + end) / 2;
        for (; middle != 0 && middle != nums.length - 1 && start != middle; ) {
            if (nums[middle] == target) {
                break;
            } else if (nums[middle] < target) {
                start = middle;
                middle = (start + end) / 2 + 1;
            } else if (nums[middle] > target) {
                end = middle;
                middle = (start + end) / 2;
            }
        }
        if (nums[middle] == target) {
            for (int i = 1; i <= middle; i++) {
                if (nums[middle - i] != nums[middle]) {
                    return middle - i + 1;
                }
            }
        } else {
            return -1;
        }
        return middle;
    }

    public static void main(String[] args) {
//        aPlusb();
//        System.out.println(jiecheng(100));
//        trailingZero(100);
//        int[] a = {1, 2, 3, 4};
//        int[] b = {2, 4, 5, 6};
//        mergeTwoSortedArray(a, b);
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g' };
//        rotateString_1(a, 2);
//        System.out.println(rotate(a,3));
//        System.out.println(strStr("abcdefg", "efgh"));
        int[] nums = {1, 4, 4, 5, 7, 7, 8, 9, 9, 10};
        System.out.println(binarySearch(nums, 7));
    }
}
