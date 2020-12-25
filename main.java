/**
To compile:  javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml main.java
To run: java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml main
 */
import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.fxml.FXML;

 
public class main extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @FXML
    private Text actiontarget;
    
    @FXML
    private void buttonPress (ActionEvent e) throws Exception
    {
        actiontarget.setText("Sign in button pressed");
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Application Title");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        btn.setOnAction(arg0 ->
        {
            try
            {
                buttonPress(arg0);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
        
        actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        //Setting the CSS IDs
        scenetitle.setId("welcome-text");
        actiontarget.setId("actiontarget");
        
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        //This might not work ("looks in the src\login directory")
        File f = new File("styles.css");
        scene.getStylesheets().add("file:///"+f.getAbsolutePath().replace("\\","/"));
        primaryStage.show();
        
        
    }
}
