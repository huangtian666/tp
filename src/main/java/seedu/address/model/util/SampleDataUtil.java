package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.TuitionTime;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(
                        new Name("Alex Yeoh"),
                        new Phone("81234567"),
                        new Email("alexyeoh@example.com"),
                        new Address("Blk 30 Geylang Street 29, #06-40"),
                        new TuitionTime("Monday, 1400-1600"),
                        getTagSet("Math")
                ),
            new Person(
                        new Name("Bernice Yu"),
                        new Phone("98765432"),
                        new Email("berniceyu@example.com"),
                        new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                        new TuitionTime("Tuesday, 1000-1200"),
                        getTagSet("Math", "Science")
                ),
            new Person(
                        new Name("Charlotte Oliveiro"),
                        new Phone("87654321"),
                        new Email("charlotte@example.com"),
                        new Address("Blk 11 Ang Mo Kio Street 74, #11-04"),
                        new TuitionTime("Wednesday, 0930-1130"),
                        getTagSet("English")
                ),
            new Person(
                        new Name("David Li"),
                        new Phone("88888888"),
                        new Email("lidavid@example.com"),
                        new Address("Blk 436 Serangoon Gardens Street 26, #16-43"),
                        new TuitionTime("Thursday, 1500-1700"),
                        getTagSet("Chinese")
                ),
            new Person(
                        new Name("Irfan Ibrahim"),
                        new Phone("98765432"),
                        new Email("irfan@example.com"),
                        new Address("Blk 47 Tampines Street 20, #17-35"),
                        new TuitionTime("Friday, 0800-1000"),
                        getTagSet("Hindi")
                ),
            new Person(
                        new Name("Roy Balakrishnan"),
                        new Phone("91234567"),
                        new Email("royb@example.com"),
                        new Address("Blk 45 Aljunied Street 85, #11-31"),
                        new TuitionTime("Saturday, 1300-1500"),
                        getTagSet("Tamil")
                )
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
