package Concreate;

import java.util.ArrayList;

import Abstract.IGameChampingService;
import Entity.Game;
import Entity.GameChamping;
import Entity.GamePrice;

public class GameChampingManager implements IGameChampingService {
	
	ArrayList<GameChamping> games = new ArrayList<GameChamping>();

	@Override
	public void Add(GameChamping champing) {
		
		games.add(champing);
		System.out.println("Yeni Kampanya eklendi.");
	}

	@Override
	public void Delete(GameChamping champing) {
		
		games.remove(champing);
		System.out.println("Kampanya kaldýrýldý.");
	}

	@Override
	public void Update(GameChamping champing) {
		
		int name = games.indexOf(champing);
		games.set(name, champing);
		
		System.out.println("Mevcut Kampanya güncellendi.");
		
	}

	@Override
	public void Sale(Game game, GamePrice gamePrice ) {
		
		if (game.getGameName()=="Horizon") {
			double price = gamePrice.getGameSalePrice()*15/100;
            double newPirice=gamePrice.getGameSalePrice() - price;
            System.out.println(game.getGameName() + " Oyuna %15 indirim uygulandý. " + newPirice + " yeni fiyatý budur.");
		}else {
			System.out.println("Ýndirim uygulanmadý.");
		}
		
	}

}
