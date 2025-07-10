package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模板的部署参数的变量。
 */
public class TemplateParamVariable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Object _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nullable")

    private Boolean nullable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive")

    private Boolean sensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validations")

    private List<TemplateParamVariableValidation> validations = null;

    public TemplateParamVariable withDefault(Object _default) {
        this._default = _default;
        return this;
    }

    /**
     * 变量默认值。
     * @return _default
     */
    public Object getDefault() {
        return _default;
    }

    public void setDefault(Object _default) {
        this._default = _default;
    }

    public TemplateParamVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 变量名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateParamVariable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 变量描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateParamVariable withNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    /**
     * 变量是否可以为空。
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public TemplateParamVariable withSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * 变量是否为敏感字段。
     * @return sensitive
     */
    public Boolean getSensitive() {
        return sensitive;
    }

    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    public TemplateParamVariable withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 变量类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TemplateParamVariable withValidations(List<TemplateParamVariableValidation> validations) {
        this.validations = validations;
        return this;
    }

    public TemplateParamVariable addValidationsItem(TemplateParamVariableValidation validationsItem) {
        if (this.validations == null) {
            this.validations = new ArrayList<>();
        }
        this.validations.add(validationsItem);
        return this;
    }

    public TemplateParamVariable withValidations(Consumer<List<TemplateParamVariableValidation>> validationsSetter) {
        if (this.validations == null) {
            this.validations = new ArrayList<>();
        }
        validationsSetter.accept(this.validations);
        return this;
    }

    /**
     * Get validations
     * @return validations
     */
    public List<TemplateParamVariableValidation> getValidations() {
        return validations;
    }

    public void setValidations(List<TemplateParamVariableValidation> validations) {
        this.validations = validations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateParamVariable that = (TemplateParamVariable) obj;
        return Objects.equals(this._default, that._default) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.nullable, that.nullable)
            && Objects.equals(this.sensitive, that.sensitive) && Objects.equals(this.type, that.type)
            && Objects.equals(this.validations, that.validations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_default, name, description, nullable, sensitive, type, validations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateParamVariable {\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
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
