package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	public KatoIchiro_Chapter17() {
		familyName = "加藤";
		givenName = "一郎";
		address = "東京都";
	}

	@Override
	public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです。");
    }
}