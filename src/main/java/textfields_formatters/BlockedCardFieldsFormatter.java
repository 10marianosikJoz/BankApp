package textfields_formatters;

import javafx.scene.control.TextFormatter;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class BlockedCardFieldsFormatter {

    private Pattern getPatternBlockedCardIdNumber() {
        Pattern pattern = Pattern.compile(".{0,11}");
        return pattern;
    }

    public TextFormatter getBlockedCardIdNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternBlockedCardIdNumber().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }

    private Pattern getPatternBlockedCardCvcNumber() {
        Pattern pattern = Pattern.compile(".{0,3}");
        return pattern;
    }

    public TextFormatter getBlockedCardCvcNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternBlockedCardCvcNumber().matcher(change.getControlNewText()).matches() ? change : null;

        });


    }


    private Pattern getPatternBlockedCardNumber() {
        Pattern pattern = Pattern.compile(".{0,19}");
        return pattern;
    }

    public TextFormatter getBlockedCardNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternBlockedCardNumber().matcher(change.getControlNewText()).matches() ? change : null;

        });


    }


}
