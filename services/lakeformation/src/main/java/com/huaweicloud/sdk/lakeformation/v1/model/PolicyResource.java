package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicyResource
 */
public class PolicyResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_excludes")

    private Boolean isExcludes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_recursive")

    private Boolean isRecursive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    public PolicyResource withIsExcludes(Boolean isExcludes) {
        this.isExcludes = isExcludes;
        return this;
    }

    /**
     * 是否排除
     * @return isExcludes
     */
    public Boolean getIsExcludes() {
        return isExcludes;
    }

    public void setIsExcludes(Boolean isExcludes) {
        this.isExcludes = isExcludes;
    }

    public PolicyResource withIsRecursive(Boolean isRecursive) {
        this.isRecursive = isRecursive;
        return this;
    }

    /**
     * 是否递归
     * @return isRecursive
     */
    public Boolean getIsRecursive() {
        return isRecursive;
    }

    public void setIsRecursive(Boolean isRecursive) {
        this.isRecursive = isRecursive;
    }

    public PolicyResource withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public PolicyResource addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public PolicyResource withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 值
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyResource that = (PolicyResource) obj;
        return Objects.equals(this.isExcludes, that.isExcludes) && Objects.equals(this.isRecursive, that.isRecursive)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isExcludes, isRecursive, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyResource {\n");
        sb.append("    isExcludes: ").append(toIndentedString(isExcludes)).append("\n");
        sb.append("    isRecursive: ").append(toIndentedString(isRecursive)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
