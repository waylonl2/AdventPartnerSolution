import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class PartnerSolution {
    public static void main(String[] args) {
        ArrayList<String> fileData = getFileData("src/data");
        String str = "hanukkah";
        int total = 0;
        for (int i = 0; i < fileData.size() - 1; i++) {
            String line = "";
            int k = 0;
            for (int j = 0; j < fileData.get(i).length(); j++) {
                int num = convertToLetterNum(fileData.get(i).charAt(j));
                if (k > fileData.getLast().length() - 1) {
                    k = 0;
                }
                int keyLetterNum = convertToLetterNum(fileData.getLast().charAt(k));
                k++;
                int decodedLetterNum = letterNumShift(num, keyLetterNum);
                char decodedLetter = convertToLetter(decodedLetterNum);
                line += decodedLetter;
            }

            int index = -1;
            while (!(line.indexOf(str.charAt(i)) == -1)) {
                index = line.indexOf(str.charAt(i));
                line = line.substring(index + 1);
            }
            total += index;
        }
        System.out.println(total);
    }
    public static int convertToLetterNum(char input) {
        return input - 'a';
    }


    public static char convertToLetter(int input) {
        return (char) (input + 'a');
    }


    public static int letterNumShift(int input, int keyLetterNum) {
        int num = input - keyLetterNum;
        if (num < 0) {
            num += 25;
        }
        return num;
    }


    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.isEmpty())
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}


