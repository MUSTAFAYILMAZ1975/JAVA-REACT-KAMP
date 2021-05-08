package src.gamePlatform;

import java.rmi.RemoteException;

import src.Entities.Gamer;
import src.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	public boolean CheckIfRealPerson(User gamer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean result = false;

		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(gamer.getNationalityId(),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getBirthOfDate());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;

	}

	
}//User s�n�f�n� geni�letmek gerekiyor alt s�n�f �zelliklerine ula�am�yor.