import java.util.Date;

import Concreate.GameChampingManager;
import Concreate.GameManager;
import Concreate.GamePriceManager;
import Concreate.PlayerManager;
import Entity.Game;
import Entity.GameChamping;
import Entity.GamePrice;
import Entity.Player;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("Horizon");
		game.setGameNameType("Savaþ oyunu");
		
		GameManager gameManager = new GameManager();
		gameManager.Add(game);
		
		Player player = new Player();
		player.setId(1);
		player.setFirstName("Eyup");
		player.setLastName("Çevik");
		player.setDateOfBirth(new Date(2011,8,20));
		player.setIdentificationNumber("123456789");
		
		PlayerManager playerManager = new PlayerManager();
		playerManager.Add(player);
		
		GamePrice price = new GamePrice();
		price.setGameSalePrice(100);
		
		GamePriceManager priceManager = new GamePriceManager();
		priceManager.Price(game, price);
		
		GameChamping champing = new GameChamping();
		champing.getGameCampaing();
		
		GameChampingManager champingManager = new GameChampingManager();
		champingManager.Sale(game, price);

	}

}
