package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	 
	public void setGivenName(String givenName) {
       
    }
	
	public KatoTaro_Chapter17() {
        givenName = "太郎";
    }

    @Override
    public void eachIntroduce() {
    	System.out.println("名前：" + familyName + " " + givenName);
        System.out.println("住所：" + address); 
        System.out.println("私はJavaが得意です");
        System.out.println("");
    }
}
