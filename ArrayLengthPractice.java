public class ArrayLengthPractice {
    public static void main(String[] args) {

        int[] lengthArray = new int[20];

        for(int i=0; i<lengthArray.length; i++) {
            lengthArray[i] = i*10;
        }
        for (int i=0; i<lengthArray.length; i++)
            System.out.println("Element " + i + ", value is " + lengthArray[i]);
    }
}
