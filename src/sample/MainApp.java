package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import jssc.SerialPort;
import jssc.SerialPortException;


public class MainApp extends Application {

    @FXML
    protected Button cButton;
    private Controller controller;

    public static void main(String[] args) {
        launch(args);
    }

    // Открытие соединения по COM-порту
    public boolean connect() {
        return true;
    }

//   @Override
//    public void stop() throws Exception {
//        super.stop();
//        //controller.destroy();
//    }





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
        Parent root = (Parent) loader.load();
        primaryStage.setTitle("Obvent Control FX v. 0.1 rev. 0");
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
        Controller controller = (Controller) loader.getController();


        /*int[] a = {10, 20, 30, 40, 50};
        int sum = IntStream.of(a).sum();
        System.out.println("The sum is " + sum);*/

        //

       /* FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainview.fxml"));
        VBox root = (VBox)fxmlLoader.load();
        controller = (Controller) fxmlLoader.getController();
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();*/



        SerialPort serialPort = new SerialPort("COM1");
        try {
            serialPort.openPort();//Open serial port
            serialPort.setParams(SerialPort.BAUDRATE_9600,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);//Set params. Also you can set params by this string: serialPort.setParams(9600, 8, 1, 0);
            serialPort.writeBytes("This is a test string".getBytes());//Write data to port

            for (int i = 0; i < 50; i++) {
                serialPort.writeBytes("This is a test string".getBytes());//Write data to port
            }
            serialPort.closePort();//Close serial port
        }
        catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }





}
