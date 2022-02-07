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
"balance",
"creditLimit",
"reservedAmount",
"availableBalance"
})
@Generated("jsonschema2pojo")
public class Status {

@JsonProperty("balance")
private String balance;
@JsonProperty("creditLimit")
private String creditLimit;
@JsonProperty("reservedAmount")
private String reservedAmount;
@JsonProperty("availableBalance")
private String availableBalance;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("balance")
public String getBalance() {
return balance;
}

@JsonProperty("balance")
public void setBalance(String balance) {
this.balance = balance;
}

@JsonProperty("creditLimit")
public String getCreditLimit() {
return creditLimit;
}

@JsonProperty("creditLimit")
public void setCreditLimit(String creditLimit) {
this.creditLimit = creditLimit;
}

@JsonProperty("reservedAmount")
public String getReservedAmount() {
return reservedAmount;
}

@JsonProperty("reservedAmount")
public void setReservedAmount(String reservedAmount) {
this.reservedAmount = reservedAmount;
}

@JsonProperty("availableBalance")
public String getAvailableBalance() {
return availableBalance;
}

@JsonProperty("availableBalance")
public void setAvailableBalance(String availableBalance) {
this.availableBalance = availableBalance;
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
