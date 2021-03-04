package textfields_formatters;

import javafx.scene.control.TextFormatter;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class MoneyToPhoneFieldsFormatter {

    private Pattern getPatternPhoneNumber() {
        Pattern pattern = Pattern.compile(".{0,12}");
        return pattern;
    }
    private Pattern getPatternCodeNumber(){
        Pattern pattern = Pattern.compile(".{0,5}");
        return pattern;
    }

    public TextFormatter getPhoneNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternPhoneNumber().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }

    public TextFormatter <TextFormatter> getCodeNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternCodeNumber().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }


}
