/*------------------------------------------------------*/
// importing time library to get LocalDate
import java.time.*;
public class Rental{
	// defining varibales media, payment, fee, today, returndate
	private Media media;
	private Payment payment;
	double fee; 
	private LocalDate today;
	private LocalDate returndate;
	// creating a constructor with given parameters
	public Rental(Media media, Payment payment, LocalDate today, double fee){
		this.media = media;
		this.payment = payment;
		this.today = today;
		this.fee = fee;
	}
public Media getMedia(){ //retrieves the media which has been rented.
	return media;
	}
public Payment getPayment(){// retrieves the payment method used to rent the media.
	return payment;
	}
public LocalDate getRentDate(){// retrieves the date on which the media was rented.
	return today;
	}
public double getFee() {//retrieves the rental fee.
	return fee;
	}
public double dropoff(LocalDate today){
	// checking if returndate is null
	if (returndate == null)
		// assiging today to returndate
		returndate = today;
	return getTotalFee(today);

	}
public boolean isRented(){
	// return true if returndate is empty
		return returndate == null; 
	}
public int daysRented(LocalDate today){
	int days;
	// checking if returndate is empty
	if (isRented()){
		//getting days using the code given in instructors
		days = Period.between(this.today,today).getDays();
	}
	else{
		days = Period.between(this.today, returndate).getDays();
	}
	return days;
}
// returning fee
public double getTotalFee(LocalDate today){
	return this.fee;
	}
// returning "MEDIA, rented on DATE using PAYMENT"
@Override public String toString(){
	return media+", rented on "+ today+ " using " +payment;
	}
}
/*------------------------------------------------------*/
