package com.svgs;


import org.apache.commons.text.StringEscapeUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class TriviaController {

    @FXML
    private ToggleGroup answer;

    @FXML
    private RadioButton answerA;

    @FXML
    private RadioButton answerB;

    @FXML
    private RadioButton answerC;

    @FXML
    private RadioButton answerD;

    @FXML
    private Label questionText;

    @FXML
    void initialize() {
        
    }

    // Use this method to get rid of HTML escape characters
    public String unescapeString(String s) {
        s = StringEscapeUtils.unescapeHtml4(s);
        return s;
    }

    @FXML
    void submit(ActionEvent event) {
        RadioButton selectedAnswer = (RadioButton) answer.getSelectedToggle();
        if(selectedAnswer == null) {
            return;
        }

        System.out.println(selectedAnswer.getText());
    }
}
