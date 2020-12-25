/**
To compile:  javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml main.java
To run: java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml main
 */
import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.net.URL;
import java.net.URI;
import java.net.MalformedURLException;
 
public class main extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @FXML private Text actiontarget;
    
    @FXML private void buttonPress (ActionEvent e) throws Exception
    {
        actiontarget.setText("Sign in button pressed");
    }
    
    @Override
    public void start(Stage primaryStage) throws MalformedURLException, IOException {
        
        File fxmlFile = new File("mainFXML.fxml");
        Parent root = FXMLLoader.load(fxmlFile.toURI().toURL());
        
        primaryStage.setTitle("Application Title");
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
}
