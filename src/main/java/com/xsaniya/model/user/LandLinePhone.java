
package com.xsaniya.model.user;

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
    "name",
    "number",
    "hidden",
    "enabledForSms",
    "verified",
    "kind"
})
@Generated("jsonschema2pojo")
public class LandLinePhone {

    @JsonProperty("name")
    private String name;
    @JsonProperty("number")
    private String number;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("enabledForSms")
    private Boolean enabledForSms;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("kind")
    private String kind;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public LandLinePhone() {
    }

    public LandLinePhone(String name, String number, Boolean hidden, Boolean enabledForSms, Boolean verified, String kind) {
        this.name = name;
        this.number = number;
        this.hidden = hidden;
        this.enabledForSms = enabledForSms;
        this.verified = verified;
        this.kind = kind;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("enabledForSms")
    public Boolean getEnabledForSms() {
        return enabledForSms;
    }

    @JsonProperty("enabledForSms")
    public void setEnabledForSms(Boolean enabledForSms) {
        this.enabledForSms = enabledForSms;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
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
