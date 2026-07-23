package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 具体字段的存储值及其元信息。 **取值范围：** 不涉及。
 */
public class OpsFieldValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    public OpsFieldValue withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 字段的数据类型。 **取值范围：** 如 string, integer, float 等。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OpsFieldValue withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * **参数解释：** 内容展示类型。 **取值范围：** 如 text, markdown, image 等。
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public OpsFieldValue withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 字段承载的实际业务数据。 **取值范围：** 根据type字段确定具体数据类型和格式。
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
        OpsFieldValue that = (OpsFieldValue) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.contentType, that.contentType)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, contentType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFieldValue {\n");
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
