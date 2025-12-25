package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateModuleVo
 */
public class CreateModuleVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<CreateModuleVo> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_module_id")

    private String connectionModuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<ModuleFieldVo> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    public CreateModuleVo withChildren(List<CreateModuleVo> children) {
        this.children = children;
        return this;
    }

    public CreateModuleVo addChildrenItem(CreateModuleVo childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public CreateModuleVo withChildren(Consumer<List<CreateModuleVo>> childrenSetter) {
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
    public List<CreateModuleVo> getChildren() {
        return children;
    }

    public void setChildren(List<CreateModuleVo> children) {
        this.children = children;
    }

    public CreateModuleVo withConnectionModuleId(String connectionModuleId) {
        this.connectionModuleId = connectionModuleId;
        return this;
    }

    /**
     * UUID
     * @return connectionModuleId
     */
    public String getConnectionModuleId() {
        return connectionModuleId;
    }

    public void setConnectionModuleId(String connectionModuleId) {
        this.connectionModuleId = connectionModuleId;
    }

    public CreateModuleVo withFields(List<ModuleFieldVo> fields) {
        this.fields = fields;
        return this;
    }

    public CreateModuleVo addFieldsItem(ModuleFieldVo fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public CreateModuleVo withFields(Consumer<List<ModuleFieldVo>> fieldsSetter) {
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
    public List<ModuleFieldVo> getFields() {
        return fields;
    }

    public void setFields(List<ModuleFieldVo> fields) {
        this.fields = fields;
    }

    public CreateModuleVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateModuleVo withTemplateId(String templateId) {
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
        CreateModuleVo that = (CreateModuleVo) obj;
        return Objects.equals(this.children, that.children)
            && Objects.equals(this.connectionModuleId, that.connectionModuleId)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.name, that.name)
            && Objects.equals(this.templateId, that.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(children, connectionModuleId, fields, name, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModuleVo {\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    connectionModuleId: ").append(toIndentedString(connectionModuleId)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
