public class ArrayLearning {

    public static void main(String[] args) {
        //int[] myIntArrayVariable = new int[10];
        /* either we can directly define an array by giving = or in two line
        either -- int[] myArrayVariable;
        myArrayVariable = my new int[10];
                OR
        int[] myArrayVariable = my new int[5];
         */
        /*myIntArrayVariable[5] = 50;  it is taking 6 elements actually not 5 as array starts with 0
        to start with very 1st element of the array we should start with 0 */
        double[] myDoubleArrayVariable = new double[10];
        //System.out.println("myDoubleArrayVariable");

         int[] myArrayList = { 1,2,3,4,5,6,7,8,9,10};
        System.out.println(myArrayList[0]);
        System.out.println(myArrayList[7]);

        int[] forLoopArrayList = new int[10];
        for(int i=0; i<10; i++) {
            forLoopArrayList[i] = i*10;
            }
        for(int i=0; i<10; i++)
        System.out.println("Element " + i + ", value is " + forLoopArrayList[i]);
    }
}
