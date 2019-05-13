package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trip {
	private String name;
	private String description;
	private List<Photo> photoList = new ArrayList<>();
	public Trip(String name, String description) {
		this.name = name;
		this.description = description;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean addPhotos(Photo argPhoto) {	return photoList.add(argPhoto); }

	public List<Photo> getPhotos() { return photoList; }
}
