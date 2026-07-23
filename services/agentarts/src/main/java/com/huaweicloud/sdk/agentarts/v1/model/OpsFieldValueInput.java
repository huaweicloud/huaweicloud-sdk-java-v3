package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 单个字段的具体键值对及元信息。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class OpsFieldValueInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public OpsFieldValueInput withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 字段的键名，需与评测集Schema中定义的字段名保持一致。 **约束限制：** 字符串长度为0到10000个字符。 **取值范围：** 符合Schema定义的Key字符串。 **默认取值：** 不涉及。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public OpsFieldValueInput withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 字段的数据存储类型，决定系统底层解析逻辑。 **约束限制：** 长度0到10000字符。 **取值范围：** 常见值如 string, integer, float, boolean, object 等。 **默认取值：** 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OpsFieldValueInput withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * **参数解释：** 字段的内容表现形式，用于前端渲染或后端逻辑识别。 **约束限制：** 长度0到10000字符。 **取值范围：** 常见值如 text, markdown, image_url, file_path 等。 **默认取值：** text。 
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public OpsFieldValueInput withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 字段承载的实际业务数据值。 **约束限制：** 长度0到10000字符。 **取值范围：** 根据type定义，需符合对应的解析要求。 **默认取值：** 不涉及。 
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
        OpsFieldValueInput that = (OpsFieldValueInput) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.type, that.type)
            && Objects.equals(this.contentType, that.contentType) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, type, contentType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFieldValueInput {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
