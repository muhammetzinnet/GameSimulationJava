package Abstract;
import Entity.Game;
import Entity.GameChamping;
import Entity.GamePrice;

public interface IGamePriceService {
	void Price(Game game, GamePrice gamePrice);
	void SellGameChamping(Game game,  GameChamping champing);
}
