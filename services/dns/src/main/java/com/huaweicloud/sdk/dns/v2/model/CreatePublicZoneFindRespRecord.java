package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreatePublicZoneFindRespRecord
 */
public class CreatePublicZoneFindRespRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CreatePublicZoneFindRespRecord withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 找回记录host名称。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public CreatePublicZoneFindRespRecord withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 找回记录解析值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePublicZoneFindRespRecord createPublicZoneFindRespRecord = (CreatePublicZoneFindRespRecord) o;
        return Objects.equals(this.host, createPublicZoneFindRespRecord.host)
            && Objects.equals(this.value, createPublicZoneFindRespRecord.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicZoneFindRespRecord {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
