package productlinetracker;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Start of the program.
 *
 * @author Colby Nicoletti
 */


public class Main extends Application {


  static Statement stmt = null;
  static Connection conn = null;
  static PreparedStatement preparedStatement;

  /**
   * Passes Stage primaryStage through start.
   *
   * @param primaryStage the first thing a user sees.
   * @throws Exception lets compiler know that something it might have trouble accepting is being
   *                   done.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Production Recorder");
    primaryStage.setScene(new Scene(root, 600, 450));
    primaryStage.show();
  }

  /**
   * The main section in the program. This is where the database is connected to the code.
   *
   * @param args String
   */
  public static void main(String[] args) throws SQLException {

    launch(args);
  }

  public static Connection connectDb() {
    final String jdbc_driver = "org.h2.Driver";
    final String db_url = "jdbc:h2:./res/ProductDB";

    final String user = "";
    String pass = "";

    try{
      Properties prop = new Properties();
      prop.load(new FileInputStream("res/properties"));
      pass = prop.getProperty("password");
    } catch (Exception e){
      System.out.println("Error with database password.");
    }

    System.out.println("Attempting to connect to database.");
    try {
      Class.forName(jdbc_driver);
      conn = DriverManager.getConnection(db_url, user, pass);
      stmt = conn.createStatement();
      System.out.println("Database connection established.");

    } catch (ClassNotFoundException e) {
      e.printStackTrace();

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }

  /**
   * Passes String sql through executeSql so that you can save stuff from code to database.
   *
   * @param productName String, manufacturer String, itemType ItemType
   */
  public static void executeSql(String productName, String manufacturer, ItemType itemType) {
    try {
      String sql = "INSERT INTO PRODUCT(NAME, MANUFACTURER, TYPE) VALUES (?,?,?)";
      preparedStatement = conn.prepareStatement(sql);
      preparedStatement.setString(1,productName);
      preparedStatement.setString(2, manufacturer);
      preparedStatement.setString(3, itemType.toString());
      preparedStatement.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
