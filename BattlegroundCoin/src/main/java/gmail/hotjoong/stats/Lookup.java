package gmail.hotjoong.stats;

import org.thatscloud.pubj.Pubg;
import org.thatscloud.pubj.rest.model.Player;

public class Lookup {

	public static void main(String[] args) {

		final String apiKey = "7fe4d442-a45c-417d-b8d2-ca3ae448a7c2";
		try( final Pubg pubg = new Pubg( apiKey ) )
		{
		    final Player player = pubg.getPlayer( playerName );
		}
	}

}



