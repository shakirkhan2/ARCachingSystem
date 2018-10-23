package database;
import java.sql.*;
import database.models.Page;

/**
 * Created by shakir on 23/10/18.
 */
public class DatabaseConnection {
    private static final String DB_NAME = "arcache";
    private static final String DB_TABLE_NAME = "cache";
    private static final String DB_USER = "arcache";
    private static final String DB_PASSWORD = "arc@123";
    private static final String DB_HOST = "127.0.0.1";
    private static final String DB_PORT = "3306";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
    private static Connection connection = null;

    public DatabaseConnection() {
        getConnection();
    }

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        }
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        connection = null;
    }

    public void insertPageIntoDatabase(Page page) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("INSERT into " + DB_TABLE_NAME + " VALUES (?, ?)");
        ps.setInt(1, page.getPageId());
        ps.setInt(2, page.getPageValue());
        ps.executeUpdate();
    }

    public boolean checkIfPageExistsInDatabase(Page page) throws SQLException {
        Statement statement = getConnection().createStatement();
        ResultSet rs = statement.executeQuery("SELECT  * from " + DB_TABLE_NAME + " WHERE  pageId = " + page.getPageId());

        boolean exists = rs.next();

        rs.close();
        statement.close();
        return exists;
    }

    public void updatePageInDatabase(Page page) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("UPDATE " + DB_TABLE_NAME + " SET pageValue=? WHERE pageId=?");
        ps.setInt(1, page.getPageValue());
        ps.setInt(2, page.getPageId());
        ps.executeUpdate();
    }

    public void saveUpdate(Page page) throws SQLException {
        if (checkIfPageExistsInDatabase(page)) {
            updatePageInDatabase(page);
        } else {
            insertPageIntoDatabase(page);
        }

    }
}
