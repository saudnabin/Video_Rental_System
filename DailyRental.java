/*------------------------------------------------------*/
// importing time library to get LocalDate
import java.time.*;
public class DailyRental extends Rental{
	private double credit;
	// creating a constructors with given parameters
	public DailyRental(Media media, Payment payment, LocalDate today, double fee, double credit){
		// using super keywords to get acess to given variables from Rental class
		super(media, payment, today, fee);
		this.credit = credit;
	}
	// creating a constructors with given parameters
	public DailyRental(Media media, Payment payment, LocalDate today, double fee){
		// using super keywords to get acess to given variables from Rental class
		super(media, payment, today, fee);
		this.credit = 0.00;
	}
	// returning credit
	public double getCredit(){
		return credit;
	}
/*------------------------------------------------------*/
//  calculating the totalfee and returning it
	@Override public double getTotalFee(LocalDate today){
		double totalfee;
		int days = super.daysRented(today);
		if (days<1){
			days =1;
			}
		totalfee = (days * fee) - credit;
		if (totalfee < 0){
			totalfee =0;
		}
		return totalfee;
	}
}
/*------------------------------------------------------*/