package Messages;

public class DailyNewsMobileMessage extends DailyNews {

	public String prepareMessage(String[] placeHolders) {
		// code to replace place holders of this type

		return "Some Uploded DailyNew " + placeHolders[0] + ",at time: " + placeHolders[1];
	}
}