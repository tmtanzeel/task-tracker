import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * MainFrame
 */
public class MainFrame extends Application {

    Scene scene;
    BorderPane borderPaneLayout = new BorderPane();
    Button addNewBranch, showBranchStatus;
    HBox horizontalLayout1, horizontalLayout2;

    @Override
    public void start(Stage primarystage) {        

        addNewBranch=new Button("Add");
        showBranchStatus = new Button("Status");

        horizontalLayout2 = new HBox(10);
        horizontalLayout2.setAlignment(Pos.CENTER);
        horizontalLayout2.getChildren().addAll(addNewBranch, showBranchStatus);

        borderPaneLayout = new BorderPane();
        borderPaneLayout.setBottom(horizontalLayout2);

        scene = new Scene(borderPaneLayout, 350, 200);

        primarystage.setScene(scene);
        primarystage.setTitle("TASK MANAGER");
        primarystage.setMinWidth(1000);
        primarystage.setMinHeight(450);
        primarystage.show();        
    }    
}
