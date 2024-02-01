package exception;

/**
 * EmptyInputException are Exceptions when user did not
 * input any description for the task.
 */
public class EmptyInputException extends DukeException {
    private String message;

    /**
     * The constructor of EmptyInputException.
     *
     * @param message Task name.
     */
    public EmptyInputException(String message) {
        this.message = message;
    }

    /**
     * Returns the exception message.
     *
     * @return The error message of the exception.
     */
    @Override
    public String getMessage() {
        return "    OOPS!!! The description of a " + this.message + " cannot be empty.\n"
                + "    ------------------------------------------------\n";
    }

}

