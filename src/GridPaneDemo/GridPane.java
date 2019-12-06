package GridPaneDemo;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import javax.swing.JOptionPane;
import java.awt.*;

public class GridPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK");
        Button btCancel = new Button("cancel");

        OKHandlerClass handler1 = new OKHandlerClass(); // object created
        btOK.setOnAction(handler1);

        CancelHandlerClass handler2 = new CancelHandlerClass(); // object created
        btCancel.setOnAction(handler2);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Event handling Example");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.getChildren().addAll(btOK, btCancel);
    }
    class OKHandlerClass implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            JOptionPane.showMessageDialog(null, "You clicked ok button");
        }
    }
    class CancelHandlerClass implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            JOptionPane.showMessageDialog(null, "You clicked cancel button");
        }
    }
}
