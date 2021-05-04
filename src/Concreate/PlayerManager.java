package Concreate;

import java.util.ArrayList;

import Abstract.IPlayerService;
import Entity.Player;

public class PlayerManager implements IPlayerService {
	
	ArrayList<Player> players = new ArrayList<Player>(); 

	@Override
	public void Add(Player player) {
		players.add(player);
		System.out.println("Yeni oyuncu eklendi.");
		
	}

	@Override
	public void Delete(Player player) {
		players.remove(player);
		System.out.println("Oyuncu sistemden silindi.");
		
	}

	@Override
	public void Update(Player player) {
		int playerUp=players.indexOf(player);
		System.out.println("Mevcut oyuncu güncellendi.");
		
	}

}
