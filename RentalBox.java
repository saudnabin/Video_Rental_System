/*------------------------------------------------------*/
// importing time library to get LocalDate
import java.time.*;
public class RentalBox{
	int capacity;
	Media[] array;
	// creating a constructor that takes an integer argument.
	public RentalBox(int capacity){
		this.capacity = capacity;
		array = new Media[capacity];
	}
	public RentalBox(){
		// creating an array with the size limit 100
		array = new Media[100];
	}
	public int boxCapacity(){
		// returning the legth of the array
		return array.length;
	}
	public Media get(int i){
		return array[i];
	}
	public boolean inStock(Media m){
		// running a loop from the firsrt to last index of array
		for ( int i =0; i<array.length; i++){
			if(m.equals(array[i]))
				return true;
		}
		return false; 
	}
	public boolean put(Media m){
		// running a loop from the firsrt to last index of array
		for ( int i =0; i<array.length; i++){
			// checking if the element in array is empty
			if(array[i] == null){
				// assigning m to the empty slot
				array[i] = m;
				return true;
			}
		}
		return false;
	}
/*------------------------------------------------------*/
	public Rental rent(Media m, Payment p, LocalDate d){
		// running a loop from the firsrt to last index of array
		for (int i=0; i<array.length; i++){
			// chekcing if the array is all filled
			if(array[i] != null)
				if(m.equals(array[i])){
					// creating an object nabin
					DailyRental nabin = new DailyRental(m , p , d, getDailyFee(m));
					// making the element in array with index i empty
					array[i]= null;
					return nabin;
				}
		}
		return null;
	}
/*------------------------------------------------------*/
	public void processPayment(Payment p, double amount){
		// printing the answer in 2 decimals
		String answer = String.format("%.2f", amount);
		System.out.println("$"+answer+" paid by "+ p);
	}
/*------------------------------------------------------*/
//public boolean dropoff(Rental r, LocalDate today) drops off the current rental. 
//If there are remaining slots in the rental unit and the rental has not already been returned, 
//then this method will place the media in the first available slot, dropoff the rental using its 
//own dropoff method, report the total cost of the transaction using the processPayment method,
//before returning true. Otherwise, the method will return false and take no further action.
/*------------------------------------------------------*/
	public boolean dropoff(Rental r, LocalDate today){
		for ( int i =0; i<array.length; i++){
			if(array[i] == null){
				// checking if r is rented
				if (r.isRented()){
					array[i] = r.getMedia();
					//LocalDate returndate = today;
					processPayment(r.getPayment(),r.dropoff(today));
					return true;
				}
			}
		}
		return false;

	}
/*------------------------------------------------------*/
//For DVDs, this should be $1.50, for Blurays it 
//should be $2.00, and for video games it should be $3.00. 
//Anything else should default to $0.00.
/*------------------------------------------------------*/
	public double getDailyFee(Media m){
		if (m instanceof Video){
			// typecasting m to Video and assigning it to a
			Video a = (Video)m;
			if(a.getFormat() == 1)
				return 2.00;
			else
				return 1.50;
		}
		// checking if m is instance of game
		else if (m instanceof Game){
			return 3.0;

		}
		else
			return 0.0;

	}
/*------------------------------------------------------*/
	@Override public String toString(){
		String answer = "";
		// running a loop from the firsrt to last index of array
		for (int i=0; i<array.length; i++){
			// checking if element of araay with index i is not empty
			if(array[i] !=null){
				answer += array[i]+"\n";
			}
		}
		return answer;
	}

/*------------------------------------------------------*/
}



































