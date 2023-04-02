import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class decode {
    public static void main(String[] args) {
        HashMap<String, String> my_Dict = new HashMap<>();

        my_Dict.put("001", "a");
        my_Dict.put("002", "b");
        my_Dict.put("003", "c");
        my_Dict.put("004", "d");
        my_Dict.put("005", "e");
        my_Dict.put("006", "f");
        my_Dict.put("007", "g");
        my_Dict.put("008", "h");
        my_Dict.put("009", "i");
        my_Dict.put("010", "j");
        my_Dict.put("011", "k");
        my_Dict.put("012", "l");
        my_Dict.put("013", "m");
        my_Dict.put("014", "n");
        my_Dict.put("015", "o");
        my_Dict.put("016", "p");
        my_Dict.put("017", "q");
        my_Dict.put("018", "r");
        my_Dict.put("019", "s");
        my_Dict.put("020", "t");
        my_Dict.put("021", "u");
        my_Dict.put("022", "v");
        my_Dict.put("023", "w");
        my_Dict.put("024", "x");
        my_Dict.put("025", "y");
        my_Dict.put("026", "z");
        my_Dict.put("027", "!");
        my_Dict.put("028", ".");
        my_Dict.put("029", " ");
        my_Dict.put("030", "'");
        my_Dict.put("031", "I");
        my_Dict.put("032", "?");
        my_Dict.put("033", "\n");
        my_Dict.put("034", ",");
        my_Dict.put("035", "-");

        Scanner fPath = new Scanner(System.in);
        System.out.print("what is the full path to the encoded file: ");
        String path = fPath.nextLine();

        File file = new File(""+path);
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(input.hasNextLine()) {
            String code = input.nextLine();
            String value = "";
            int counter = 0;
            for (int i = 0; i < code.length(); i++) {

                String numbers = "" + code.charAt(i);
                value = value + numbers;
                counter += 1;
                if (counter % 3 != 0) {
                    continue;
                }
                System.out.print(my_Dict.get(value));
                value = "";
            }
        }
    }
}
