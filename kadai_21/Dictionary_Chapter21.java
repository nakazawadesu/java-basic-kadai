package kadai_21;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	 public void search() {
		 HashMap<String,String> dictionary = new HashMap<String,String>();
		 
		 dictionary.put("apple","りんご");
		 dictionary.put("peach","桃");
		 dictionary.put("banana","バナナ");
		 dictionary.put("lemon","レモン");
		 dictionary.put("pear","梨");
		 dictionary.put("kiwi","キウィ");
		 dictionary.put("strawberry","いちご");
		 dictionary.put("grape","ぶどう");
		 dictionary.put("muscat","マスカット");
		 dictionary.put("cherry","さくらんぼ");
		 
		 String[] searchWord = {"apple", "banana", "grape", "orange"};
		 
		 for(String word : searchWord)
				if(dictionary.containsKey(word)) {
					System.out.println(word + "の意味は" + dictionary.get(word));
				} else {
					System.out.println(word + "は辞書に存在しません");
				}
	}
	 

}
