public class OperaterChallenge {
    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double totalResult = (firstValue + secondValue)* 100.00d;
        System.out.println("totalResult = " + totalResult);
        double remainderResult = totalResult % 40.00d;
        System.out.println("remainderResult = " + remainderResult);
        // modulus (%) means divide it i.e., totalResult (Numerator) and 40 (Denominator)
       /* boolean remainderWillResult = true;
        if (remainderResult == 0) {
            System.out.println("Got some remainder"); */
           // /*
            //OR
            boolean remainderWillResult = (remainderResult == 0) ? true : false;
            //which means ? (implies) and : (else)
            System.out.println("remainderWillResult = " + remainderWillResult);
            if (!remainderWillResult) {
            System.out.println("There is a remainder.");
            }
            // */
        }


    }
