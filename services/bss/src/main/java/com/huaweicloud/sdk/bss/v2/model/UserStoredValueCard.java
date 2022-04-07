package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UserStoredValueCard */
public class UserStoredValueCard {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_id")

    private String cardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_name")

    private String cardName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_value")

    private String faceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance")

    private String balance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public UserStoredValueCard withCardId(String cardId) {
        this.cardId = cardId;
        return this;
    }

    /** 储值卡ID。
     * 
     * @return cardId */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public UserStoredValueCard withCardName(String cardName) {
        this.cardName = cardName;
        return this;
    }

    /** 储值卡名称。
     * 
     * @return cardName */
    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public UserStoredValueCard withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 状态： 1：可使用 2：已用完
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UserStoredValueCard withFaceValue(String faceValue) {
        this.faceValue = faceValue;
        return this;
    }

    /** 储值卡面值。
     * 
     * @return faceValue */
    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    public UserStoredValueCard withBalance(String balance) {
        this.balance = balance;
        return this;
    }

    /** 储值卡余额。
     * 
     * @return balance */
    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public UserStoredValueCard withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /** 生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * 
     * @return effectiveTime */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public UserStoredValueCard withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /** 失效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * 
     * @return expireTime */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserStoredValueCard userStoredValueCard = (UserStoredValueCard) o;
        return Objects.equals(this.cardId, userStoredValueCard.cardId)
            && Objects.equals(this.cardName, userStoredValueCard.cardName)
            && Objects.equals(this.status, userStoredValueCard.status)
            && Objects.equals(this.faceValue, userStoredValueCard.faceValue)
            && Objects.equals(this.balance, userStoredValueCard.balance)
            && Objects.equals(this.effectiveTime, userStoredValueCard.effectiveTime)
            && Objects.equals(this.expireTime, userStoredValueCard.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, cardName, status, faceValue, balance, effectiveTime, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserStoredValueCard {\n");
        sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
        sb.append("    cardName: ").append(toIndentedString(cardName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    faceValue: ").append(toIndentedString(faceValue)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
