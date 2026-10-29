package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 自定义参数。 **取值范围：** 不涉及。
 */
public class CustomParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isPrivate")

    private Boolean isPrivate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CustomParameter withIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * **参数解释：** 是否是私密参数。 **取值范围：** - true：私密参数。 - false：非私密参数。
     * @return isPrivate
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public CustomParameter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 自定义参数的key。 **取值范围：** 长度为[1~128]个字符。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CustomParameter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 自定义参数的Value。 **取值范围：** 长度为[1~8192]个字符。
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
        CustomParameter that = (CustomParameter) obj;
        return Objects.equals(this.isPrivate, that.isPrivate) && Objects.equals(this.key, that.key)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPrivate, key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomParameter {\n");
        sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
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
