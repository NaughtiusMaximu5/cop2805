
import javafx.scene.layout.Pane;

public abstract class FXMLDocumentBase extends Pane {

    public FXMLDocumentBase() {

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(650.0);
        setPrefWidth(650.0);
        setStyle("-fx-background-color: #001229;");

    }
}
