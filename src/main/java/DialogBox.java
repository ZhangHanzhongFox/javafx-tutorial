import java.util.Collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
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

    /**
     * Flips the dialog box so Duke's image appears on the left.
     */
    private void flip() {
        ObservableList<Node> children = FXCollections.observableArrayList(getChildren());
        Collections.reverse(children);
        getChildren().setAll(children);
        setAlignment(Pos.TOP_LEFT);
    }

    /**
     * Creates a dialog box for a user message.
     *
     * @param text message to display
     * @param image user's image
     * @return dialog box aligned for the user
     */
    public static DialogBox getUserDialog(String text, Image image) {
        return new DialogBox(text, image);
    }

    /**
     * Creates a dialog box for a Duke response.
     *
     * @param text response to display
     * @param image Duke's image
     * @return dialog box aligned for Duke
     */
    public static DialogBox getDukeDialog(String text, Image image) {
        DialogBox dialogBox = new DialogBox(text, image);
        dialogBox.flip();
        return dialogBox;
    }
}
