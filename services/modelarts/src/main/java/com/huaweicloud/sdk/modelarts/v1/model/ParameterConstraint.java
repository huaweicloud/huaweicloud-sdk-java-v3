package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 参数属性。
 */
public class ParameterConstraint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editable")

    private Boolean editable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive")

    private Boolean sensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_type")

    private String validType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_range")

    private List<String> validRange = null;

    public ParameterConstraint withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 参数种类。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ParameterConstraint withEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * 是否可编辑。
     * @return editable
     */
    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public ParameterConstraint withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 是否必须。
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public ParameterConstraint withSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * 是否敏感。该功能暂未实现。
     * @return sensitive
     */
    public Boolean getSensitive() {
        return sensitive;
    }

    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    public ParameterConstraint withValidType(String validType) {
        this.validType = validType;
        return this;
    }

    /**
     * 有效种类。
     * @return validType
     */
    public String getValidType() {
        return validType;
    }

    public void setValidType(String validType) {
        this.validType = validType;
    }

    public ParameterConstraint withValidRange(List<String> validRange) {
        this.validRange = validRange;
        return this;
    }

    public ParameterConstraint addValidRangeItem(String validRangeItem) {
        if (this.validRange == null) {
            this.validRange = new ArrayList<>();
        }
        this.validRange.add(validRangeItem);
        return this;
    }

    public ParameterConstraint withValidRange(Consumer<List<String>> validRangeSetter) {
        if (this.validRange == null) {
            this.validRange = new ArrayList<>();
        }
        validRangeSetter.accept(this.validRange);
        return this;
    }

    /**
     * 有效范围。
     * @return validRange
     */
    public List<String> getValidRange() {
        return validRange;
    }

    public void setValidRange(List<String> validRange) {
        this.validRange = validRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParameterConstraint that = (ParameterConstraint) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.editable, that.editable)
            && Objects.equals(this.required, that.required) && Objects.equals(this.sensitive, that.sensitive)
            && Objects.equals(this.validType, that.validType) && Objects.equals(this.validRange, that.validRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, editable, required, sensitive, validType, validRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterConstraint {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
        sb.append("    validType: ").append(toIndentedString(validType)).append("\n");
        sb.append("    validRange: ").append(toIndentedString(validRange)).append("\n");
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
