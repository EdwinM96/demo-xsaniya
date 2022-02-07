/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsaniya.model.account;

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
"kind",
"currency",
"status"
})
@Generated("jsonschema2pojo")
public class Account {

@JsonProperty("id")
private String id;
@JsonProperty("type")
private Type type;
@JsonProperty("user")
private User user;
@JsonProperty("kind")
private String kind;
@JsonProperty("currency")
private Currency currency;
@JsonProperty("status")
private Status status;
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
public Type getType() {
return type;
}

@JsonProperty("type")
public void setType(Type type) {
this.type = type;
}

@JsonProperty("user")
public User getUser() {
return user;
}

@JsonProperty("user")
public void setUser(User user) {
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

@JsonProperty("currency")
public Currency getCurrency() {
return currency;
}

@JsonProperty("currency")
public void setCurrency(Currency currency) {
this.currency = currency;
}

@JsonProperty("status")
public Status getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(Status status) {
this.status = status;
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