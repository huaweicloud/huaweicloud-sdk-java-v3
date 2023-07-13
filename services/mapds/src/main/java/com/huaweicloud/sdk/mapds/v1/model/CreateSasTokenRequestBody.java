package com.huaweicloud.sdk.mapds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateSasTokenRequestBody
 */
public class CreateSasTokenRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keytype")

    private String keytype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry")

    private String expiry;

    public CreateSasTokenRequestBody withKeytype(String keytype) {
        this.keytype = keytype;
        return this;
    }

    /**
     * 用于为用户生成令牌的密钥  取值为primary或者secondary  每个用户只有2个apikey，primary的原则就是对比apiKey时间最早的那个。  如果只有一个apikey，primary和secondary都指同一个apiKey
     * @return keytype
     */
    public String getKeytype() {
        return keytype;
    }

    public void setKeytype(String keytype) {
        this.keytype = keytype;
    }

    public CreateSasTokenRequestBody withExpiry(String expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * 令牌到期UTC时间，格式如：2019-04-21T00:44:24Z   日期符合以下格式： yyyy-MM-ddTHH:mm:ssZ 由 ISO 8601 标准指定。  最小值不小于15min，最大值不超过24h
     * @return expiry
     */
    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSasTokenRequestBody that = (CreateSasTokenRequestBody) obj;
        return Objects.equals(this.keytype, that.keytype) && Objects.equals(this.expiry, that.expiry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keytype, expiry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSasTokenRequestBody {\n");
        sb.append("    keytype: ").append(toIndentedString(keytype)).append("\n");
        sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
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
