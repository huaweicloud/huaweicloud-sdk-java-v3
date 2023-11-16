package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LicensePropertyRules
 */
public class LicensePropertyRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "predicate")

    private String predicate;

    public LicensePropertyRules withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public LicensePropertyRules addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public LicensePropertyRules withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * license详情
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public LicensePropertyRules withPredicate(String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     * 比较规则
     * @return predicate
     */
    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LicensePropertyRules that = (LicensePropertyRules) obj;
        return Objects.equals(this.values, that.values) && Objects.equals(this.predicate, that.predicate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values, predicate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LicensePropertyRules {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
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
