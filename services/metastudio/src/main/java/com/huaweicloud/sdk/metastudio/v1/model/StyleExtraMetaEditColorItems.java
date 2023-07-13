package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StyleExtraMetaEditColorItems
 */
public class StyleExtraMetaEditColorItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_value")

    private List<Float> minValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private List<Float> maxValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private Map<String, String> label = null;

    public StyleExtraMetaEditColorItems withMinValue(List<Float> minValue) {
        this.minValue = minValue;
        return this;
    }

    public StyleExtraMetaEditColorItems addMinValueItem(Float minValueItem) {
        if (this.minValue == null) {
            this.minValue = new ArrayList<>();
        }
        this.minValue.add(minValueItem);
        return this;
    }

    public StyleExtraMetaEditColorItems withMinValue(Consumer<List<Float>> minValueSetter) {
        if (this.minValue == null) {
            this.minValue = new ArrayList<>();
        }
        minValueSetter.accept(this.minValue);
        return this;
    }

    /**
     * 最小值
     * @return minValue
     */
    public List<Float> getMinValue() {
        return minValue;
    }

    public void setMinValue(List<Float> minValue) {
        this.minValue = minValue;
    }

    public StyleExtraMetaEditColorItems withMaxValue(List<Float> maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    public StyleExtraMetaEditColorItems addMaxValueItem(Float maxValueItem) {
        if (this.maxValue == null) {
            this.maxValue = new ArrayList<>();
        }
        this.maxValue.add(maxValueItem);
        return this;
    }

    public StyleExtraMetaEditColorItems withMaxValue(Consumer<List<Float>> maxValueSetter) {
        if (this.maxValue == null) {
            this.maxValue = new ArrayList<>();
        }
        maxValueSetter.accept(this.maxValue);
        return this;
    }

    /**
     * 最大值
     * @return maxValue
     */
    public List<Float> getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(List<Float> maxValue) {
        this.maxValue = maxValue;
    }

    public StyleExtraMetaEditColorItems withLabel(Map<String, String> label) {
        this.label = label;
        return this;
    }

    public StyleExtraMetaEditColorItems putLabelItem(String key, String labelItem) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        this.label.put(key, labelItem);
        return this;
    }

    public StyleExtraMetaEditColorItems withLabel(Consumer<Map<String, String>> labelSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StyleExtraMetaEditColorItems that = (StyleExtraMetaEditColorItems) obj;
        return Objects.equals(this.minValue, that.minValue) && Objects.equals(this.maxValue, that.maxValue)
            && Objects.equals(this.label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minValue, maxValue, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StyleExtraMetaEditColorItems {\n");
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
