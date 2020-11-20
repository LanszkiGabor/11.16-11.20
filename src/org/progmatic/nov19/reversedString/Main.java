package org.progmatic.nov19.reversedString;

public class Main {
    public static void main(String[] args) {
     //   Reversed reversed = new Reversed("Fasz");
        CharSequence rs = new Reversed("Éj mélyből fölzengő");
        char ch = rs.charAt(0);
        System.out.println(ch);     //should print 'ő'
        CharSequence beg = rs.subSequence(0, 3);
        System.out.println(beg);        //should print "őge"
        System.out.println(rs.toString()); // should print "őgenzlöf lőbylém jÉ"

    }
}
