package pl.edu.agh.mwo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TripTest {

	@Test
	public void testConstructor() {
		Trip trip = new Trip("nazwa", "opis");
		assertEquals("nazwa", trip.getName());
		assertEquals("opis", trip.getDescription());
	}

	@Test
	public void testSetDescription() {
		Trip trip = new Trip("nazwa", "");
		assertEquals("", trip.getDescription());
		trip.setDescription("New description");
		assertEquals("New description", trip.getDescription());
	}


	@Test
	public void testGetDescription() {
		Trip trip = new Trip("nazwa", "");
		assertEquals("", trip.getDescription());
		trip.setDescription("New description");
		assertEquals("New description", trip.getDescription());
	}

	@Test
	public void testSetName() {
		Trip trip = new Trip("", "Empty name");
		assertEquals("", trip.getName());
		trip.setName("New test name");
		assertEquals("New test name", trip.getName());
	}

	@Test
	public void testGetName() {
		Trip trip = new Trip("", "Empty name");
		assertEquals("", trip.getName());
		trip.setName("New test name");
		assertEquals("New test name", trip.getName());
	}

	@Test
	public void testAddingPhoto() {
		Trip trip = new Trip("nazwa", "opis");
		Photo firstPhoto = new Photo("Comment to first photo");

		assertEquals(true, trip.addPhotos(firstPhoto));
	}

	@Test
	public void testGettingPhoto() {
		Trip trip = new Trip("nazwa", "opis");
		Photo firstPhoto = new Photo("Comment to first photo");
		List<Photo> photoTestList = new ArrayList<>();

		assertEquals(photoTestList, trip.getPhotos());
		photoTestList.add(firstPhoto);
		trip.addPhotos(firstPhoto);
		assertEquals(photoTestList, trip.getPhotos());

	}

	@Test
	public void testGettingPhotos() {
		Trip trip = new Trip("nazwa", "opis");
		Photo firstPhoto = new Photo("Comment to first photo");
		Photo secondPhoto= new Photo("Comment to second photo");
		List<Photo> photoTestList = new ArrayList<>();
		photoTestList.add(firstPhoto);
		photoTestList.add(secondPhoto);

		trip.addPhotos(firstPhoto);
		trip.addPhotos(secondPhoto);
		assertEquals(photoTestList, trip.getPhotos());
	}



}
