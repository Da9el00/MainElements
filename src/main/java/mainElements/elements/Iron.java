package mainElements.elements;

import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

import java.io.File;
import java.util.Objects;

public class Iron extends Element{
    public Iron(AnchorPane scene) {
        super(ElementType.IRON, scene);
        setCircle(createCircle(Color.GRAY));

        setImage("ironTexture.png");
    }
}
