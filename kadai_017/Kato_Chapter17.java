package kadai_017;

public abstract class Kato_Chapter17 {
	//名字
	public String familyName = "加藤";
	//名を表す
	public String setGivenName;
	//住所を表す
	public String address = "東京都";
	
	//共通の紹介メソッド
    public void commonIntroduce() {
    	System.out.println("名前：" + familyName + " " + setGivenName);
        System.out.println("住所：" + address);  
        }

    //
    public abstract void eachIntroduce();
    
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}
