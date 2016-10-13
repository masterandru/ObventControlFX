package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;


public class MainApp extends Application {

    @FXML
    protected Button cButton;
    private Controller controller;

    // Открытие соединения по COM-порту
    public boolean connect() {
        return true;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {


//        FXMLLoader fxmlloader;

        /*Parent root = FXMLLoader.load(getClass().getResource("mainview.fxml"));
        primaryStage.setTitle("Obvent Control FX v. 0.1 rev. 0");
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();*/
        //

        /*
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.addAll(Arrays.asList("1","2","3"));
        arrayList.forEach((v)-> {System.out.println("Item : " + v );});
        */

        // Get Controller from Application
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainview.fxml"));
        Parent root = (Parent)loader.load();
        primaryStage.setTitle("Obvent Control FX v. 0.1 rev. 0");
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
        Controller controller = (Controller)loader.getController();


        //

       /* FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainview.fxml"));
        VBox root = (VBox)fxmlLoader.load();
        controller = (Controller) fxmlLoader.getController();
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();*/


    }

//   @Override
//    public void stop() throws Exception {
//        super.stop();
//        //controller.destroy();
//    }


    public static void main(String[] args) {
        launch(args);
    }
}
