import java.io.*;

public class Scanner {

    public static void main(String[] args) throws IOException {

        String[] cmd = {"/bin/bash","-c","sudo blescan"};
        Process pb = Runtime.getRuntime().exec(cmd);

        String line;
        BufferedReader input = new BufferedReader(new InputStreamReader(pb.getInputStream()));
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        input.close();

    }

}
