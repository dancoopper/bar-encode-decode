import java.util.HashMap;

public class encode {
    public static void main(String[] args) {
        HashMap<String, String> my_Dict = new HashMap<>();

       my_Dict.put("a", "001");
        my_Dict.put("b", "002");
        my_Dict.put("c", "003");
        my_Dict.put("d", "004");
        my_Dict.put("e", "005");
        my_Dict.put("f", "006");
        my_Dict.put("g", "007");
        my_Dict.put("h", "008");
        my_Dict.put("i", "009");
        my_Dict.put("j", "010");
        my_Dict.put("k", "011");
        my_Dict.put("l", "012");
        my_Dict.put("m", "013");
        my_Dict.put("n", "014");
        my_Dict.put("o", "015");
        my_Dict.put("p", "016");
        my_Dict.put("q", "017");
        my_Dict.put("r", "018");
        my_Dict.put("s", "019");
        my_Dict.put("t", "020");
        my_Dict.put("u", "021");
        my_Dict.put("v", "022");
        my_Dict.put("w", "023");
        my_Dict.put("x", "024");
        my_Dict.put("y", "025");
        my_Dict.put("z", "026");
        my_Dict.put("!", "027");
        my_Dict.put(".", "028");
        my_Dict.put(" ", "029");
        my_Dict.put("'","030");
        my_Dict.put("I", "031");
        my_Dict.put("?", "032");
        my_Dict.put("\n", "033");
        my_Dict.put(",", "034");
                
        String words = "According to all known laws of aviation, there is no way a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyway because bees don't care what humans think is impossible. Yellow, black. Yellow, black. Yellow, black. Yellow, black.";
        words = words.toLowerCase();
        for(int i = 0; i<words.length(); i++){

          String letter = "" + words.charAt(i);

            System.out.print(my_Dict.get(letter));

        }
    }
}