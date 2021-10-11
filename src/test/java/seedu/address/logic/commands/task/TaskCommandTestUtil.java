package seedu.address.logic.commands.task;

import static seedu.address.logic.parser.CliSyntax.PREFIX_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.PREFIX_END;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MODULE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_START;

public class TaskCommandTestUtil {
    public static final String VALID_NAME_A = "sleep early";
    public static final String VALID_NAME_B = "Do work";
    public static final String VALID_DESCRIPTION_A = "Early lesson tomorrow";
    public static final String VALID_DESCRIPTION_B = "Finish before Friday 2pm";
    public static final String VALID_MODULE_A = "CS1231";
    public static final String VALID_MODULE_B = "MA1521";
    public static final String VALID_START_A = "2021-10-07T22:00";
    public static final String VALID_START_B = "2021-10-09T14:00";
    public static final String VALID_END_A = "2021-10-07T23:59";
    public static final String VALID_END_B = "2021-10-09T20:00";

    public static final String NAME_DESC_A = " " + PREFIX_NAME + VALID_NAME_A;
    public static final String NAME_DESC_B = " " + PREFIX_NAME + VALID_NAME_B;
    public static final String DESCRIPTION_DESC_A = " " + PREFIX_DESCRIPTION + VALID_DESCRIPTION_A;
    public static final String DESCRIPTION_DESC_B = " " + PREFIX_DESCRIPTION + VALID_DESCRIPTION_B;
    public static final String MODULE_DESC_A = " " + PREFIX_MODULE + VALID_MODULE_A;
    public static final String MODULE_DESC_B = " " + PREFIX_MODULE + VALID_MODULE_B;
    public static final String START_DESC_A = " " + PREFIX_START + VALID_START_A;
    public static final String START_DESC_B = " " + PREFIX_START + VALID_START_B;
    public static final String END_DESC_A = " " + PREFIX_END + VALID_END_A;
    public static final String END_DESC_B = " " + PREFIX_END + VALID_END_B;


    public static final String INVALID_NAME_DESC = " " + PREFIX_NAME + "Do Work&"; // '&' not allowed in names
    public static final String INVALID_DESCRIPTION_DESC = " " + PREFIX_DESCRIPTION; //empty string not
    // allowed for description
    public static final String INVALID_MODULE_DESC = " " + PREFIX_MODULE; // empty string not allowed for
    // module
    public static final String INVALID_START_DESC = " " + PREFIX_START + "haha"; // unable to parse such a
    // string into a datetime
    public static final String INVALID_END_DESC = " " + PREFIX_END + "124012240"; // unable to parse such a
    // string into a datetime
}