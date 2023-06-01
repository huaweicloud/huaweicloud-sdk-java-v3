package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubscriptionExtension
 */
public class SubscriptionExtension {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_secret")

    private String signSecret;

    public SubscriptionExtension withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 该字段为welink订阅下的租户ID字段，由租户从welink方获取。当protocol值为welink时，该字段为必填字段。
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public SubscriptionExtension withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * 该字段为welink订阅下的租户获取的client secret字段，由租户从welink方获取。当protocol值为welink时，该字段为必填字段。
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public SubscriptionExtension withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 该字段为关键字字段。当protocol协议为feishu时，这里的keyword字段和sign_secret字段二者必选其一。当用户在飞书或钉钉机器人端添加关键字校验的安全策略时，这里的关键字必须是飞书或钉钉端所填写的关键字之一。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public SubscriptionExtension withSignSecret(String signSecret) {
        this.signSecret = signSecret;
        return this;
    }

    /**
     * 这是加签密钥字段。当protocol协议为feishu或dingding时，这个字段和keyword字段二者必选且只能选其一，密钥配置必须与客户在飞书或钉钉客户端的密钥配置完全一致。例如，如果在飞书端配置了密钥并且没有配置关键字，则在此处填入从飞书获取的密钥字段，如果在飞书端没有配置密钥并且配置了关键字，则不填写该字段。
     * @return signSecret
     */
    public String getSignSecret() {
        return signSecret;
    }

    public void setSignSecret(String signSecret) {
        this.signSecret = signSecret;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionExtension subscriptionExtension = (SubscriptionExtension) o;
        return Objects.equals(this.clientId, subscriptionExtension.clientId)
            && Objects.equals(this.clientSecret, subscriptionExtension.clientSecret)
            && Objects.equals(this.keyword, subscriptionExtension.keyword)
            && Objects.equals(this.signSecret, subscriptionExtension.signSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientSecret, keyword, signSecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionExtension {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    signSecret: ").append(toIndentedString(signSecret)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
