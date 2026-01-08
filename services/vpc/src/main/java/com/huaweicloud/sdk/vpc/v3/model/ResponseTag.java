package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResponseTag
 */
public class ResponseTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public ResponseTag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**： 标签键。 **取值范围**：   - 最大长度128个unicode字符， key不能为空。   - 同一资源的key不能重复。   - 可以包含的字符范围：  - 英文字母     - 数字     - 特殊字符：下划线（_）、点（.）、冒号（:）、加号（+）、中划线（-）、等号（=）     - 中文字符
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ResponseTag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 标签值。 **取值范围**：   - 每个值最大长度255个unicode字符，value可以为空。   - 可以包含的字符范围：  - 英文字母     - 数字     - 特殊字符：下划线（_）、点（.）、冒号（:）、加号（+）、中划线（-）、等号（=）     - 中文字符
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
        ResponseTag that = (ResponseTag) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseTag {\n");
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
