package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业的运行参数。
 */
public class Parameters {

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
    @JsonProperty(value = "constraint")

    private ParametersConstraint constraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_description")

    private I18nDescription i18nDescription;

    public Parameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parameters withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Parameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Parameters withConstraint(ParametersConstraint constraint) {
        this.constraint = constraint;
        return this;
    }

    public Parameters withConstraint(Consumer<ParametersConstraint> constraintSetter) {
        if (this.constraint == null) {
            this.constraint = new ParametersConstraint();
            constraintSetter.accept(this.constraint);
        }

        return this;
    }

    /**
     * Get constraint
     * @return constraint
     */
    public ParametersConstraint getConstraint() {
        return constraint;
    }

    public void setConstraint(ParametersConstraint constraint) {
        this.constraint = constraint;
    }

    public Parameters withI18nDescription(I18nDescription i18nDescription) {
        this.i18nDescription = i18nDescription;
        return this;
    }

    public Parameters withI18nDescription(Consumer<I18nDescription> i18nDescriptionSetter) {
        if (this.i18nDescription == null) {
            this.i18nDescription = new I18nDescription();
            i18nDescriptionSetter.accept(this.i18nDescription);
        }

        return this;
    }

    /**
     * Get i18nDescription
     * @return i18nDescription
     */
    public I18nDescription getI18nDescription() {
        return i18nDescription;
    }

    public void setI18nDescription(I18nDescription i18nDescription) {
        this.i18nDescription = i18nDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Parameters that = (Parameters) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value)
            && Objects.equals(this.description, that.description) && Objects.equals(this.constraint, that.constraint)
            && Objects.equals(this.i18nDescription, that.i18nDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, description, constraint, i18nDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Parameters {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
        sb.append("    i18nDescription: ").append(toIndentedString(i18nDescription)).append("\n");
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
