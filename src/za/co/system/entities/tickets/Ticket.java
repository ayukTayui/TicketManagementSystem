package za.co.system.entities.tickets;

public class Ticket {

	private int ticketNumber;
	private String flightDate;
	private String ticketType;
	private double ticketPrices;
	private String departureTime;
	private String arrivalTime;
	private String placeOfDeparture;
	private String placeOfArrival;
	private int clientId;
	
	
	
	
	
	public Ticket() {
		
	}

	
	

	public Ticket(int ticketNumber, 
			String flightDate, 
			String ticketType, double ticketPrices, String departureTime,
			String arrivalTime,String placeOfDeparture, String placeOfArrival, int clientId) {
		
		this.ticketNumber = ticketNumber;
		this.flightDate = flightDate;
		this.ticketType = ticketType;
		this.ticketPrices = ticketPrices;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.placeOfDeparture = placeOfDeparture;
		this.placeOfArrival = placeOfArrival;
		this.clientId = clientId;
	}




	public String getPlaceOfDeparture() {
		return placeOfDeparture;
	}


	public void setPlaceOfDeparture(String placeOfDeparture) {
		this.placeOfDeparture = placeOfDeparture;
	}



	public String getPlaceOfArrival() {
		return placeOfArrival;
	}



	public void setPlaceOfArrival(String placeOfArrival) {
		this.placeOfArrival = placeOfArrival;
	}


	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public double getTicketPrices() {
		return ticketPrices;
	}
	public void setTicketPrices(double ticketPrices) {
		this.ticketPrices = ticketPrices;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ticketNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (ticketNumber != other.ticketNumber)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", flightDate=" + flightDate + ", ticketType=" + ticketType
				+ ", ticketPrices=" + ticketPrices + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", placeOfDeparture=" + placeOfDeparture + ", placeOfArrival=" + placeOfArrival + ", clientId="
				+ clientId + "]";
	}



	
}
