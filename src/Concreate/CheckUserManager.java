package Concreate;

import Abstract.ICheckUser;
import Entity.Player;

public class CheckUserManager implements ICheckUser {

	@Override
	public boolean CheckUser(Player player) {
		if(player.getIdentificationNumber()!="Tc.KimlikDog") {
			return false;
		}else {
			return true;
		}
		
	}

}
