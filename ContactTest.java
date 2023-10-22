package module3CodeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contactService.contact;

class ContactTest {

    @Test
    void testValidContact() {
        contact validContact = new contact("1234567890", "Justin", "McJustin", "1234567890", "123 Justin St");
        Assertions.assertEquals("1234567890", validContact.getContactID());
        Assertions.assertEquals("Justin", validContact.getFirstName());
        Assertions.assertEquals("McJustin", validContact.getLastName());
        Assertions.assertEquals("1234567890", validContact.getPhoneNumber());
        Assertions.assertEquals("123 Justin St", validContact.getAddress());
    }

    @Test
    void testNullStrings() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new contact(null, null, null, null, null);
        });
    }

    @Test
    void testInvalidPhoneNumberFormat() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new contact("123", "Justin", "McJustin", "123456789", "123 Justin St");
        });
    }

    @Test
    void testSetterMethods() {
        contact c = new contact("1234567890", "Justin", "McJustin", "1234567890", "123 Justin St");
        c.setFirstName("NewFirst");
        c.setLastName("NewLast");
        c.setPhoneNumber("9876543210");
        c.setAddress("New Address");

        Assertions.assertEquals("NewFirst", c.getFirstName());
        Assertions.assertEquals("NewLast", c.getLastName());
        Assertions.assertEquals("9876543210", c.getPhoneNumber());
        Assertions.assertEquals("New Address", c.getAddress());
    }

    @Test
    void testInvalidContactID() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new contact("12345678900", "Justin", "McJustin", "1234567890", "123 Justin St");
        });
    }

    @Test
    void testInvalidFirstName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new contact("1234567890", "Justin of Justin", "McJustin", "1234567890", "123 Justin St");
        });
    }

    @Test
    void testInvalidLastName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new contact("1234567890", "Justin", "McJustin of the Court of Justins", "1234567890", "123 Justin St");
        });
    }

    @Test
    void testInvalidAddress() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new contact("1234567890", "Justin", "McJustin", "1234567890", "123 Justin St Oakland California, Some zip code, United States of America");
        });
    }
}
