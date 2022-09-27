package c.exception;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBoundsTryCatch();
    }

    public void arrayOutOfBounds() {
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }

    public void arrayOutOfBoundsTryCatch() {
        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println("Out of Bounds!");
        }
    }
//
//    public void arrayOutOfBoundsTryCatch2() {
//        /*
//         * 부모가 이미 catch해서 자식이 catch할 게 없어 already caught 오류 발생
//         */
//        int[] intArray = new int[5];
//        try {
//            System.out.println(intArray[5]);
//        } catch (Exception e) {
//            System.out.println("Out of Bounds!");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("OOB Occured!");
//        }
//    }
}
