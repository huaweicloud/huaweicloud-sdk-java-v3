package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HeaderParameter
 */
public class HeaderParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_value_secret")

    private Boolean isValueSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public HeaderParameter withIsValueSecret(Boolean isValueSecret) {
        this.isValueSecret = isValueSecret;
        return this;
    }

    /**
     * 是否加密
     * @return isValueSecret
     */
    public Boolean getIsValueSecret() {
        return isValueSecret;
    }

    public void setIsValueSecret(Boolean isValueSecret) {
        this.isValueSecret = isValueSecret;
    }

    public HeaderParameter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * header的key值
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public HeaderParameter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * deader的value值
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
        HeaderParameter that = (HeaderParameter) obj;
        return Objects.equals(this.isValueSecret, that.isValueSecret) && Objects.equals(this.key, that.key)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isValueSecret, key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HeaderParameter {\n");
        sb.append("    isValueSecret: ").append(toIndentedString(isValueSecret)).append("\n");
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
