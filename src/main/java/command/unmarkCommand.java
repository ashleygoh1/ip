package command;
import duke.TaskList;
import duke.Ui;

/**
 * Command to unmark a specific task in the task list.
 */
public class UnmarkCommand extends Command {

    private TaskList taskList;
    private Ui ui;
    public UnmarkCommand(TaskList taskList, Ui ui) {
        super(taskList, ui);
    }

    /**
     * Call unmark function
     *
     * @param taskList The task list which the command will modify.
     * @param ui The ui to get the input of the user.
     * @throws Exception If input is not valid.
     */
    public void execute(TaskList taskList, Ui ui) throws Exception {
        String input = ui.getInput();
        String indexStr = input.split(" ")[1];
        int position = Integer.parseInt(indexStr) - 1;
        taskList.unmark(position);
    }

    public boolean isExit() {
        return false;
    }
}
