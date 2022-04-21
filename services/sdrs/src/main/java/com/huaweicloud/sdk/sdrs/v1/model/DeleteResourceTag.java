package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 删除单个标签资源结构
 */
public class DeleteResourceTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public DeleteResourceTag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键。同一资源的key值不能重复。最大长度为36个UNICODE字符。key不能为空，不允许为空字符串。不能包含以下字符：非打印字符ASCII(0-31)特殊字符“*”,“<”,“>”,“\\”,“=”,“,”,“|”,“/”键。不能为空。对于同一资源键值唯一。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DeleteResourceTag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值。最大长度为43个UNICODE字符。删除时如果value有值按照key/value删除，如果value没值，则按照key删除。当value存在时，不能为空，可以为空字符串。不能包含以下字符：非打印字符ASCII(0-31)特殊字符“*”,“<”,“>”,“\\”,“=”,“,”,“|”,“/”。长度不超过43个字符。  
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
        DeleteResourceTag deleteResourceTag = (DeleteResourceTag) o;
        return Objects.equals(this.key, deleteResourceTag.key) && Objects.equals(this.value, deleteResourceTag.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteResourceTag {\n");
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
