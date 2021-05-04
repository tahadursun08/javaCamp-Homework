import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws Exception {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("25933212651"),
				"TAHA ABDURRAHÝM",
				"DURSUN",
				1997
				);
		System.out.println("doðrulama : " +(result ? "baþarýlý" : "baþarýsýz"));
	}

}
