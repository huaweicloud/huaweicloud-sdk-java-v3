package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 标签结构体。
 */
public class TagV5DTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    @JacksonXmlProperty(localName = "tag_key")

    private String tagKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value")

    @JacksonXmlProperty(localName = "tag_value")

    private String tagValue;

    public TagV5DTO withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * **参数说明**：标签键，在同一资源下标签键唯一。绑定资源时，如果设置的键已存在，则将覆盖之前的标签值。如果设置的键值不存在，则新增标签。 **取值范围**：长度不超过64，只允许中文、字母、数字、以及_.-等字符的组合。
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public TagV5DTO withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * **参数说明**：标签值。 **取值范围**：长度不超过128，只允许中文、字母、数字、以及_.-等字符的组合。
     * @return tagValue
     */
    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagV5DTO tagV5DTO = (TagV5DTO) o;
        return Objects.equals(this.tagKey, tagV5DTO.tagKey) && Objects.equals(this.tagValue, tagV5DTO.tagValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagKey, tagValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagV5DTO {\n");
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
