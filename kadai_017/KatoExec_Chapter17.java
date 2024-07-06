package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// インスタンス化
		KatoTaro_Chapter17 KatoTaro = new KatoTaro_Chapter17();
		
		KatoIchiro_Chapter17 KatoIchiro = new KatoIchiro_Chapter17();
		
		KatoHanako_Chapter17 KatoHanako = new KatoHanako_Chapter17();

        // 出力
		KatoTaro.setGivenName("太郎");
		KatoTaro.eachIntroduce();
		
		KatoIchiro.commonIntroduce();
		KatoIchiro.setGivenName("一郎");
		KatoIchiro.eachIntroduce();
		
		KatoHanako.commonIntroduce();
		KatoHanako.setGivenName("花子");
		KatoHanako.eachIntroduce();

	}
}
