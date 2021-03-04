package textfields_formatters;

import javafx.scene.control.TextFormatter;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class ChangePinCardFieldsFormatter {

    private Pattern getPatternChangePinCard(){
        Pattern pattern = Pattern.compile(".{0,4}");
        return pattern;
    }

    public TextFormatter getChangePinCardFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternChangePinCard().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }
}
