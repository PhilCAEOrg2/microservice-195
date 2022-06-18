package i5.las2peer.services.res;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class S10 {

    public S10() {}
    
    private String s10;

    public void sets10(String setValue) {
        this.s10 = setValue;
    }

    public String gets10() {
        return this.s10;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("s10", this.s10); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.s10 = (String) jsonObject.get("s10"); 

    }

}

    
}
