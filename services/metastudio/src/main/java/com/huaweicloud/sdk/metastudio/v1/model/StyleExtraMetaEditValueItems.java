package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StyleExtraMetaEditValueItems
 */
public class StyleExtraMetaEditValueItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_value")

    private Float minValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private Float maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private Map<String, String> label = null;

    public StyleExtraMetaEditValueItems withMinValue(Float minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * 最小值
     * @return minValue
     */
    public Float getMinValue() {
        return minValue;
    }

    public void setMinValue(Float minValue) {
        this.minValue = minValue;
    }

    public StyleExtraMetaEditValueItems withMaxValue(Float maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * 最大值
     * @return maxValue
     */
    public Float getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Float maxValue) {
        this.maxValue = maxValue;
    }

    public StyleExtraMetaEditValueItems withLabel(Map<String, String> label) {
        this.label = label;
        return this;
    }

    public StyleExtraMetaEditValueItems putLabelItem(String key, String labelItem) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        this.label.put(key, labelItem);
        return this;
    }

    public StyleExtraMetaEditValueItems withLabel(Consumer<Map<String, String>> labelSetter) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        labelSetter.accept(this.label);
        return this;
    }

    /**
     * 展示标签 {\"cn\": \"xxxxx\",\"en\":\"xxxxx\"}
     * @return label
     */
    public Map<String, String> getLabel() {
        return label;
    }

    public void setLabel(Map<String, String> label) {
        this.label = label;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StyleExtraMetaEditValueItems styleExtraMetaEditValueItems = (StyleExtraMetaEditValueItems) o;
        return Objects.equals(this.minValue, styleExtraMetaEditValueItems.minValue)
            && Objects.equals(this.maxValue, styleExtraMetaEditValueItems.maxValue)
            && Objects.equals(this.label, styleExtraMetaEditValueItems.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minValue, maxValue, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StyleExtraMetaEditValueItems {\n");
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
