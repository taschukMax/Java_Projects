package lesson17;

import java.io.*;

public class UserSavedProperties {
    public static void createProperties(PageProperties pageProperties) {
        pageProperties = new PageProperties(pageProperties.getFontSize(), pageProperties.getFont(), pageProperties.getFontColor(), pageProperties.getText());
        try (ObjectOutputStream saveProperties = new ObjectOutputStream(new FileOutputStream("D:\\_work\\_java\\JavaEE_Lesson13\\Properties.ser"))) {
            saveProperties.writeObject(pageProperties);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static PageProperties readProperties() {
        PageProperties pageProperties = null;
        try (ObjectInputStream readProperties = new ObjectInputStream(new FileInputStream("D:\\_work\\_java\\JavaEE_Lesson13\\Properties.ser"))) {
            pageProperties = (PageProperties) readProperties.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.toString());
        }
        return pageProperties;
    }
}
