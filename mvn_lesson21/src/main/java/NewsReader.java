import java.io.*;

public class NewsReader extends Thread {
    private File file;

    public NewsReader(File file) {
        this.file = file;
    }

    private static String readFile(File file) {
        String msg = "";
        String line;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            while ((line = br.readLine()) != null) {
                msg += line + "\n";
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(msg);
        return msg;
    }

    @Override
    public void run() {
        NewsReader.readFile(file);
    }
}
