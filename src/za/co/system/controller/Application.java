package za.co.system.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import za.co.system.entities.login.LoginDetails;
import za.co.system.entities.people.Client;
import za.co.system.entities.people.Employee;
import za.co.system.entities.tickets.Ticket;

@SuppressWarnings("unused")
public class Application {
	
	private static Scanner input;
	
	
	
	public static void main(String[] args) {
	input = new Scanner(System.in);
	Ticket[] ticketz = null;
	List<Client> clients = new ArrayList<>();
	List<Employee> employees = new ArrayList<>();
	List<Ticket> tickets  = new ArrayList<>();
	List<LoginDetails> loginDetails = new ArrayList<>();
	Employee employee = new Employee();
	Ticket ticket = new Ticket();
	Client client = new Client();
	LoginDetails logIn = new LoginDetails();
	
	
	try {
		
	System.out.println("======== Hello World And Welcome To PVI Airlines ========");	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println();
	System.out.println("Type [start] In Order To Begin The Program");
	System.out.println("-------------------------------------------");
	String button = input.nextLine();
	
	for(int a=0; a<200; a++) {
	
	if(button.equalsIgnoreCase("start")) {
		
		System.out.println("  ======== Employee Options ========  ");	
		System.out.println("......................................");
		System.out.println("PRESS [1] To REGISTER A User ...");
		System.out.println("PRESS [2] To LOGIN To The System   ...");
		int bnt = input.nextInt();
		System.out.println("_______________________________________");
		
		if(bnt == 1) {
			System.out.println("==== USER REGISTRATION FORM ====");
			System.out.println("................................");
			System.out.print("=>..EMPLOYEEID :");
			int empId = input.nextInt();
			input.nextLine();
			System.out.print("=>..NAME :");
			String name = input.next();
			input.nextLine();
			System.out.print("=>..SURNAME :");
			String sname = input.next();
			input.nextLine();
			System.out.print("=>..DATE OF BIRTH :");
			String dob = input.next();
			input.nextLine();
			System.out.print("=>..EMAILADDRESS :");
			String email = input.next();
			input.nextLine();
			System.out.print("=>..USERNAME :");
			String uname = input.next();
			input.nextLine();
			System.out.print("=>..PASSWORD :");
			String pass = input.next();
			
			Employee emp = new Employee(empId, name, sname, dob, email, uname, pass);
			employee = emp;
			employees.add(employee);
			logIn= new LoginDetails(uname, pass);
			System.out.println(employee);
		}
		else if(bnt == 2) {
			System.out.println("===== ... LOGIN ... =====");
			System.out.println();
			System.out.print("=>..USERNAME :");
			String username = input.next();
			input.nextLine();
			System.out.print("=>..PASSWORD :");
			String password = input.next();
			
			if(username.equals(logIn.getUsername()) && password.equals(logIn.getPassword())) {
				System.out.println("===== ... Clientele Services ... =====");
				System.out.println();
				System.out.println("PRESS [1] To BOOK A FLIGHT ...");
				System.out.println("PRESS [2] To CHECK IN THE FLIGHT ...");
				int bntLog = input.nextInt();
				
				if(bntLog == 1) {
					System.out.println("==== FLIGHT BOOKING  FORM ====");
					System.out.println(".....................");
					System.out.print("=>.. CLIENTID :");
					int clientId = input.nextInt();
					input.nextLine();
					System.out.print("=>..NAME :");
					String name = input.next();
					System.out.print("=>..MIDDLENAME :");
					String midName = input.next();
					input.nextLine();
					System.out.print("=>..SURNAME :");
					String surname = input.next();
					input.nextLine();
					System.out.print("=>..DATE OF BIRTH :");
					String dob = input.next();
					input.nextLine();
					System.out.print("=>..HOMEADDRESS :");
					 String home = input.next();
					System.out.print("=>..EMAILADDRESS :");
					String email = input.nextLine();
					input.nextLine();
					System.out.print("=>..NATIONALITY :");
					String nat = input.next();
					
					System.out.println("**** How Many Tickets Do You Want To Regsiter ...??****");
					int numTickets = input.nextInt();
					ticketz = new Ticket[numTickets];
					
					for (int i = 0; i < ticketz.length; i++) {
						
					
					System.out.println("=== TICKET REGISTRATION FORM ===");
					System.out.println();
					System.out.print("=>.. TICKET NUMBER :");
					int ticketId = input.nextInt();
					input.nextLine();
					System.out.print("=>..FLIGHT NAME :");
					String fname = input.next();
					input.nextLine();
					System.out.print("=>..FLIGHT DATE :");
					String fDate = input.next();
					input.nextLine();
					System.out.print("=>..TICKET TYPE :");
					String type = input.next();
					input.nextLine();
					System.out.print("=>..TICKET PRICE :");
					double price = input.nextDouble();
					input.nextLine();
					System.out.print("=>..PLACE OF DEPARTURE :");
					String depart = input.next();
					input.nextLine();
					System.out.print("=>..PLACE OF ARRIVAL :");
					String arrive = input.next();
					input.nextLine();
					System.out.print("=>.. TIME OF DEPARTURE:");
					String timeD = input.next();
					input.nextLine();
					System.out.print("=>.. TIME OF ARRIVAL:");
					String timeA = input.next();
					
					ticket = new Ticket(ticketId, fDate, type,price,timeD,timeA, depart,arrive,clientId);
					ticketz[i] = ticket;
					client = new Client(clientId,name,midName,surname,dob,email,home,nat,ticketz);
					clients.add(client);
					tickets.add(ticket);
					System.out.println(client);
					
					if(i == ticketz.length) {
						
						continue;
					}else {
						break;
					}
					
					
					}
					
					
				}
				 
			}else {
				break;
			}
		}
		
	}else {
		System.out.println("... Bye Bye ...");
	}
	
	
	}///
		
	} catch ( Exception e) {
		System.out.println("Caught An Exception");
	}
	
	}

}
 