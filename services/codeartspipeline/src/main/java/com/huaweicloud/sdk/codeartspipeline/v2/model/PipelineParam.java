package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 流水线参数 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
 */
public class PipelineParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type")

    private String paramType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_static")

    private Boolean isStatic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    public PipelineParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 流水线参数名字 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineParam withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 流水线参数值 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PipelineParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 流水线参数描述 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PipelineParam withParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }

    /**
     * **参数解释**： 流水线参数类型 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return paramType
     */
    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public PipelineParam withIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
        return this;
    }

    /**
     * **参数解释**： 是否静态参数。 **约束限制**： 不涉及。 **取值范围**： - true：是静态参数。 - false：不是静态参数。 **默认取值**： 不涉及。 
     * @return isStatic
     */
    public Boolean getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
    }

    public PipelineParam withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * **参数解释**： 是否默认参数。 **约束限制**： 不涉及。 **取值范围**： - true：是默认参数。 - false：不是默认参数。 **默认取值**： 不涉及。 
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineParam that = (PipelineParam) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value)
            && Objects.equals(this.description, that.description) && Objects.equals(this.paramType, that.paramType)
            && Objects.equals(this.isStatic, that.isStatic) && Objects.equals(this.isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, description, paramType, isStatic, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
        sb.append("    isStatic: ").append(toIndentedString(isStatic)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
