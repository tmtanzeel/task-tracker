import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * MainFrame
 */
public class MainFrame extends Application {

    Scene scene;

    @Override
    public void start(Stage primarystage) {

        GridPane layout = new GridPane();
        scene = new Scene(layout, 350, 200);
        primarystage.setScene(scene);
        primarystage.setTitle("TASK MANAGER");
        primarystage.setMinWidth(1000);
        primarystage.setMinHeight(450);
        primarystage.show();        
    }    
}