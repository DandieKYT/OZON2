package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Activities {

    public int id;

    public String type;
    public String description;

    public Object title;

    public long time;

    public Users user;
}
