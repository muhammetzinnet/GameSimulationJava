package Concreate;

import java.util.ArrayList;

import Abstract.IGameService;
import Entity.Game;

public class GameManager implements IGameService {
	
	ArrayList<Game> games= new ArrayList<Game>();

	@Override
	public void Add(Game game) {
		games.add(game);
		System.out.println("Yeni Oyun eklendi.");
	}

	@Override
	public void Delete(Game game) {
		games.remove(game);
		
		System.out.println("Oyun silindi");
		
	}

	@Override
	public void Update(Game game) {
		int gameUp= games.indexOf(game);
		System.out.println("Mevcut oyun güncelle");
		
	}

}
