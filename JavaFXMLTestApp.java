/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmltestapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author sebas
 */
public class JavaFXMLTestApp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void connect() throws SQLException { 
    	String url = "jdbc:postgresql://database-1.cakeqdu3h1oe.us-west-1.rds.amazonaws.com/";
		Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","password");
 
		Connection conn = DriverManager.getConnection(url, props);
		String sqlStatement = "SELECT * FROM Public.Patients;";
		conn.prepareStatement(sqlStatement).execute();
		conn.close();
    }

    /**
     * @param args the command line arguments
     * @throws SQLException 
     */
    public static void main(String[] args) throws SQLException {
    	connect();
        launch(args);
    }
    
}
