import java.awt.*;

// final here means cannot inherit
class PrioritizedAlarm extends Alarm {
	// final here means cannot reassign
	private final int priority;
	
	PrioritizedAlarm(String message, int priority) {
		super(message);
		this.priority = priority;
	}
	
	public Color getColor() {
		return Color.YELLOW;
	}
	
	// final here means cannot override
	public int getPriority() {
		return priority;
	}
	
	public String getReport() {
		this.message = this.message + " P:" + this.priority;
		return super.getReport();
	}
	
	public String getHelperInstruction() {
		return "Prioritized alarm has a priority and a message and provides the priority in the report.";
	}
}
