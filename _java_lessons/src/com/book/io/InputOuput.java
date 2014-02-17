package book.io;

import java.io.*;

public class InputOuput {
    public static void main(String[] args) throws IOException {
        byte[] data = {'h', 'e', 'l', 'l', '5'};
        InputStream in = new ByteArrayInputStream(data);
        OutputStream out = new FileOutputStream("F:\\maksym.tashchuk\\file.txt");
        OutputStream outputStream = new FileOutputStream(new File("file.txt"));
        outputStream.write(data);
        copy(in, out);
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        try {
            int buffer;
            while ((buffer = in.read()) != -1) {
                out.write(buffer);
            }
            out.flush();
        } finally {
            out.flush();
        }

        in.close();

        out.close();
    }
}
