package module3CodeTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import contactService.ContactService;
import contactService.contact;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService cs = new ContactService();
		contact cs1 = new contact("111", "Justin", "McJustin", "1234567890", "123 Justin St");
		assertTrue(cs.addContact(cs1));
	}

	@Test
	void testDeleteContact() {
		ContactService cs = new ContactService();
		contact cs1 = new contact("111", "Justin", "McJustin", "1234567890", "123 Justin St");
		contact cs2 = new contact("112", "Justin2", "McJustin2", "1234567891", "123 Justin St2");
		cs.addContact(cs1);
		cs.addContact(cs2);
		assertTrue(cs.deleteContact("112"));
		assertFalse(cs.deleteContact("114"));
	}

	@Test
	void testUpdateContactFirstName() {
		ContactService cs = new ContactService();
		contact cs1 = new contact("111", "Justin", "McJustin", "1234567890", "123 Justin St");
		contact cs2 = new contact("112", "Justin2", "McJustin2", "1234567891", "123 Justin St2");
		cs.addContact(cs1);
		cs.addContact(cs2);
		assertFalse(cs.updateContactFirstName("114", "Dustin"));
		assertTrue(cs.updateContactFirstName("112", "Dustin"));
	}

	@Test
	void testUpdateContactLastName() {
		ContactService cs = new ContactService();
		contact cs1 = new contact("111", "Justin", "McJustin", "1234567890", "123 Justin St");
		contact cs2 = new contact("112", "Justin2", "McJustin2", "1234567891", "123 Justin St2");
		cs.addContact(cs1);
		cs.addContact(cs2);
		assertFalse(cs.updateContactLastName("114", "Doe"));
		assertTrue(cs.updateContactLastName("112", "Doe"));
	}

	@Test
	void testUpdateContactPhone() {
		ContactService cs = new ContactService();
		contact cs1 = new contact("111", "Justin", "McJustin", "1234567890", "123 Justin St");
		contact cs2 = new contact("112", "Justin2", "McJustin2", "1234567891", "123 Justin St2");
		cs.addContact(cs1);
		cs.addContact(cs2);
		assertFalse(cs.updateContactPhone("114", "9876543210"));
		assertTrue(cs.updateContactPhone("112", "9876543210"));
	}

	@Test
	void testUpdateContactAddress() {
		ContactService cs = new ContactService();
		contact cs1 = new contact("111", "Justin", "McJustin", "1234567890", "123 Justin St");
		contact cs2 = new contact("112", "Justin2", "McJustin2", "1234567891", "123 Justin St2");
		cs.addContact(cs1);
		cs.addContact(cs2);
		assertFalse(cs.updateContactAddress("114", "123 New St"));
		assertTrue(cs.updateContactAddress("112", "123 New St"));
	}
}
