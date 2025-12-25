package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConnectionModuleFieldShowVo
 */
public class ConnectionModuleFieldShowVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_id")

    private String fieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_field_id")

    private String templateFieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public ConnectionModuleFieldShowVo withFieldId(String fieldId) {
        this.fieldId = fieldId;
        return this;
    }

    /**
     * UUID
     * @return fieldId
     */
    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public ConnectionModuleFieldShowVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 所属租户名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectionModuleFieldShowVo withTemplateFieldId(String templateFieldId) {
        this.templateFieldId = templateFieldId;
        return this;
    }

    /**
     * UUID
     * @return templateFieldId
     */
    public String getTemplateFieldId() {
        return templateFieldId;
    }

    public void setTemplateFieldId(String templateFieldId) {
        this.templateFieldId = templateFieldId;
    }

    public ConnectionModuleFieldShowVo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * value的数据类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConnectionModuleFieldShowVo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 相关值
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
        ConnectionModuleFieldShowVo that = (ConnectionModuleFieldShowVo) obj;
        return Objects.equals(this.fieldId, that.fieldId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.templateFieldId, that.templateFieldId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldId, name, templateFieldId, type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionModuleFieldShowVo {\n");
        sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    templateFieldId: ").append(toIndentedString(templateFieldId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
