package pl.edu.agh.mwo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripTest {

	@Test
	public void testConstructor() {
		Trip trip = new Trip("nazwa", "opis");
		assertEquals("nazwa", trip.getName());
		assertEquals("opis", trip.getDescription());
	}

	@Test
	public void testAddingPhoto() {
		Trip trip = new Trip("nazwa", "opis");
		Photo firstPhoto = new Photo("Comment to first photo");

		trip.addPhoto(firstPhoto);

		assertEquals(firstPhoto, trip.getPhoto());
	}



}
