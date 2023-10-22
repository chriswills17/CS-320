package contactService;

import java.util.ArrayList;

public class ContactService {
	
	private ArrayList<contact> listOfContacts;
	
	public ContactService() {
		listOfContacts = new ArrayList<>();
	}

	// Adding a contact
	public boolean addContact(contact c) {
		boolean contactExist = false;
		
		for(contact l : listOfContacts) {
			if(l.equals(c)) {
				contactExist = true;
			}
		}
		if(!contactExist) {
			listOfContacts.add(c);
			return true;
		}
		return false;
	}
	
	// Deleting a contact
	public boolean deleteContact(String cid) {
		for(contact l : listOfContacts) {
			if(l.getContactID().equals(cid)) {
				listOfContacts.remove(l);
				return true;
			}
		}
		return false;
	}
	
	// Updating first name based on contact ID
	public boolean updateContactFirstName(String contactId, String firstName) {
		for(contact l : listOfContacts) {
			if(l.getContactID().equals(contactId)) {
				if(!firstName.equals(null) && !(firstName.length() > 10)) {
					l.setFirstName(firstName);
					return true;
				}
				return false;
			}
		}
		return false;
	}

	// Updating last name based on contact ID
	public boolean updateContactLastName(String contactId, String lastName) {
		for(contact l : listOfContacts) {
			if(l.getContactID().equals(contactId)) {
				if(!lastName.equals(null) && !(lastName.length() > 10)) {
					l.setLastName(lastName);
					return true;
				}
				return false;
			}
		}
		return false;
	}

	// Updating phone number based on contact ID
	public boolean updateContactPhone(String contactId, String number) {
		for(contact l : listOfContacts) {
			if(l.getContactID().equals(contactId)) {
				if(!number.equals(null) && !(number.length() != 10)) {
					l.setPhoneNumber(number);
					return true;
				}
				return false;
			}
		}
		return false;
	}

	// Updating address based on contact ID
	public boolean updateContactAddress(String contactId, String address) {
		for(contact l : listOfContacts) {
			if(l.getContactID().equals(contactId)) {
				if(!address.equals(null) && !(address.length() > 30)) {
					l.setAddress(address);
					return true;
				}
				return false;
			}
		}
		return false;
	}
}
