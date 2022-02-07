
package com.xsaniya.model.payment;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "user",
    "kind"
})
@Generated("jsonschema2pojo")
public class To {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private Type__1 type;
    @JsonProperty("user")
    private User__1 user;
    @JsonProperty("kind")
    private String kind;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public Type__1 getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type__1 type) {
        this.type = type;
    }

    @JsonProperty("user")
    public User__1 getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User__1 user) {
        this.user = user;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
