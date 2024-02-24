import java.time.LocalDateTime;
import java.awt.*;

class SnoozableAlarm extends Alarm implements Helper {
    private LocalDateTime snoozeUntil;
	private boolean isSnoozing;

	SnoozableAlarm(String message) {
		super(message);
	}
	
	public Color getColor() {
		return Color.RED;
	}

	public void snooze() {
		if (this.active)
		{
			this.snoozeUntil = LocalDateTime.now().plusMinutes(5);
			this.isSnoozing = true;
		}
	}
			
	public void stopSnoozing() {
		this.isSnoozing = false;
	}
	
	public String getReport() {
		if (this.isSnoozing) {
			this.message = this.message.toUpperCase();
		}
		
		return super.getReport();
	}
	
	public String getHelperInstruction() {
		return "Snoozable alarm snoozes for 5 minutes when you snooze the alarm. The snoozing can be started and stopped.";
	}
}