package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_PERSONS;

import seedu.address.model.Model;
import seedu.address.model.person.Person;

import java.util.function.Predicate;

/**
 * Lists all persons in the address book to the user.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_SUCCESS = "Listed all persons";

    private final Predicate<Person> predicate;
    private final String resultMessage;

    public ListCommand() {
        this.predicate = PREDICATE_SHOW_ALL_PERSONS;
        this.resultMessage = MESSAGE_SUCCESS;
    }

    public ListCommand(Predicate<Person> predicate, String keyword) {
        this.predicate = predicate;
        this.resultMessage = "Listed all persons with subject " + keyword;
    }

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(this.predicate);
        return new CommandResult(resultMessage);
    }
}
