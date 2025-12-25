package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowModuleFieldExportVo
 */
public class ShowModuleFieldExportVo {

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

    public ShowModuleFieldExportVo withName(String name) {
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

    public ShowModuleFieldExportVo withTemplateFieldId(String templateFieldId) {
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

    public ShowModuleFieldExportVo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowModuleFieldExportVo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值
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
        ShowModuleFieldExportVo that = (ShowModuleFieldExportVo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.templateFieldId, that.templateFieldId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, templateFieldId, type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowModuleFieldExportVo {\n");
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
