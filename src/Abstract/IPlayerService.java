package Abstract;

import Entity.Player;

public interface IPlayerService {
	void Add(Player player);
	void Delete(Player player);
	void Update(Player player);
}
