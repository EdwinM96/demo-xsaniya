
package com.xsaniya.model.user;

import java.util.HashMap;
import java.util.List;
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
    "username",
    "email",
    "passwords",
    "group",
    "mobilePhones",
    "landLinePhones",
    "skipActivationEmail"
})
@Generated("jsonschema2pojo")
public class UserDTO {

    @JsonProperty("name")
    private String name;
    @JsonProperty("username")
    private String username;
    @JsonProperty("email")
    private String email;
    @JsonProperty("passwords")
    private List<Password> passwords = null;
    @JsonProperty("group")
    private String group;
    @JsonProperty("mobilePhones")
    private List<MobilePhone> mobilePhones = null;
    @JsonProperty("landLinePhones")
    private List<LandLinePhone> landLinePhones = null;
    @JsonProperty("skipActivationEmail")
    private Boolean skipActivationEmail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("passwords")
    public List<Password> getPasswords() {
        return passwords;
    }

    @JsonProperty("passwords")
    public void setPasswords(List<Password> passwords) {
        this.passwords = passwords;
    }

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    @JsonProperty("mobilePhones")
    public List<MobilePhone> getMobilePhones() {
        return mobilePhones;
    }

    @JsonProperty("mobilePhones")
    public void setMobilePhones(List<MobilePhone> mobilePhones) {
        this.mobilePhones = mobilePhones;
    }

    @JsonProperty("landLinePhones")
    public List<LandLinePhone> getLandLinePhones() {
        return landLinePhones;
    }

    @JsonProperty("landLinePhones")
    public void setLandLinePhones(List<LandLinePhone> landLinePhones) {
        this.landLinePhones = landLinePhones;
    }

    @JsonProperty("skipActivationEmail")
    public Boolean getSkipActivationEmail() {
        return skipActivationEmail;
    }

    @JsonProperty("skipActivationEmail")
    public void setSkipActivationEmail(Boolean skipActivationEmail) {
        this.skipActivationEmail = skipActivationEmail;
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
