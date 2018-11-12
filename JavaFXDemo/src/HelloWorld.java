import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn1 = new Button();
        btn1.setText("Say 'Hello World'");
        Button btn2 = new Button();
        btn2.setText("Say 'QUIT'");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("This just happened");
            }
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("QUIT");
            }
        });

        
        TilePane root = new TilePane();
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}