package sample;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Colby Nicoletti
 * @brief Production Line Tracker. Helps easily make products and keeps track of each product made.
 */


public class Main extends Application {


  static Statement stmt = null;

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
  public static void main(String[] args) {
    final String JDBC_DRIVER = "org.h2.Driver";
    final String DB_URL = "jdbc:h2:./res/ProductDB";

    final String USER = "";
    final String PASS = "";
    Connection conn = null;

    try {
      Class.forName(JDBC_DRIVER);
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      System.out.println("Database connection established.");

    } catch (ClassNotFoundException e) {
      e.printStackTrace();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    launch(args);
  }

  /**
   * Passes String sql through executeSql so that you can save stuff from code to database.
   *
   * @param sql
   */
  public static void executeSql(String sql) {
    try {
      stmt.executeUpdate(sql);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
