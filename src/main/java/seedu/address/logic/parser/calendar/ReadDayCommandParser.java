package seedu.address.logic.parser.calendar;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.time.LocalDate;

import seedu.address.logic.commands.calendar.ReadDayCommand;
import seedu.address.logic.parser.Parser;
import seedu.address.logic.parser.ParserUtil;
import seedu.address.logic.parser.exceptions.ParseException;

public class ReadDayCommandParser implements Parser<ReadDayCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the ReadDayCommand
     * and returns a ReadDayCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public ReadDayCommand parse(String args) throws ParseException {
        try {
            LocalDate date = ParserUtil.parseDate(args);
            return new ReadDayCommand(date);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, ReadDayCommand.MESSAGE_USAGE), pe);
        }
    }
}
