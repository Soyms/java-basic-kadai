package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	
	public void setGivenName(String givenName) {
	       
    }
	
	public KatoHanako_Chapter17() {
        givenName = "花子";
    }
	

    @Override
    public void eachIntroduce() {
    	System.out.println("名前：" + familyName + " " + givenName);
        System.out.println("住所：" + address); 
        System.out.println("趣味は読書です");
        System.out.println("");
    }
}
