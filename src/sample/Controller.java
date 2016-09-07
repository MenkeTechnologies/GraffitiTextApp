package sample;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.*;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Rectangle rectangle;


    @FXML
    private Text text;

    @Override
    public void initialize(URL url, ResourceBundle rb){


        FadeTransition fd = new FadeTransition(Duration.seconds(1.5), text);
        fd.setFromValue(1.0);
        fd.setToValue(0);
        fd.setCycleCount(Animation.INDEFINITE);
        fd.setAutoReverse(true);
        fd.play();

        rectangle.setVisible(false);

//        rectangle.setStroke(Color.BLACK);
//        rectangle.setStrokeWidth(5);
//        rectangle.setStrokeType(StrokeType.OUTSIDE);


//        for (int i = 0; i < Font.getFamilies().size(); i++) {
//            System.out.println(Font.getFamilies().get(i));
//        }

        Font f2 = Font.font("Wildstyle", FontWeight.BOLD, 14);



        text.setFont(Font.font("Wildstyle", FontPosture.ITALIC, 175));
        text.setFill(Color.BLUE);
//        text.setUnderline(true);
        text.setStroke(Color.BLACK);
        text.setStrokeWidth(5);
        text.setX(0);
        text.setEffect(new Reflection());
//        text.setOnMouseClicked(e ->{
//            System.exit(0);
//        });

    }



}
