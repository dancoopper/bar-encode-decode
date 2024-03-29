import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class encode {

    public static File Infile;
    public static File Outfile;



    public static void readNwright(File Infile){
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
        my_Dict.put("'", "030");
        my_Dict.put("I", "031");
        my_Dict.put("?", "032");
        my_Dict.put("\n", "033");
        my_Dict.put(",", "034");
        my_Dict.put("-", "035");


        try {
            Scanner input = new Scanner(Infile);

            while (input.hasNextLine()) {//reads as long as there is another line to read
                String line = input.nextLine();//read the file line by line
                line = line.toLowerCase();//set to lower case so that it is the same message no mater the case

                StringBuilder out = new StringBuilder();
                for(int i = 0; i< line.length(); i++) {//for the length of the line it goes through letter by letter and "encode" them
                    String letter = "" + line.charAt(i);
                    out.append(my_Dict.get(letter));//this is the "encoding"
                }
                FileWriter fileWriter = new FileWriter(Outfile, true);//make the obj that we use to wright to the output file
                BufferedWriter bw = new BufferedWriter(fileWriter);//the other obj we use
                bw.write(out.toString());
                bw.newLine();
                bw.close();//make sure that you are cleaning up after yourself
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException ev){
            throw new RuntimeException(ev);
        }

    }

    public static void main(String[] args) {
            System.out.print("what is the path of the INPUT file: ");
            Scanner input = new Scanner(System.in);
            String inPath = input.nextLine();
            Infile = new File(""+inPath);

            System.out.print("what is the path of the OUTPUT file: ");
            Scanner output = new Scanner(System.in);
            String outPath = output.nextLine();
            Outfile = new File(""+outPath);

            readNwright(Infile);

        }
    }
