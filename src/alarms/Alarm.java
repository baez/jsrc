
// ==== Alarm.java ====

// import java.time.LocalDateTime;

/*

We need to implement two features

1 - snooze, snooze should set the snooze time to +5 minutes from current time

2 - create a report from the alarm 

3 - if the alarm is snoozing then it should create the report in all caps

*/

public class Alarm {

    protected boolean active;

    protected String message;

	private boolean isSnoozing;


		public Alarm(String message) {

			this.message = message; 

		}

		public void turnOn() {

			this.active = true;

		}


		public void turnOff() {

			this.active = false;

		}

	public void snooze() {

	if (this.active)

	{

	// this.snoozeUntil = LocalDateTime.now().plusMinutes(5);

	this.isSnoozing = true;

	}

	}

	public void stopSnoozing() {

	this.isSnoozing = false;

	}

	public String getMessage() {

	return this.message;

	}

	public String getReport() {

	if (this.active) {

	if (this.isSnoozing)

	return this.message.toUpperCase();

	else

	return this.message;

			}

	return "Alarm inactive";

	}

		public static void main(String[] args) {

			String message = "Temperature too high";
			Alarm alarm = new Alarm(message);
			System.out.println(" === test alarm report when alarm not active ===");

		String report = alarm.getReport();

	if (!report.equals("Alarm inactive"))

	{

	System.out.println("*** Test Failed ****");

	System.out.println(report);

	}

	System.out.println(" === test alarm report when alarm is active ===");

	alarm.turnOn();

	report = alarm.getReport();

	if (!report.equals(message))

	{

	System.out.println("*** Test Failed ****");

	System.out.println(report);

	}


	System.out.println(" === test alarm report when in snooze mode, ensure report is in all caps ===");

	alarm.turnOn();

	alarm.snooze();

	report = alarm.getReport();

	if (!report.equals(message.toUpperCase()))

	{

	System.out.println("*** Test Failed ****");

	System.out.println(report);

	}

}   

}