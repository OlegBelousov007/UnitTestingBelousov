import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import third_task.AddressBook;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {
    private AddressBook addressBook;

    @BeforeEach
    public void setUp() {
        addressBook = new AddressBook();
    }

    @Test
    public void testAddContact() {
        addressBook.addContact("Pipopo", "123456789");
        assertEquals("123456789", addressBook.getPhone("Alice"));
    }

    @Test
    public void testGetPhone() {
        addressBook.addContact("Papipi", "987654321");
        assertEquals("987654321", addressBook.getPhone("Bob"));
        assertNull(addressBook.getPhone("Charlie"));
    }

    @Test
    public void testRemoveContact() {
        addressBook.addContact("Zelebobick", "555555555");
        addressBook.removeContact("Zelebobick");
        assertNull(addressBook.getPhone("Zelebobick"));
    }

    @Test
    public void testRemoveNonExistentContact() {
        addressBook.removeContact("Eve");
        assertNull(addressBook.getPhone("Eve"));
    }
}

