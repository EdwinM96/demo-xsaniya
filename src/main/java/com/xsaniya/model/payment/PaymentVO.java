
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
    "display",
    "date",
    "amount",
    "from",
    "to",
    "type",
    "currency",
    "fromKind",
    "fromUser",
    "toKind",
    "toUser",
    "description",
    "kind"
})
@Generated("jsonschema2pojo")
public class PaymentVO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("display")
    private String display;
    @JsonProperty("date")
    private String date;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("from")
    private From from;
    @JsonProperty("to")
    private To to;
    @JsonProperty("type")
    private Type__2 type;
    @JsonProperty("currency")
    private Currency currency;
    @JsonProperty("fromKind")
    private String fromKind;
    @JsonProperty("fromUser")
    private FromUser fromUser;
    @JsonProperty("toKind")
    private String toKind;
    @JsonProperty("toUser")
    private ToUser toUser;
    @JsonProperty("description")
    private String description;
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

    @JsonProperty("display")
    public String getDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(String display) {
        this.display = display;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("from")
    public From getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

    @JsonProperty("to")
    public To getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(To to) {
        this.to = to;
    }

    @JsonProperty("type")
    public Type__2 getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type__2 type) {
        this.type = type;
    }

    @JsonProperty("currency")
    public Currency getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @JsonProperty("fromKind")
    public String getFromKind() {
        return fromKind;
    }

    @JsonProperty("fromKind")
    public void setFromKind(String fromKind) {
        this.fromKind = fromKind;
    }

    @JsonProperty("fromUser")
    public FromUser getFromUser() {
        return fromUser;
    }

    @JsonProperty("fromUser")
    public void setFromUser(FromUser fromUser) {
        this.fromUser = fromUser;
    }

    @JsonProperty("toKind")
    public String getToKind() {
        return toKind;
    }

    @JsonProperty("toKind")
    public void setToKind(String toKind) {
        this.toKind = toKind;
    }

    @JsonProperty("toUser")
    public ToUser getToUser() {
        return toUser;
    }

    @JsonProperty("toUser")
    public void setToUser(ToUser toUser) {
        this.toUser = toUser;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
