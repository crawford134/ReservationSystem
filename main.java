
import javafx.application.Application; 
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 


void start(Stage stage) throws Exception {
  
  root = FXMLLoader.load(getClass().getResource("FXML1.fxml"));
  
  Scene scene = new Scene (root); 
  stage.setScene(scene);
  stage.show();
}


/**
*   Launches the program 
*/
public static void main(String[] args){
  launch(args);
}
