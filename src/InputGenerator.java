import java.util.ArrayList;
import java.util.Collections;
public class InputGenerator {
    public static void main(String[] args) {
        String key = input1();
        System.out.println("Main Strings: \n" + input2(key));
        System.out.println();
        System.out.println("Key: " + key);
    }
    public static String input1() {
        String fin = "";
        for (int i = 0; i < 5; i++) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int ran = (int) (Math.random() * 26);
            fin += alphabet.substring(ran, ran + 1);
        }
        return fin;
    }
    public static String input2(String k1) {
        String l1 = "h";
        String l2 = "a";
        String l3 = "n";
        String l4 = "u";
        String l5 = "k";
        String l6 = "k";
        String l7 = "a";
        String l8 = "h";
        for (int i1 = 0; i1 < 8; i1++) {
            ArrayList<String> charRandomization = new ArrayList<>();
            for (int j1 = 0; j1 < 100; j1++) {
                String alphabet = "abcdefghijklmnopqrstuvwxyz";
                int ran = (int) (Math.random() * 26);
                charRandomization.add(alphabet.substring(ran, ran + 1));
            }
            Collections.shuffle(charRandomization);
            if (l1.length() < 2 ) {
                for (int j1 = 0; j1 < charRandomization.size(); j1++) {
                    l1 += charRandomization.get(j1);
                }
            } else if (l2.length() < 2) {
                for (int j1 = 0; j1 < charRandomization.size(); j1++) {
                    l2 += charRandomization.get(j1);
                }
            } else if (l3.length() < 2) {
                for (int j1 = 0; j1 < charRandomization.size(); j1++) {
                    l3 += charRandomization.get(j1);
                }
            } else if (l4.length() < 2) {
                for (int j1 = 0; j1 < charRandomization.size(); j1++) {
                    l4 += charRandomization.get(j1);
                }
            } else if (l5.length() < 2) {
                for (int j1 = 0; j1 < charRandomization.size(); j1++) {
                    l5 += charRandomization.get(j1);
                }
            } else if (l6.length() < 2) {
                for (int j1 = 0; j1 < charRandomization.size(); j1++) {
                    l6 += charRandomization.get(j1);
                }
            } else if (l7.length() < 2) {
                for (int j1 = 0; j1 < charRandomization.size(); j1++) {
                    l7 += charRandomization.get(j1);
                }
            } else if (l8.length() < 2) {
                for (int j1 = 0; j1 < charRandomization.size(); j1++) {
                    l8 += charRandomization.get(j1);
                }
            }
        }

        l1 = encode(l1,k1);
        l2 = encode(l2,k1);
        l3 = encode(l3,k1);
        l4 = encode(l4,k1);
        l5 = encode(l5,k1);
        l6 = encode(l6,k1);
        l7 = encode(l7,k1);
        l8 = encode(l8,k1);


        return l1 + "\n" + l2 + "\n" + l3 + "\n" + l4 + "\n" + l5 + "\n" + l6 + "\n" + l7 + "\n" + l8;
    }


    public static String encode(String eString, String k2) {
        int count = 0;
        String fString = "";
        for (int i = 0; i < eString.length(); i++) {
            int u1 = (int) eString.charAt(i) - 97;
            int u2 = (int) k2.charAt(count) - 97;
            int currChar = u1 + u2;
            if (currChar > 25) {
                currChar -= 26;
                currChar += 97;
            } else {
                currChar += 97;
            }
            fString += (char) currChar;
            count++;
            if (count == 5) {
                count = 0;
            }
        }
        return fString;
    }
}
