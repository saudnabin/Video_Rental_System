/*-----------------------------------------------------------------------*/
public class Video extends Media{
	public static final int DVD = 0;
	public static final int BLURAY = 1;
	// defining the variables runtime, rating and format.
	private int runtime;
	private String rating;
	private int format;
	private String ans;

	// creating a constructor Video with five given parameters.
	public Video (String name, int year, int runtime, String rating, int format){
		super(name, year);
		this.runtime = runtime; 
		this.rating = rating; 
		this.format = format; 
	}
	// creating a getRuntime method that returns the runtime.
	public int getRuntime(){
		return runtime;
	}
	// creating a getRating method that returns the rating.
	public String getRating(){
		return rating;
	}
	// creating a getFormat method that returns the format.
	public int getFormat(){
		return format;
	}
	@Override public String toString(){
		// checking id format is 0 to assign ans to DVD
		if (format == 0)
			ans = "DVD";
		else
			// assigning ans to BLURAY if format is not 0
			ans = "BLURAY";

		return name+ " ("+ year+") "+ ans+" ["+rating+", "+runtime +" min]";

	}
}
/*-----------------------------------------------------------------------*/