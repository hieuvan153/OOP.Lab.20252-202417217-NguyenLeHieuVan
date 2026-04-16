package hust.soict.globalict.media;

public class DigitalVideoDisc extends Disc {
	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title) {
		super(++nbDigitalVideoDiscs, title, null, null, 0, 0.0);
	}
	public DigitalVideoDisc(String title, String category, double cost) {
		super(++nbDigitalVideoDiscs, title, category, null, 0, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, double cost) {
		super(++nbDigitalVideoDiscs, title, category, director, 0, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		super(++nbDigitalVideoDiscs, title, category, director, length, cost);
	}

	@Override
	public String toString() {
		return getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
	}

	public boolean isMatch(String searchTitle) {
		if (getTitle() == null || searchTitle == null) {
			return false;
		}
		return getTitle().equalsIgnoreCase(searchTitle);
	}
}
