/**
 * Created by majun on 2016/6/28.
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int[] array) {
        if (array == null && array.length == 0) {
            return 0;
        }
        int index1 = 0;
        int index2 = array.length - 1;
        int mid = (index1 + index2) / 2;
        while (index1 < index2) {
            mid = (index1 + index2) / 2;
            if (array[index1] == array[index2] && array[mid] == array[index2]) {
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < array.length; i++) {
                    min = array[i] < min ? array[i] : min;
                }
                return min;
            }
            if (array[mid] >array[index2]) {
                index1 = mid+1 ;
            } else {
                index2 = mid;
            }
//            if (array[mid]>=array[index1])//会引发错误，以为两端数据都是从小到大排列，所以容易出问题。
//            {
//                index1=mid+1;
//            }else
//            {
//                index2=mid;
//            }
        }
        return array[index2];
    }

    public int minNumberInRotateArray1(int[] array) {
        if (array == null && array.length == 0) {
            return 0;
        }
        int firstNum = array[0];
        int length = array.length;
        int index = (length - 1) / 2;
        if (length == 1||firstNum<array[length-1]) {
            return firstNum;
        }
        while (index > 0 && index < length - 1) {
            if (array[index] < array[index - 1] && array[index] < array[index + 1]) {
                return array[index];
            }
            if (array[index] > firstNum) {
                index = (index + length) / 2;
            } else {
                index = (index - 1) / 2;
            }
        }
        if (array[0] > array[length - 1]) {
            return array[length - 1];
        } else {
            return array[0];
        }
    }
}
