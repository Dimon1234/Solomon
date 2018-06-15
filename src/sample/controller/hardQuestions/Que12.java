package controller.hardQuestions;

import controller.HardQuestsController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Que12 implements Initializable, Que {

    public ChoiceBox<Integer> chBox1, chBox2;
    private List<ChoiceBox<Integer>> list;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list = new ArrayList<>();
        ObservableList<Integer> observableList = FXCollections.observableArrayList(0, 1, 2, 3, 4, 5, 6);
        list.addAll(
                Arrays.asList(chBox1, chBox2)
        );
        list.forEach(ch -> ch.setItems(observableList));

    }

    @Override
    public boolean check() {
        StringBuilder builder = new StringBuilder();
        list.forEach(filed -> builder.append(filed.getValue()).append(" "));
        return builder.toString().trim().equals(HardQuestsController.getVariant().getAnswers().getListAnswers().get(11));
    }
}