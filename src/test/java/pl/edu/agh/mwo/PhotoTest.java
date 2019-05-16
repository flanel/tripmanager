package pl.edu.agh.mwo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.StringBufferInputStream;
import java.io.StringWriter;

public class PhotoTest {
    @Test
    public void testGetComment() {

        Photo photo = new Photo ("");
        photo.setComment("New comment added");
        assertEquals("New comment added", photo.getComment());
    }

    @Test
    public void testSetComment() {
        Photo photo = new Photo ("Przykladowy komentarz");

        photo.setComment("Comment for testing setter");
        assertEquals("Comment for testing setter", photo.getComment());
    }


    @Test
    public void testStringConstructor() {
        Photo photo = new Photo ("Przykladowy komentarz");
        assertEquals("Przykladowy komentarz", photo.getComment());
    }
}
