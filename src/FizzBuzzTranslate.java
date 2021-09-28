public class FizzBuzzTranslate {
    public static String getFizzBuzzTranslate(int a) {
        String translate;
        boolean FIZZS = a % 3 == 0;
        boolean BUZZS = a % 5 == 0;
        String FIZZ = "FIZZ";
        String BUZZ = "BUZZ";
        if (FIZZS && BUZZS) {
            translate =FIZZ + BUZZ;
        } else if (FIZZS) {
            translate = FIZZ;
        } else if (BUZZS){

            translate = BUZZ;
        } else {
            translate = " " + a;
        }
        return translate;
    }
}
