package kadai_017;

public abstract class Kato_Chapter17 {
	//名前フィールド
	public String familyName;
	//名を表す
	public String givenName;
	//住所を表す
	public String address;
	
	//共通の紹介メソッド
    public void commonIntroduce() {
    	System.out.println("名前：" + familyName + " " + givenName);
        System.out.println("住所：" + address);  
        }

    //
    public abstract void eachIntroduce();
    
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}
