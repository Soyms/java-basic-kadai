package kadai_017;

public abstract class Kato_Chapter17 {
	
	public String familyName = "加藤";
	public String address = "東京都";
	protected String givenName;
	
	public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
	
	
	
    public void commonIntroduce() {
    	System.out.println("名前：" + familyName + " " + givenName);
        System.out.println("住所：" + address);  
        }

    public abstract void eachIntroduce();
    
    public void execIntroduce() {
    	System.out.println();
    }
    
}
