package editor;

import javafx.scene.control.TextArea;

import java.util.Arrays;
import java.util.List;

public class EditorTextArea extends TextArea {
    public List<String> getTextAsList() {
        return Arrays.asList(getText().split("\n"));
    }
    public boolean hasUnsavedChanges(List<String> oldContent) {
        return !getTextAsList().equals(oldContent);
        //if (oldContent == null)
        //    System.out.println(oldContent.toString());
        //else
        //    return getTextAsList().equals(oldContent);

    }
}