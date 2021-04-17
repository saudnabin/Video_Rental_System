/*------------------------------------------------------*/
public class Payment{
// defining variables cardNo, name, expMonth, expYear
private String cardNo;
private String name;
private int expMonth;
private int expYear;
// creating a constructor with given parameters
public Payment(String cardNo, String name, int expMonth, int expYear){
	this.cardNo = cardNo;
	this.name = name;
	this.expMonth = expMonth;
	this.expYear = expYear;
}

public String getCardNo(){//returns the stored credit card number.
	return cardNo;
	}
public String getName(){ //returns the stored cardholder name.
	return name;
	}
public int getExpMonth(){ //returns the stored expiration month.
	return expMonth;
	}
public int getExpYear() { // returns the stored expiration year
	return expYear;
	}	
// returns "#CARDNUMBER (NAME), exp MONTH/YEAR
@Override public String toString() {
	return "#"+cardNo+" ("+ name+"), exp "+expMonth+"/"+expYear;
	}
}
/*------------------------------------------------------*/
