package org.progmatic.nov19.reversedString;

public class Reversed implements CharSequence {

    String string;

    public Reversed(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(string.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        char[] reversedCar = string.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length()-1; i >=0 ; i--) {
            reversed.append(reversedCar[i]);
        }
        return reversed.toString().subSequence(start, end);
    }

    @Override
    public String toString() {
        char[] reversedCar = string.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length()-1; i >=0 ; i--) {
            reversed.append(reversedCar[i]);
        }
        return reversed.toString();
    }
}
