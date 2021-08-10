package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 指标分子过滤条件 */
public class MetricRequestV2Dividend {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    private List<MetricRequestV2DividendCustomFields> customFields = null;

    public MetricRequestV2Dividend withCustomFields(List<MetricRequestV2DividendCustomFields> customFields) {
        this.customFields = customFields;
        return this;
    }

    public MetricRequestV2Dividend addCustomFieldsItem(MetricRequestV2DividendCustomFields customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public MetricRequestV2Dividend withCustomFields(
        Consumer<List<MetricRequestV2DividendCustomFields>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /** 自定义类型过滤条件
     * 
     * @return customFields */
    public List<MetricRequestV2DividendCustomFields> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<MetricRequestV2DividendCustomFields> customFields) {
        this.customFields = customFields;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricRequestV2Dividend metricRequestV2Dividend = (MetricRequestV2Dividend) o;
        return Objects.equals(this.customFields, metricRequestV2Dividend.customFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricRequestV2Dividend {\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
