import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Displays a chat message alongside the speaker's picture.
 */
public class DialogBox extends HBox {

    /**
     * Creates a dialog box for a message and speaker image.
     *
     * @param text message to display
     * @param image speaker image to display
     */
    public DialogBox(String text, Image image) {
        Label dialog = new Label(text);
        ImageView displayPicture = new ImageView(image);

        dialog.setWrapText(true);
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);
        setAlignment(Pos.TOP_RIGHT);
        getChildren().addAll(dialog, displayPicture);
    }
}
