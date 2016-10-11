package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    protected Button connectButton;
    @FXML
    protected Button disconnectButton;
    @FXML
    protected ComboBox portList;
    @FXML
    protected Label stopLabel;
    @FXML
    protected Label statusLabelParam;



    public void connectButtonPressed(ActionEvent actionEvent) {
        System.out.println("connect Button pressed");
        statusLabelParam.setText("connect"); // TODO: Добавить обработчик изменения состояния и в нем устанавливать отображаемое состояние порта
        //MainApp.
    }

    public void disconnectButtonPressed(ActionEvent actionEvent) {
        System.out.println("disconnect Button pressed");
        statusLabelParam.setText("disconnect"); // TODO: Добавить обработчик изменения состояния и в нем устанавливать отображаемое состояние порта

    }




}


