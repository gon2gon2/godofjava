package c.exception;

public class CustomException {
    public static void main(String[] args) {
        CustomException sample = new CustomException();
        try {
            sample.throwMyException(13);
        } catch (MyException mye) {
            System.out.println("MyException caller에게 전달 완료");
            mye.printStackTrace();
        } catch (Exception e) {
            System.out.println("MyException이 아니고 다른 에러");
        }

    }

    // throws를 해야 caller에게도 exception이 전달된다.
    public void throwMyException(int number) throws MyException {
        try {
            if (number > 12) {
                throw new MyException("Number is over than 12");
            }
        } catch (MyException e) {
            System.out.println("Caught!!!");
        }

    }
}
