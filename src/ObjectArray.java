//import java.util.Arrays;
//
//public class ObjectArray {
//    private Object[] arr;
//
//    ObjectArray(Object[] in) {
//        arr = in;
//    }
//
//
//    void add(int index, Object obj) {
//        Object[] newArr = new Object[arr.length + 1];
//
//        for (int srcIndex = 0, dstIndex = 0; srcIndex < arr.length; dstIndex++) {
//            if (dstIndex == index) {
//                newArr[dstIndex] = obj;
//            } else {
//                newArr[dstIndex] = arr[srcIndex];
//                ++srcIndex;
//            }
//        }
//        arr = newArr;
//    }
//
//    Object Get(int Index) {
//        return arr[Index];
//    }
//
//    public void replace (int Index, Object obj){
//        return arr [Index, Object];
//    }
//
//
//    @Override
//    public String toString() {
//        return "ObjectArray{" +
//                "arr=" + Arrays.toString(arr) +
//                '}';
//    }
//}
