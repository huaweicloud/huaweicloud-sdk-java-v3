package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListSubscriptionUserResponseDingdingEndpointInfo
 */
public class ListSubscriptionUserResponseDingdingEndpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_secret")

    private String signSecret;

    public ListSubscriptionUserResponseDingdingEndpointInfo withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 隐去敏感信息的终端地址。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ListSubscriptionUserResponseDingdingEndpointInfo withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * dingding协议订阅用户的关键字。dingding协议订阅用户必须指定keyword和sign_secret二者之一。当用户在钉钉机器人端添加关键字校验的安全策略时，这里的关键字必须是钉钉端所填写的关键字之一。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListSubscriptionUserResponseDingdingEndpointInfo withSignSecret(String signSecret) {
        this.signSecret = signSecret;
        return this;
    }

    /**
     * dingding协议订阅用户的加签密钥字段。dingding协议订阅用户必须指定keyword和sign_secret二者之一。当用户在钉钉机器人端添加关键字校验的安全策略时，这里的关键字必须是钉钉端所填写的关键字之一。
     * @return signSecret
     */
    public String getSignSecret() {
        return signSecret;
    }

    public void setSignSecret(String signSecret) {
        this.signSecret = signSecret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionUserResponseDingdingEndpointInfo that = (ListSubscriptionUserResponseDingdingEndpointInfo) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.keyword, that.keyword)
            && Objects.equals(this.signSecret, that.signSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, keyword, signSecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionUserResponseDingdingEndpointInfo {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
