package entities;

import lombok.Data;
import org.json.JSONObject;

@Data
public class Person {
    private String name;
    private int age;

    public JSONObject getJSON() {
        return new JSONObject("{"+"\"name\":'"+name+"';\"age\":"+age+"}");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getJSONString() {
        return getJSON().toString(2);
    }
}
