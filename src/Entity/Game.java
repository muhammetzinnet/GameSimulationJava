package Entity;

public class Game implements Entity {
	private int Id;
	private String GameName;
	private String GameNameType;
	
	public Game(){
		
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getGameName() {
		return GameName;
	}
	
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	
	public String getGameNameType() {
		return GameNameType;
	}
	
	public void setGameNameType(String gameNameType) {
		GameNameType = gameNameType;
	}
	
}
