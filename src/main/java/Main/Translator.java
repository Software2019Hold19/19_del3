package Main;

import java.util.HashMap;

public class Translator {
    String language;

    HashMap<String, String> text = new HashMap<String, String>();

    public Translator(String _language) {
        this.language = _language;
        getLanguage(this.language);


        System.out.println(text);

    }

    private void getLanguage(String language){
        this.text.put("Field1", "Lorem Ipsum...");
        this.text.put("Key", "Value");
        this.text.put("Key2", "Value2");
    }


}


// Add keys and (Country, City)

