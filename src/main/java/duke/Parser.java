package duke;
import command.*;

/**
 * Parser deals with making sense of the user command.
 */
public class Parser {
    private static TaskList taskList;
    private static Ui ui;

    /**
     * The constructor of Parser.
     *
     * @param taskList The task list which the command will modify.
     * @param ui The ui to get the input of the user.
     */
    public Parser(TaskList taskList, Ui ui) {
        this.taskList = taskList;
        this.ui = ui;
    }

    /**
     * Returns a specific command that correspond to the Actions
     * found in the full user input.
     *
     * @param input The full user input.
     * @return A specific command that corresponds to the specific Actions.
     */
    public static Command parse(String input)  {
        String temp = input.split(" ")[0];
        Actions action = Actions.valueOf(temp.toUpperCase());
        switch (action) {
        case BYE:
            return new ByeCommand(taskList, ui);
        case LIST:
            return new ShowListCommand(taskList, ui);
        case MARK:
            return new MarkCommand(taskList, ui);
        case UNMARK:
            return new UnmarkCommand(taskList, ui);
        case TODO:
            return new TodoCommand(taskList, ui);
        case DEADLINE:
            return new DeadlineCommand(taskList, ui);
        case EVENT:
            return new EventCommand(taskList, ui);
        case DELETE:
            return new DeleteCommand(taskList, ui);
        default:
            return new InvalidCommand(taskList, ui);
        }
    }
}
