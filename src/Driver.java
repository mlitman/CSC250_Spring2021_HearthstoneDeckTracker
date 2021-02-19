import java.net.URL;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Scanner;

public class Driver 
{

	public static void main(String[] args)
	{ 
		URLReader hearthstoneURLReader = new URLReader("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
		Object obj = JSONValue.parse(hearthstoneURLReader.theURLContents);
	    System.out.println(obj);
		
		JSONArray array = (JSONArray)obj;
	    for(int i = 0; i < array.size(); i++)
	    {
	    	JSONObject cardData = (JSONObject)array.get(i);
	    	System.out.println(array.get(i));
	    	if(cardData.containsKey("cost") && cardData.containsKey("name"))
	    	{
	    		System.out.println(cardData.get("type"));
	    		System.out.println(cardData.get("name"));
	    		System.out.println(cardData.get("cost"));
	    	}
	    	
	    }   
	}
}
