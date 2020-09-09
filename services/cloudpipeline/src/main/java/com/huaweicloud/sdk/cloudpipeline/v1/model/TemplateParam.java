package com.huaweicloud.sdk.cloudpipeline.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v1.model.Constraint;
import com.huaweicloud.sdk.cloudpipeline.v1.model.ParamTypeLimits;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 流水线参数
 */
public class TemplateParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="required")
    
    private String required;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="visible")
    
    private String visible;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paramtype")
    
    private String paramtype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_type")
    
    private String displayType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_static")
    
    private Boolean isStatic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_default")
    
    private Boolean isDefault;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limits")
    
    private ParamTypeLimits limits = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="constraints")
    
    private Constraint constraints = null;

    public TemplateParam withRequired(String required) {
        this.required = required;
        return this;
    }

    


    /**
     * 是否必须
     * @return required
     */
    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public TemplateParam withVisible(String visible) {
        this.visible = visible;
        return this;
    }

    


    /**
     * 是否可见
     * @return visible
     */
    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public TemplateParam withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 流水线参数名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateParam withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 流水线参数值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TemplateParam withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 流水线参数描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateParam withParamtype(String paramtype) {
        this.paramtype = paramtype;
        return this;
    }

    


    /**
     * 流水线参数类型
     * @return paramtype
     */
    public String getParamtype() {
        return paramtype;
    }

    public void setParamtype(String paramtype) {
        this.paramtype = paramtype;
    }

    public TemplateParam withDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }

    


    /**
     * 流水线参数展示类型
     * @return displayType
     */
    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public TemplateParam withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 流水线参数展示名字
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TemplateParam withIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
        return this;
    }

    


    /**
     * 是否静态参数
     * @return isStatic
     */
    public Boolean getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
    }

    public TemplateParam withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    


    /**
     * 是否默认参数
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public TemplateParam withLimits(ParamTypeLimits limits) {
        this.limits = limits;
        return this;
    }

    public TemplateParam withLimits(Consumer<ParamTypeLimits> limitsSetter) {
        if(this.limits == null ){
            this.limits = new ParamTypeLimits();
            limitsSetter.accept(this.limits);
        }
        
        return this;
    }


    /**
     * Get limits
     * @return limits
     */
    public ParamTypeLimits getLimits() {
        return limits;
    }

    public void setLimits(ParamTypeLimits limits) {
        this.limits = limits;
    }

    public TemplateParam withConstraints(Constraint constraints) {
        this.constraints = constraints;
        return this;
    }

    public TemplateParam withConstraints(Consumer<Constraint> constraintsSetter) {
        if(this.constraints == null ){
            this.constraints = new Constraint();
            constraintsSetter.accept(this.constraints);
        }
        
        return this;
    }


    /**
     * Get constraints
     * @return constraints
     */
    public Constraint getConstraints() {
        return constraints;
    }

    public void setConstraints(Constraint constraints) {
        this.constraints = constraints;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateParam templateParam = (TemplateParam) o;
        return Objects.equals(this.required, templateParam.required) &&
            Objects.equals(this.visible, templateParam.visible) &&
            Objects.equals(this.name, templateParam.name) &&
            Objects.equals(this.value, templateParam.value) &&
            Objects.equals(this.description, templateParam.description) &&
            Objects.equals(this.paramtype, templateParam.paramtype) &&
            Objects.equals(this.displayType, templateParam.displayType) &&
            Objects.equals(this.displayName, templateParam.displayName) &&
            Objects.equals(this.isStatic, templateParam.isStatic) &&
            Objects.equals(this.isDefault, templateParam.isDefault) &&
            Objects.equals(this.limits, templateParam.limits) &&
            Objects.equals(this.constraints, templateParam.constraints);
    }
    @Override
    public int hashCode() {
        return Objects.hash(required, visible, name, value, description, paramtype, displayType, displayName, isStatic, isDefault, limits, constraints);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateParam {\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    paramtype: ").append(toIndentedString(paramtype)).append("\n");
        sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    isStatic: ").append(toIndentedString(isStatic)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

