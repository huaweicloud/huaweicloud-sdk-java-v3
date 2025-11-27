package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 集群资源标签 **取值范围**: 不涉及 
 */
public class WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**: 集群资源标签的键名 **取值范围**: 字符长度1-64位 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**: 集群资源标签的值 **取值范围**: 字符长度0-128位 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList that =
            (WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
