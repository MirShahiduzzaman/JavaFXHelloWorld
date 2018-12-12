package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController
{
    public Label helloWorld;
    public Label numClicked;

    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
    }
}
