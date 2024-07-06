package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	public void setGivenName(String givenName) {
	       
    }
	
	public KatoIchiro_Chapter17() {
        givenName = "一郎";
    }
	
    @Override
    public void eachIntroduce() {
    	System.out.println("名前：" + familyName + " " + givenName);
        System.out.println("住所：" + address); 
        System.out.println("好きな食べ物はリンゴです");
        System.out.println("");
    }
}
