package gameShopHomework;

public class CampaignManager implements CampaignService {

	@Override
	public void register(Campaign campaign) {
		System.out.println("Kampanya olu�turuldu");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi");
	}

}
