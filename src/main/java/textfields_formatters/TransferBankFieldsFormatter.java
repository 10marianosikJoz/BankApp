package textfields_formatters;

import javafx.scene.control.TextFormatter;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class TransferBankFieldsFormatter {

    private Pattern getPatternNameField() {
        return Pattern.compile(".{0,15}");
    }

    public TextFormatter getNameFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternNameField().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }

    private Pattern getPatternSurnameField() {
        return Pattern.compile(".{0,20}");
    }

    public TextFormatter getSurnameFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternSurnameField().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }

    private Pattern getPatternAccountNumberField() {
        return Pattern.compile(".{0,22}");
    }

    public TextFormatter getAccountNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternAccountNumberField().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }

    private Pattern getPatternAddressField() {
        return Pattern.compile(".{0,25}");
    }

    public TextFormatter getAddressFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternAddressField().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }

    private Pattern getPatternNumberField() {
        return Pattern.compile(".{0,25}");
    }

    public TextFormatter getNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternNumberField().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }

    private Pattern getPatternAccountField() {
        return Pattern.compile(".{0,25}");
    }

    public TextFormatter getAccountrFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternAccountField().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }
}
