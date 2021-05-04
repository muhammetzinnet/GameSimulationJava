package Abstract;

import Entity.Game;
import Entity.GameChamping;
import Entity.GamePrice;

public interface IGameChampingService {
	
	public void Sale(Game game, GamePrice gamePrice);
	void Add(GameChamping champing);
	void Delete(GameChamping champing);
	void Update(GameChamping champing);
}
