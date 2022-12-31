package nested.example;

public class NestedClassExample2 {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();
        checkBox.setOnSelectListener(new BackgroundChangeListener());
        checkBox.select();
    }
}
