package seedu.address.ui.calendar;

import java.time.LocalDate;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import seedu.address.model.task.Task;
import seedu.address.ui.UiPart;

/**
 * An UI component that displays information of a {@code Person}.
 */
public class DayCard extends UiPart<Region> {

    private static final String FXML = "DayCard.fxml";

    private ObservableList<Task> taskList;
    private LocalDate date;

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    @FXML
    private VBox cardPane;
    @FXML
    private Label day;
    @FXML
    private Label numOfTask;

    /**
     * Creates a {@code PersonCode} with the given {@code Person} and index to display.
     */
    public DayCard(ObservableList<Task> filteredTaskList, LocalDate date) {
        super(FXML);
        this.date = date;
        this.taskList = filteredTaskList;
        fillDay();
    }

    /**
     * Fills up the list of task for the day.
     */
    private void fillDay() {
        day.setText(String.format("%d", date.getDayOfMonth()));
        if (!taskList.isEmpty()) {
            numOfTask.setText(taskList.size() == 1 ? "1 task" : String.format("%d tasks", taskList.size()));
        }
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof DayCard)) {
            return false;
        }

        // state check
        DayCard card = (DayCard) other;
        return taskList.equals(card.taskList)
                && date.equals(card.date);
    }
}
