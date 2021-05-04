package Entity;

public class GameChamping implements Entity {
	
	private int Id;
	private double GameCampaing;
	
	public GameChamping() {
		
	}
	
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public double getGameCampaing() {
		return GameCampaing;
	}
	
	public void setGameCampaing(double gameCampaing) {
		GameCampaing = gameCampaing;
	}
}
