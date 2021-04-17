/*------------------------------------------------------*/
// creating a class Media
public class Media{
	// defining the variables name and year.
	String name;
	int year;
	// creating a constructor Media with two parameters.
	public Media(String name, int year){
		this.name = name; // assigning the argument being bed to name.
		this.year = year; // assigning the argument being bed to year.
	}
	// creating a getName method that returns the name.
	public String getName(){
		return name;
	}

	// creating a getYear method that returns the year.
	public int getYear(){
		return year;
	}
	// overriding the equals method
	@Override public boolean equals(Object other){
		// checking if other is instance of Media class
		if (other instanceof Media){
			Media nabin = (Media)other;
			// checking if the content of nabin is same as Media content
			if (name.equals(nabin.getName()))
				if(year == nabin.getYear())
					return true;
		}
		return false;
	}
	@Override public int hashCode(){
		return getName().hashCode();
	}
	// overriding the return statement to name and the year.
	@Override public String toString(){
		return name +" (" + year + ")";
	}

}
/*------------------------------------------------------*/