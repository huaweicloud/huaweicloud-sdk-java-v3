package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TagRef
 */
public class TagRef {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    private Object tagKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value")

    private Object tagValue;

    public TagRef withTagKey(Object tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * **参数说明**：标签键名称，可以是一个明确的静态字符串，也可以是动态的模板参数引用 - 明确的静态字符串：\"myTagKey\"。**取值范围**：长度不超过64，只允许中文、字母、数字、以及_.-等字符的组合 - 参数引用: {\"ref\" : \"iotda::certificate::country\"}
     * @return tagKey
     */
    public Object getTagKey() {
        return tagKey;
    }

    public void setTagKey(Object tagKey) {
        this.tagKey = tagKey;
    }

    public TagRef withTagValue(Object tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * **参数说明**：标签值，可以是一个明确的静态字符串，也可以是动态的模板参数引用 - 明确的静态字符串：\"myTagValue\"。**取值范围**：长度不超过128，只允许中文、字母、数字、以及_.-等字符的组合。 - 参数引用: {\"ref\" : \"iotda::certificate::country\"}
     * @return tagValue
     */
    public Object getTagValue() {
        return tagValue;
    }

    public void setTagValue(Object tagValue) {
        this.tagValue = tagValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TagRef that = (TagRef) obj;
        return Objects.equals(this.tagKey, that.tagKey) && Objects.equals(this.tagValue, that.tagValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagKey, tagValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagRef {\n");
        sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
        sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
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
