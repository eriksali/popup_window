import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    
@Override
public void start(Stage primaryStage) {
        
primaryStage.setTitle("JavaFX GUI");
        

Button buttonmain= new Button("Click to go to pop up window");
buttonmain.setOnAction(e -> display());
//buttonmain.setOnAction(e -> Popup.display());

StackPane layout= new StackPane();

layout.getChildren().add(buttonmain);

        
Scene scene1= new Scene(layout, 300, 250);
primaryStage.setScene(scene1);
        
primaryStage.show();
}

  
public static void main(String[] args) {
launch(args);
}
    

    
public static void display()
{
Stage popupwindow=new Stage();
      
popupwindow.initModality(Modality.APPLICATION_MODAL);
popupwindow.setTitle("This is a pop up window");
      
      
Label label1= new Label("Pop up window now displayed");
      
     
Button button1= new Button("Close this pop up window");
     
     
button1.setOnAction(e -> popupwindow.close());
     
     

VBox layout= new VBox(10);
     
      
layout.getChildren().addAll(label1, button1);
      
layout.setAlignment(Pos.CENTER);
      
Scene scene1= new Scene(layout, 300, 250);
      
popupwindow.setScene(scene1);
      
popupwindow.showAndWait();
       
}

}
