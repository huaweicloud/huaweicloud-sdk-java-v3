package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户自定义属性
 */
public class UserPropDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_key")

    private String propKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_value")

    private String propValue;

    public UserPropDTO withPropKey(String propKey) {
        this.propKey = propKey;
        return this;
    }

    /**
     * **参数说明**：用户自定义属性键。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return propKey
     */
    public String getPropKey() {
        return propKey;
    }

    public void setPropKey(String propKey) {
        this.propKey = propKey;
    }

    public UserPropDTO withPropValue(String propValue) {
        this.propValue = propValue;
        return this;
    }

    /**
     * **参数说明**：用户自定义属性值。 **取值范围**：长度不超过128，只允许中文、字母、数字、以及_? '#().,&%@!-等字符的组合。
     * @return propValue
     */
    public String getPropValue() {
        return propValue;
    }

    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserPropDTO userPropDTO = (UserPropDTO) o;
        return Objects.equals(this.propKey, userPropDTO.propKey)
            && Objects.equals(this.propValue, userPropDTO.propValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propKey, propValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPropDTO {\n");
        sb.append("    propKey: ").append(toIndentedString(propKey)).append("\n");
        sb.append("    propValue: ").append(toIndentedString(propValue)).append("\n");
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
