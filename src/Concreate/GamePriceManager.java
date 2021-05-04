package Concreate;

import Abstract.IGamePriceService;
import Entity.Game;
import Entity.GameChamping;
import Entity.GamePrice;

public class GamePriceManager implements IGamePriceService {

	
	@Override
	public void Price(Game game, GamePrice gamePrice) {
		
		
		System.out.println(game.getGameName() + " oyununu " + gamePrice.getGameSalePrice() + " TL'ye sat�n ald�n�z.");
	}


	@Override
	public void SellGameChamping(Game game, GameChamping champing) {
		
		System.out.println(game.getGameName() + " oyunu " + champing.getGameCampaing() + " kampanyal� fiyat�d�r.");
		
	}
	
}
