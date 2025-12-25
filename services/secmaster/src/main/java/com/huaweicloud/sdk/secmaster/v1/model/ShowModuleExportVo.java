package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowModuleExportVo
 */
public class ShowModuleExportVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<ShowModuleExportVo> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<ShowModuleFieldExportVo> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    public ShowModuleExportVo withChildren(List<ShowModuleExportVo> children) {
        this.children = children;
        return this;
    }

    public ShowModuleExportVo addChildrenItem(ShowModuleExportVo childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ShowModuleExportVo withChildren(Consumer<List<ShowModuleExportVo>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 相关描述信息
     * @return children
     */
    public List<ShowModuleExportVo> getChildren() {
        return children;
    }

    public void setChildren(List<ShowModuleExportVo> children) {
        this.children = children;
    }

    public ShowModuleExportVo withFields(List<ShowModuleFieldExportVo> fields) {
        this.fields = fields;
        return this;
    }

    public ShowModuleExportVo addFieldsItem(ShowModuleFieldExportVo fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowModuleExportVo withFields(Consumer<List<ShowModuleFieldExportVo>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 相关描述信息
     * @return fields
     */
    public List<ShowModuleFieldExportVo> getFields() {
        return fields;
    }

    public void setFields(List<ShowModuleFieldExportVo> fields) {
        this.fields = fields;
    }

    public ShowModuleExportVo withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * UUID
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public ShowModuleExportVo withName(String name) {
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

    public ShowModuleExportVo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * UUID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowModuleExportVo that = (ShowModuleExportVo) obj;
        return Objects.equals(this.children, that.children) && Objects.equals(this.fields, that.fields)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.templateId, that.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(children, fields, moduleId, name, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowModuleExportVo {\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
