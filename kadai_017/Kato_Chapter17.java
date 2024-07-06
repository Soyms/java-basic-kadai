package kadai_017;

public abstract class Kato_Chapter17 {
	
	public String familyName = "加藤";
	public String address = "東京都";
	public String givenName;
	
	
    public void commonIntroduce() {
    	System.out.println("名前：" + familyName + " " + givenName);
        System.out.println("住所：" + address);  
        }

    public abstract void eachIntroduce();
    
    
    public void execIntroduce() {
    	this.commonIntroduce();
		this.eachIntroduce();
    	System.out.println();
    }
    
}
