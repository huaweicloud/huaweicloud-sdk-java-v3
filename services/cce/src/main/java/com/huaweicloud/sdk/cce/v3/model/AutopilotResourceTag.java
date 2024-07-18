package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CCE资源标签
 */
public class AutopilotResourceTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public AutopilotResourceTag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Key值。 - 不能为空，最多支持128个字符 - 可用UTF-8格式表示的汉字、字母、数字和空格 - 支持部分特殊字符：_.:/=+-@ - 不能以\"\\_sys\\_\"开头
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AutopilotResourceTag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Value值。 - 可以为空但不能缺省，最多支持255个字符 - 可用UTF-8格式表示的汉字、字母、数字和空格 - 支持部分特殊字符：_.:/=+-@
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
        AutopilotResourceTag that = (AutopilotResourceTag) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutopilotResourceTag {\n");
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
