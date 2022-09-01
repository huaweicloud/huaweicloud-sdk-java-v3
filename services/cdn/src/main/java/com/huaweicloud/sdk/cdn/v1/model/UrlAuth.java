package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * URL鉴权
 */
public class UrlAuth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_format")

    @JacksonXmlProperty(localName = "time_format")

    private String timeFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    @JacksonXmlProperty(localName = "expire_time")

    private Integer expireTime;

    public UrlAuth withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * A/B/C类防盗链开关（\"off\"/\"on\"）。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UrlAuth withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 鉴权方式 type_a：鉴权方式A type_b：鉴权方式B type_c1：鉴权方式C1 type_c2：鉴权方式C2
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UrlAuth withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 鉴权密钥由6 - 32位大小写字母、数字构成。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UrlAuth withTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * 时间格式 dec：十进制 hex：十六进制 鉴权方式A：只支持十进制 鉴权方式B：只支持十进制 鉴权方式C1：只支持十六进制鉴权方式 鉴权方式C2：支持十进制/十六进制
     * @return timeFormat
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public UrlAuth withExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间：范围：0-31536000单位为秒。
     * @return expireTime
     */
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
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
        UrlAuth urlAuth = (UrlAuth) o;
        return Objects.equals(this.status, urlAuth.status) && Objects.equals(this.type, urlAuth.type)
            && Objects.equals(this.key, urlAuth.key) && Objects.equals(this.timeFormat, urlAuth.timeFormat)
            && Objects.equals(this.expireTime, urlAuth.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, key, timeFormat, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlAuth {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
