package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 标签字段信息
 */
public class TagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public TagsRequestBody withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 标签键。 **约束限制：** - 标签键名称不可重复。 - 标签是以键值对（key-value）的形式表示，key和value为一一对应关系。 **取值范围：** 标签键可以包含任意语种的字母、数字和空格，以及_.:=+-@字符，但首尾不能包含空格，且不能以_sys_开头；长度不能超过128个字符。 **默认取值：** 不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TagsRequestBody withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 标签值。 **约束限制：** 标签是以键值对（key-value）的形式表示，key和value为一一对应关系。 **取值范围：** - 标签值可以包含任意语种的字母、数字和空格，以及_.:=+-@字符。 - 标签值长度不能超过255个字符。 **默认取值：** 不涉及。
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
        TagsRequestBody that = (TagsRequestBody) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagsRequestBody {\n");
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
