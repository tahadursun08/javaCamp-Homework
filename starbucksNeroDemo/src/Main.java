import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws Exception {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("25933212651"),
				"TAHA ABDURRAH�M",
				"DURSUN",
				1997
				);
		System.out.println("do�rulama : " +(result ? "ba�ar�l�" : "ba�ar�s�z"));
	}

}
