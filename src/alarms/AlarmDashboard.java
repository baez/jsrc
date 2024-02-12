public class AlarmDashboard {
	
    public static void main(String[] args) {
			
		// String message = "Temperature too high";
        // Alarm alarm = new Alarm(message);
    
	    // System.out.println(" === test alarm report when alarm not active ===");		
		//AlarmDashboard.showAlarmMessage(alarm);		
		
		// ========= Testing Snoozable Alarm =============
		System.out.println(" === test snoozable alarm ===");
		
		SnoozableAlarm snoozableAlarm = new SnoozableAlarm("snoozing now");
		snoozableAlarm.turnOn();
		snoozableAlarm.snooze();
		AlarmDashboard.showAlarmMessage(snoozableAlarm);
		System.out.println(snoozableAlarm.getHelperInstruction());
		
		snoozableAlarm.turnOff();
		AlarmDashboard.showAlarmMessage(snoozableAlarm);
		
		System.out.println("=== snoozableAlarm.toString(): " + snoozableAlarm.toString());
		
		PrioritizedAlarm prioritizedAlarm = new PrioritizedAlarm("My Priority Alarm", 12);
		prioritizedAlarm.turnOn();
		AlarmDashboard.showAlarmMessage(prioritizedAlarm);
		System.out.println(prioritizedAlarm.getHelperInstruction());
		
		prioritizedAlarm.turnOff();
		AlarmDashboard.showAlarmMessage(prioritizedAlarm);
		
		Alarm alarm = prioritizedAlarm;
		// ...later in the code if we need to convert back to the subclass
		if (alarm instanceof PrioritizedAlarm) {
			PrioritizedAlarm pAlarm = (PrioritizedAlarm) alarm;
			System.out.println("converted back to priority alarm - the priority is: " + pAlarm.getPriority());
		}
    }
	
	// alarm is being used through upcasting
	public static void showAlarmMessage(Alarm alarm) {
		String report = alarm.getReport();
		System.out.println(report);
	}
}