package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 指标详情。 **取值范围**： 不涉及。
 */
public class ClusterMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<SimpleFieldDto> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_rate")

    private Integer collectRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_range")

    private List<String> collectRange = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public ClusterMetric withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释**： 指标名称。 **取值范围**： 不涉及。
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ClusterMetric withFields(List<SimpleFieldDto> fields) {
        this.fields = fields;
        return this;
    }

    public ClusterMetric addFieldsItem(SimpleFieldDto fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ClusterMetric withFields(Consumer<List<SimpleFieldDto>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * **参数解释**： 指标表相关字段信息。 **取值范围**： 不涉及。
     * @return fields
     */
    public List<SimpleFieldDto> getFields() {
        return fields;
    }

    public void setFields(List<SimpleFieldDto> fields) {
        this.fields = fields;
    }

    public ClusterMetric withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释**： 作用域。 **取值范围**： 不涉及。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ClusterMetric withCollectRate(Integer collectRate) {
        this.collectRate = collectRate;
        return this;
    }

    /**
     * **参数解释**： 采集速率。 **取值范围**： 不涉及。
     * @return collectRate
     */
    public Integer getCollectRate() {
        return collectRate;
    }

    public void setCollectRate(Integer collectRate) {
        this.collectRate = collectRate;
    }

    public ClusterMetric withCollectRange(List<String> collectRange) {
        this.collectRange = collectRange;
        return this;
    }

    public ClusterMetric addCollectRangeItem(String collectRangeItem) {
        if (this.collectRange == null) {
            this.collectRange = new ArrayList<>();
        }
        this.collectRange.add(collectRangeItem);
        return this;
    }

    public ClusterMetric withCollectRange(Consumer<List<String>> collectRangeSetter) {
        if (this.collectRange == null) {
            this.collectRange = new ArrayList<>();
        }
        collectRangeSetter.accept(this.collectRange);
        return this;
    }

    /**
     * **参数解释**： 采集时间范围。 **取值范围**： 不涉及。
     * @return collectRange
     */
    public List<String> getCollectRange() {
        return collectRange;
    }

    public void setCollectRange(List<String> collectRange) {
        this.collectRange = collectRange;
    }

    public ClusterMetric withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterMetric that = (ClusterMetric) obj;
        return Objects.equals(this.scope, that.scope) && Objects.equals(this.fields, that.fields)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.collectRate, that.collectRate)
            && Objects.equals(this.collectRange, that.collectRange) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, fields, metricName, collectRate, collectRange, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterMetric {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    collectRate: ").append(toIndentedString(collectRate)).append("\n");
        sb.append("    collectRange: ").append(toIndentedString(collectRange)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
