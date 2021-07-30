package lgs.lviv.ua;

public class Application {
	public static void main(String[] args) {
		String day = "Monadday";								//—юди вписуЇтс€ день
		switch (day) {
		case "Monday": {
			System.out.println("Watch film");
			break;
		}
		
		case "Tuesday": {
			System.out.println("Go out with friends");
			break;
		}
		
		case "Wednesday": {
			System.out.println("Do programming exercises");
			break;
		}
		
		case "Thursday": {
			System.out.println("Play football");
			break;
		}
		
		case "Friday": {
			System.out.println("Play another games");
			break;
		}
		
		case "Saturday": {
			System.out.println("Do programming lessons again");
			break;
		}
		
		case "Sunday": {
			System.out.println("Rest from hard week :)");
			break;
		}
		default:
			System.out.println("Non-existent day. Try again.");
		}
	}
}
