
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
    "name",
    "internalName",
    "from",
    "to"
})
@Generated("jsonschema2pojo")
public class Type__2 {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("internalName")
    private String internalName;
    @JsonProperty("from")
    private From__1 from;
    @JsonProperty("to")
    private To__1 to;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("internalName")
    public String getInternalName() {
        return internalName;
    }

    @JsonProperty("internalName")
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    @JsonProperty("from")
    public From__1 getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From__1 from) {
        this.from = from;
    }

    @JsonProperty("to")
    public To__1 getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(To__1 to) {
        this.to = to;
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
