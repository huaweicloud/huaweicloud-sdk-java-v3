package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 自定义标签信息。  **取值范围**： 不涉及。
 */
public class InlineResponse2001SamlProviderTags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    private String tagKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value")

    private String tagValue;

    public InlineResponse2001SamlProviderTags withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * **参数解释**： 标签键。  **取值范围**： 字符串长度在 1 到 64 之间，可以包含任意语种字母、数字、空格以及\"_\"、\".\"、\":\"、\"=\"、\"+\"、\"-\"、\"@\"符号；首尾不能包含空格，且不能以\"_sys_\"开头。
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public InlineResponse2001SamlProviderTags withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * **参数解释**： 标签值。  **取值范围**： 字符串长度在 0 到 128 之间，可以包含任意语种字母、数字、空格以及\"_\"、\".\"、\":\"、\"/\"、\"=\"、\"+\"、\"-\"、\"@\"符号，可以为空字符串。
     * @return tagValue
     */
    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
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
        InlineResponse2001SamlProviderTags that = (InlineResponse2001SamlProviderTags) obj;
        return Objects.equals(this.tagKey, that.tagKey) && Objects.equals(this.tagValue, that.tagValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagKey, tagValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2001SamlProviderTags {\n");
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
