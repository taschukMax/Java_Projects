package book;

import book.access.connection.Connection;
import book.access.connection.ConnectionManager;

public class Main1 {
    public static void main(String[] args) {
        Connection connection = ConnectionManager.getConnection();
        while (connection != null) {
            System.out.println(connection);
            connection = ConnectionManager.getConnection();
        }

    }
}
