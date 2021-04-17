/*------------------------------------------------------*/
public class Game extends Media{
	// defining varibales platform, rating, disc, online
	private String platform;
	private String rating;
	private int discs;
	private boolean online;
    // creating a Game constructor with given parameters
	public Game(String name, int year, String platform, String rating, int discs, boolean online){
		// using super keyword to get the name and year from Media
		super(name, year);
		this.platform = platform; 
		this.rating = rating; 
		this.discs= discs;
		this.online = online;
	}
	// creating a getPlatform method that returns the platform.
	public String getPlatform(){
		return platform;
	}
	// creating a getRating method that returns the rating.
	public String getRating(){
		return rating;
	}
	// creating a getDiscs method that returns the discs.
	public int getDiscs(){
		return discs;
	}
	// returns true if it is Online
	public boolean isOnline(){
		return online;
	}
	// returns "NAME (YEAR) PLATFORM [RATING, DISCS discs]"  if it is offline
	@Override public String toString(){
		if (online == false){
			return name+" ("+year+") "+ platform + " ["+rating+", "+discs +" discs]";
		}
		else{
			return name+" ("+year+") "+ platform + " ["+rating+", "+discs +" discs, online]";
		}
	}
}
/*------------------------------------------------------*/