package mainElements.elements;

import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

import java.io.File;
import java.util.Objects;

public class Wood extends Element{

    public Wood(AnchorPane scene) {
        super(ElementType.WOOD, scene);
        setCircle(createCircle(Color.BROWN));

        setImage("woodTexture.png");
    }
}
