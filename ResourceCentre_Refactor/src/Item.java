
public class Item {
	private String assetTag;
	private String description;
	private String dueDate;
	private boolean isAvailable;

	public Item(String assetTag, String description) {
		this.assetTag = assetTag;
		this.description = description;
		this.dueDate = "";
		this.isAvailable = true;
	}
	public String toString() {
		
		// Write your codes here
		String itemInfo = String.format("%-10s %-30s %-10s %-10s",
				assetTag,
				description,
				showAvailability(isAvailable),
				dueDate); 
		
		return itemInfo;
	}
	private Object showAvailability(boolean isAvailable2) {
		// TODO Auto-generated method stubs
		return null;
	}
	public String getAssetTag() {
		return assetTag;
	}

	public String getDescription() {
		return description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}

