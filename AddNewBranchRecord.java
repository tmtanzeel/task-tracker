import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/**
 * AddNewBranchRecord
 */
public class AddNewBranchRecord {
    
    static TextField branchNameTextField, userStoryTextField;

    public static void askInitialDetails() {
        Scene scene;
        final Stage stage = new Stage();
        Button doneButton, clearButton, cancelButton;
        ComboBox combo_box;
        Label branchNameLabel, userStoryLabel, branchSourceNameLabel;
        GridPane gridPaneLayout;
        HBox horizontalBoxLayout;
        BorderPane borderPaneLayout;

        doneButton = new Button("Done");
        clearButton = new Button("Clear");
        cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> {
            stage.close();
        });

        branchNameLabel = new Label("Branch name");
        branchSourceNameLabel = new Label("Pulled from");
        userStoryLabel = new Label("Belongs to:");

        branchNameTextField = new TextField("");
        branchNameTextField.setPromptText("1000-branchname");
        userStoryTextField = new TextField("");
        userStoryTextField.setPromptText("2000-userstory");

        final String branches[] = {"master"};

        // Create a combo box
        combo_box = new ComboBox(FXCollections.observableArrayList(branches)); 


        gridPaneLayout = new GridPane();

        horizontalBoxLayout = new HBox(10);
        horizontalBoxLayout.setAlignment(Pos.CENTER);
        horizontalBoxLayout.getChildren().addAll(doneButton, clearButton, cancelButton);

        gridPaneLayout.setPadding(new Insets(10, 10, 10, 10));
        gridPaneLayout.setVgap(8);
        gridPaneLayout.setHgap(10);
        gridPaneLayout.setAlignment(Pos.CENTER);
        gridPaneLayout.getChildren().addAll(branchNameLabel, combo_box, branchSourceNameLabel, userStoryLabel,  branchNameTextField, userStoryTextField);

        GridPane.setConstraints(branchNameLabel, 0, 0);
        GridPane.setConstraints(branchNameTextField, 1, 0);
        GridPane.setConstraints(branchSourceNameLabel, 0, 1);
        GridPane.setConstraints(combo_box, 1, 1);
        GridPane.setConstraints(userStoryLabel, 0, 2);
        GridPane.setConstraints(userStoryTextField, 1, 2);

        borderPaneLayout = new BorderPane();
        borderPaneLayout.setPadding(new Insets(10, 10, 10, 10));
        borderPaneLayout.setTop(gridPaneLayout);
        borderPaneLayout.setBottom(horizontalBoxLayout);

        scene=new Scene(borderPaneLayout, 350, 200);

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("INITIAL DETAILS");
        stage.setScene(scene);
        stage.showAndWait();
    }
}