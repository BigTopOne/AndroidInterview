package math.leet_code_07;

import array.BaseFun;

/**
 * @author : dev
 * @version :
 * @Date :  3/27/21 11:02 PM
 * @Desc : 半年之内，这道题，字节出了 23 次
 */
public class Test  extends BaseFun {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        int result = reverse.reverse(6546558);
        System.out.println("result : "+result);


        testBitfunc();


    }

    private static void testBitfunc() {

        int a = 12345;
        while (a>0) {
            a = a/10;

            System.out.println("a : "+a);
        }
    }
}