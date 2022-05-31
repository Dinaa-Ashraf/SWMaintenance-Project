package Messages;

public class DailyNewsEmailMessage extends DailyNews {

	public String prepareMessage(String[] placeHolder) {
		// code to replace place holders of this type
		return "Some Uploded DailyNew " + placeHolder[0] + ",at time: " + placeHolder[1];
	}
}