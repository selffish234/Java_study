import java.util.ArrayList;

public class ExceptionExample {

    public static void main(String[] args) {

        // 예외(Exceptions)
        //코드실행시 발생하는 에러중 하나 이러한 에러는 예측이돼서 가지고 있는것
        //에러는 범위에서 예외는 예측할 수 있어서 유형화 된것

//        int a = 10;
//        int b = 0;
//        int c = a / b; // 10을 0으로 나눴기에 예외 발생

        ArrayList arrayList = new ArrayList(3);
//        arrayList.get(10); // 범위를 넘어가서 예외 발생

        try {
//            arrayList.get(10);//예외가 발생할것 같은 코드를 집어넣음
            int a = 10;
            int b = 0;
            int c = a / b; // 원래대로면 10을 0으로 나눴기에 예외 발생
//        } catch (ArithmeticException ae) {
//            System.out.println("ArithmeticException 발생이지롱");
        } catch (IndexOutOfBoundsException ioe) { // catch 뒤 ()에는 각 상황에 맞는 예외들이 들어감
            System.out.println("IndexOutOfBoundsException 발생");
//        catch (Exception e) { // 예외가 발생하면 이걸 해 주세요~, /Exception은 모든 예외가 담겨있는 최상위 변수
////            e.printStackTrace(); // 에러관련된 내용을 보여주는 코드
//              System.out.println("에러발생");
        } catch (IllegalArgumentException iae) {
            System.out.println("IllegalArgumentException 발생");
        } catch (Exception e) {
            System.out.println("Exception 발생");
        } finally {// 앞이랑 상관없이 무조건 실행되는 코드
            System.out.println("finally");
        }

    }
}
