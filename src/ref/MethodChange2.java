package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("매서드 변경 전 dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("매서드 변경 후 dataA.value = " + dataA.value);
    }

    static void changeReference(Data datax) {
        datax.value = 20;
    }
}
