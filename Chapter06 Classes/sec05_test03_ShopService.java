package sec05.test03;

public class ShopService {
	
	static private ShopService sigletone = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return sigletone;
	}

}
