package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：资源池指标信息。 
 */
public class ComputeResourceMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_time")

    private Integer collectionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<ComputeMetric> values = null;

    public ComputeResourceMetrics withCollectionTime(Integer collectionTime) {
        this.collectionTime = collectionTime;
        return this;
    }

    /**
     * **参数解释**：数据时间（秒）。 **取值范围**：0~2147483647。 
     * @return collectionTime
     */
    public Integer getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Integer collectionTime) {
        this.collectionTime = collectionTime;
    }

    public ComputeResourceMetrics withValues(List<ComputeMetric> values) {
        this.values = values;
        return this;
    }

    public ComputeResourceMetrics addValuesItem(ComputeMetric valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ComputeResourceMetrics withValues(Consumer<List<ComputeMetric>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * **参数解释**：资源池指标值列表，列表元素为资源池指标信息对象。 
     * @return values
     */
    public List<ComputeMetric> getValues() {
        return values;
    }

    public void setValues(List<ComputeMetric> values) {
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
        ComputeResourceMetrics that = (ComputeResourceMetrics) obj;
        return Objects.equals(this.collectionTime, that.collectionTime) && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectionTime, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputeResourceMetrics {\n");
        sb.append("    collectionTime: ").append(toIndentedString(collectionTime)).append("\n");
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
