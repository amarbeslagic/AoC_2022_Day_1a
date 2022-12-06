import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        int maxCal = 0;

        File file = new File("inputs//input_AoC_1a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while((s = br.readLine()) != null) {
            listOfStrings.add(s);
        }

        int sum = 0;

        for(String str : listOfStrings){
            if(!str.isEmpty()){
                sum += Integer.parseInt(str);
            }
            else {
                if(sum > maxCal) maxCal = sum;
                sum = 0;
            }
        }

        System.out.println(maxCal);
    }
}