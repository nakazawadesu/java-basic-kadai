package kadai_018;

public abstract class Kato_Chapter18 {
	
	// 姓を表す
	public final String familyName = "加藤";
	// 名を表す
	public String givenName;
	// 住所を表す
	public final String address = "東京都中野区〇×";
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	public abstract void eachIntroduce ();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
