package gameShopHomework;

public class CampaignManager implements CampaignService {

	@Override
	public void register(Campaign campaign) {
		System.out.println("Kampanya oluþturuldu");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi");
	}

}
